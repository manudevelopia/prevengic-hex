package info.developia.prevengic.mapper

import info.developia.prevengic.model.Compose
import org.apache.ibatis.annotations.*

@Mapper
interface ComposeMapper {
    @Select("SELECT * FROM lep.composes")
    @Results([
            @Result(property = "name", column = "lep_name"),
            @Result(property = "description", column = "lep_description"),
            @Result(property = "ncas", column = "lep_ncas"),
            @Result(property = "nce", column = "lep_nce"),
            @Result(property = "chemicalProfile",
                    column = "lep_chemical_profile_id",
                    one = @One(select = "info.developia.prevengic.mapper.ChemicalProfileMapper.getChemicalProfileById")),
            @Result(property = "notes",
                    column = "lep_id",
                    many = @Many(select = "info.developia.prevengic.mapper.NoteMapper.getNotesById"))
    ])
    List<Compose> getAll()

    @Select("SELECT * FROM lep.composes WHERE lep_ncas=#{ncas}")
    @Results([
            @Result(property = "name", column = "lep_name"),
            @Result(property = "description", column = "lep_description"),
            @Result(property = "ncas", column = "lep_ncas"),
            @Result(property = "nce", column = "lep_nce"),
            @Result(property = "chemicalProfile",
                    column = "lep_chemical_profile_id",
                    one = @One(select = "info.developia.prevengic.mapper.ChemicalProfileMapper.getChemicalProfileById")),
            @Result(property = "notes",
                    column = "lep_id",
                    many = @Many(select = "info.developia.prevengic.mapper.NoteMapper.getNotesById"))
    ])
    Optional<Compose> getByNcas(String ncas)

    @Select("SELECT * FROM lep.composes WHERE lep_nce=#{nce}")
    @Results([
            @Result(property = "name", column = "lep_name"),
            @Result(property = "description", column = "lep_description"),
            @Result(property = "ncas", column = "lep_ncas"),
            @Result(property = "nce", column = "lep_nce"),
            @Result(property = "chemicalProfile",
                    column = "lep_chemical_profile_id",
                    one = @One(select = "info.developia.prevengic.mapper.ChemicalProfileMapper.getChemicalProfileById")),
            @Result(property = "notes",
                    column = "lep_id",
                    many = @Many(select = "info.developia.prevengic.mapper.NoteMapper.getNotesById"))
    ])
    Optional<Compose> getByNce(String nce)

    @Select("SELECT * FROM lep.composes WHERE lep_name LIKE CONCAT('%',#{name},'%'")
    @Results([
            @Result(property = "name", column = "lep_name"),
            @Result(property = "description", column = "lep_description"),
            @Result(property = "ncas", column = "lep_ncas"),
            @Result(property = "nce", column = "lep_nce"),
            @Result(property = "chemicalProfile",
                    column = "lep_chemical_profile_id",
                    one = @One(select = "info.developia.prevengic.mapper.ChemicalProfileMapper.getChemicalProfileById")),
            @Result(property = "notes",
                    column = "lep_id",
                    many = @Many(select = "info.developia.prevengic.mapper.NoteMapper.getNotesById"))
    ])
    Optional<Compose> getByName(String name)
}
