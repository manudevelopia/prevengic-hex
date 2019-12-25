package info.developia.prevengic.mapper

import info.developia.prevengic.model.Compose
import org.apache.ibatis.annotations.*

@Mapper
interface ComposeMapper {

    @Select("SELECT * FROM prevengic.composes")
    @Results([
            @Result(property = "chemicalProfile",
                    column = "chemical_profile_id",
                    one = @One(select = "info.developia.prevengic.mapper.ChemicalProfileMapper.getChemicalProfileById")),
            @Result(property = "notes",
                    column = "id",
                    many = @Many(select = "info.developia.prevengic.mapper.NoteMapper.getNotesById"))
    ])
    List<Compose> getAll()

    @Select("SELECT * FROM prevengic.composes WHERE ncas=#{ncas}")
    @Results([
            @Result(property = "chemicalProfile",
                    column = "chemical_profile_id",
                    one = @One(select = "info.developia.prevengic.mapper.ChemicalProfileMapper.getChemicalProfileById")),
            @Result(property = "notes",
                    column = "id",
                    many = @Many(select = "info.developia.prevengic.mapper.NoteMapper.getNotesById"))
    ])
    Optional<Compose> getByNcas(String ncas)

    @Insert("INSERT INTO prevengic.composes (name, ncas) VALUES (#{name}, #{ncas})")
    Integer save(Compose compose)

}
