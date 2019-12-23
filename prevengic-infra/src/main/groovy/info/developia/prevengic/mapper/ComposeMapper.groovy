package info.developia.prevengic.mapper

import info.developia.prevengic.model.Compose
import org.apache.ibatis.annotations.Insert
import org.apache.ibatis.annotations.Select

interface ComposeMapper {

    @Select("SELECT * FROM prevengic.composes")
    List<Compose> getAll()

    @Select("SELECT * FROM prevengic.composes WHERE ncas=#{ncas}")
    Optional<Compose> getByNcas(String ncas)

    @Insert("INSERT INTO prevengic.composes (name, ncas) VALUES (#{name}, #{ncas})")
    Integer save(Compose compose)
}
