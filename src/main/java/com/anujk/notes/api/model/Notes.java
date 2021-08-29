package com.anujk.notes.api.model;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Document(collection = "Notes")
public class Notes{
	@Id
	private String id;
	private List<Note> notes;

}
