package info.developia.prevengic.mapper

import info.developia.prevengic.model.Note
import org.apache.ibatis.annotations.Mapper
import org.apache.ibatis.annotations.Select

@Mapper
interface NoteMapper {

    @Select("SELECT notes.name AS name, notes.description AS description \
             FROM prevengic.composes \
             INNER JOIN prevengic.compose_note ON composes.id = compose_note.compose_id \
             INNER JOIN prevengic.notes ON compose_note.note_id = notes.id \
             WHERE composes.id = #{id}")
    List<Note> getNotesById(Long id)

}
