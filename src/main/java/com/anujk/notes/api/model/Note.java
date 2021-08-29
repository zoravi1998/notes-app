package com.anujk.notes.api.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Note {
	
	private String heading;
	private String text;

}
