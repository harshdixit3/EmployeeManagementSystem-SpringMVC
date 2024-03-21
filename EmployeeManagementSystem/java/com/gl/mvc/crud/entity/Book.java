package com.gl.mvc.crud.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.web.bind.annotation.ResponseBody;
@Entity
@ResponseBody
@Table(name = "book")
public class Book {	
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name ="id")
		private int id;
		
		@Column(name = "title")
		private String title;
		
		private String author;
		
		@Override
		public String toString() {
			return "book [id=" + id + ", title=" + title + ", author=" + author + ", category=" + category + "]";
		}
		private String category;
		
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getTitle() {
			return title;
		}
		public void setTitle(String title) {
			this.title = title;
		}
		public String getAuthor() {
			return author;
		}
		public void setAuthor(String author) {
			this.author = author;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public Book(int id, String title, String author, String category) {
			super();
			this.id = id;
			this.title = title;
			this.author = author;
			this.category = category;
		}
		public Book() {
			super();
		}
		public Book(String title, String author, String category) {
			super();
			this.title = title;
			this.author = author;
			this.category = category;
		}
		

	}

