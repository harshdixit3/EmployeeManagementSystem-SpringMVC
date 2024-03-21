package com.gl.mvc.crud.service;

import java.util.List;

import com.gl.mvc.crud.entity.Book;


public interface BookService {

	void save(Book book);

	List<Book> findAll();
	
	Book findByID(int id);
	
	void deleteById(int id);

}
