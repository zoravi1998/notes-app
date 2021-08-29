package com.anujk.notes.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.anujk.notes.api.model.*;
import com.anujk.notes.api.respository.NotesRepository;

@RestController
public class NotesController {
	
	@Autowired
	private NotesRepository repository;
	
	@PostMapping("/addNote")
	public String addNote(@RequestBody Notes note) {
		repository.save(note);
		return "Note Added Successfully: "+ String.valueOf(note.getId());
	}
	
	@RequestMapping("/findAll")
	public List<Notes> getAllNotes(){
		return repository.findAll();
	}

}