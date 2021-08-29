package com.anujk.notes.api.respository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.anujk.notes.api.model.Notes;

public interface NotesRepository extends MongoRepository<Notes,String> {
    
}
