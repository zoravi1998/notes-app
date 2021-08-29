package com.anujk.notes.api.model;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Document(collection="Users")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String Id;
	private String username;
	private String password;
	private String emailid;

}
