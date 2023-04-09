package br.com.infnet.lessons.spring.demo.unit;

import br.com.infnet.lessons.spring.demo.controller.NoteController;
import br.com.infnet.lessons.spring.demo.exception.ResourceNotFoundException;
import br.com.infnet.lessons.spring.demo.model.Note;
import br.com.infnet.lessons.spring.demo.repository.NoteRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.*;

@ExtendWith(MockitoExtension.class)
public class NoteControllerTest {

    @Mock
    private NoteRepository noteRepository;

    @InjectMocks
    private NoteController noteController;

    private Note note;

    public NoteControllerTest() {
        this.note = new Note();
    }

    @Test
    public void testGetAllNotes() {
        note.setTitle("Note 1");
        note.setContent("Content 1");
        List<Note> notes = new ArrayList<>();
        notes.add(note);
        note = new Note();
        note.setTitle("Note 2");
        note.setContent("Content 2");
        note.setCreatedAt(new Date());
        note.setUpdatedAt(new Date());
        notes.add(note);
        when(noteRepository.findAll()).thenReturn(notes);
        List<Note> result = noteController.getAllNotes();
        verify(noteRepository, times(1)).findAll();
        assertEquals(2, result.size());
        assertEquals(notes.get(0).getTitle(), result.get(0).getTitle());
        assertEquals(notes.get(1).getTitle(), result.get(1).getTitle());
        assertEquals(notes.get(1).getCreatedAt(), result.get(1).getCreatedAt());
        assertEquals(notes.get(1).getUpdatedAt(), result.get(1).getUpdatedAt());
    }

    @Test
    public void testCreateNote() {
        note.setTitle("Note 1");
        note.setContent("Content 1");
        when(noteRepository.save(any(Note.class))).thenReturn(note);
        Note result = noteController.createNote(note);
        verify(noteRepository, times(1)).save(any(Note.class));
        assertEquals("Note 1", result.getTitle());
        assertEquals("Content 1", result.getContent());
    }

    @Test
    public void testGetNoteById() {
        note.setTitle("Note 123");
        note.setContent("Content 123");
        when(noteRepository.findById(1L)).thenReturn(Optional.of(note));
        Note result = noteController.getNoteById(1L);
        verify(noteRepository, times(1)).findById(1L);
        assertEquals("Note 123", result.getTitle());
        assertEquals("Content 123", result.getContent());
    }

    @Test
    public void testGetNoteByIdNotFound() {
        when(noteRepository.findById(1L)).thenReturn(Optional.empty());
        assertThrows(ResourceNotFoundException.class, () -> {
            noteController.getNoteById(1L);
        });
        verify(noteRepository, times(1)).findById(1L);
    }

    @Test
    public void testUpdateNote() {
        note.setTitle("Note 123");
        note.setContent("Content 123");
        Note updatedNote = new Note();
        updatedNote.setTitle("Note 1 Updated");
        updatedNote.setContent("Content 1 Updated");
        when(noteRepository.findById(1L)).thenReturn(Optional.of(note));
        when(noteRepository.save(any(Note.class))).thenReturn(updatedNote);
        Note result = noteController.updateNote(1L, updatedNote);
        verify(noteRepository, times(1)).findById(1L);
        verify(noteRepository, times(1)).save(any(Note.class));
        assertEquals("Note 1 Updated", result.getTitle());
        assertEquals("Content 1 Updated", result.getContent());
    }

    @Test
    public void testDeleteNote() {
        note.setTitle("Note 123");
        note.setContent("Content 123");
        when(noteRepository.findById(1L)).thenReturn(Optional.of(note));
        ResponseEntity<?> result = noteController.deleteNote(1L);
        verify(noteRepository, times(1)).findById(1L);
        verify(noteRepository, times(1)).delete(any(Note.class));
        assertEquals(HttpStatus.OK, result.getStatusCode());
    }

    @Test
    public void testDeleteNoteNotFound() {
        when(noteRepository.findById(2L)).thenReturn(Optional.empty());
        assertThrows(ResourceNotFoundException.class, () -> {
            noteController.deleteNote(2L);
        });
        verify(noteRepository, times(1)).findById(2L);
    }
}