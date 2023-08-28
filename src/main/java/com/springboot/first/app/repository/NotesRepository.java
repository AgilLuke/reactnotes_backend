package com.springboot.first.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.first.app.entity.Note;

@Repository
public interface NotesRepository extends JpaRepository<Note, Long>{
	//
}
