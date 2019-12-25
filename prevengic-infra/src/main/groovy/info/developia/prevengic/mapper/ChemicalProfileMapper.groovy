package info.developia.prevengic.mapper

import info.developia.prevengic.model.ChemicalProfile
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select

@Mapper
interface ChemicalProfileMapper {

    @Select("SELECT * FROM prevengic.chemical_profile WHERE id=#{id}")
    @Results([
            @Result(property = "vlaEd", column = "vla_ed"),
            @Result(property = "vlaEc", column = "vla_ec")
    ])
    ChemicalProfile getChemicalProfileById(Long id)

}
