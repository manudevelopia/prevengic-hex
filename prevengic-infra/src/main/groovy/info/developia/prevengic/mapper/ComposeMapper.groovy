package info.developia.prevengic.mapper

import info.developia.prevengic.model.ChemicalProfile
import info.developia.prevengic.model.Compose
import info.developia.prevengic.model.Note
import org.apache.ibatis.annotations.*

@Mapper
interface ComposeMapper {

    @Select("SELECT * FROM prevengic.composes")
    List<Compose> getAll()

    @Select("SELECT * FROM prevengic.composes WHERE ncas=#{ncas}")
    @Results([
            @Result(property = "chemicalProfile", column = "chemical_profile_id", one = @One(select = "getChemicalProfileById")),
            @Result(property = "notes", column = "id", many = @Many(select = "getNotesById"))
    ])
    Optional<Compose> getByNcas(String ncas)

    @Select("SELECT * FROM prevengic.chemical_profile WHERE id=#{id}")
    @Results([
            @Result(property = "vlaEd", column = "vla_ed"),
            @Result(property = "vlaEc", column = "vla_ec")
    ])
    ChemicalProfile getChemicalProfileById(Long id)

    @Insert("INSERT INTO prevengic.composes (name, ncas) VALUES (#{name}, #{ncas})")
    Integer save(Compose compose)

    @Select("SELECT notes.name AS name, notes.description AS description \
             FROM prevengic.composes \
             INNER JOIN prevengic.compose_note ON composes.id = compose_note.compose_id \
             INNER JOIN prevengic.notes ON compose_note.note_id = notes.id \
             WHERE composes.id = #{id}")
    List<Note> getNotesById(Long id)

}
