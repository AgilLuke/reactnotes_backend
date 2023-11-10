package com.springboot.first.app.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity //This class can be mapped to a database table
@Table(name="tbl_notes")
@Data
public class Note {
	@Id //Primary key of the current entity
	@GeneratedValue(strategy=GenerationType.IDENTITY) //To configure the way of increment the specified column
	private Long id;
	private String title;
	private String body;
	private String category;
}
