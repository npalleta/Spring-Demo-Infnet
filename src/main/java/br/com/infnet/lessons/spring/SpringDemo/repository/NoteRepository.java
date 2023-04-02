package br.com.infnet.lessons.spring.SpringDemo.repository;

import br.com.infnet.lessons.spring.SpringDemo.model.Note;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteRepository extends JpaRepository<Note, Long> {
}