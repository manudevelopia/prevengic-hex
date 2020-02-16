package info.developia.prevengic.mapper

import info.developia.prevengic.model.Note
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface NoteMapper {

    @Select("SELECT notes.lep_name AS name, notes.lep_description AS description \
             FROM lep.composes \
             INNER JOIN lep.compose_note ON composes.lep_id = compose_note.lep_compose_id \
             INNER JOIN lep.notes ON compose_note.lep_note_id = notes.lep_id \
             WHERE composes.lep_id = #{id}")
    List<Note> getNotesById(Long id)

}