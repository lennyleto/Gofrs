package io.dojogeek.gofrs.business.mapper;

import io.dojogeek.gofrs.dao.models.NotesModel;
import io.dojogeek.gofrs.rest.entities.Notes;
import org.dozer.DozerBeanMapper;
import org.dozer.Mapper;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irene on 3/10/16.
 */
@Component("notes-mapper")
public class NotesMapper {

    public NotesModel mapToInner(Notes notes) {

        Mapper mapper = new DozerBeanMapper();
        NotesModel notesModel = mapper.map(notes, NotesModel.class);
        return notesModel;
    }

    public Notes mapToOuter(NotesModel notesModel) {
        Mapper mapper = new DozerBeanMapper();
        Notes notes = mapper.map(notesModel, Notes.class);
        return  notes;
    }

    List<Notes> mapNoteList(List<NotesModel> notesModelList) {
        List<Notes> notesList = new ArrayList<Notes>();
        for(NotesModel notesModel : notesModelList) {
            notesList.add(mapToOuter(notesModel));
        }
        return notesList;
    }
}
