package com.gl.mvc.crud.serviceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gl.mvc.crud.entity.Book;
import com.gl.mvc.crud.repository.BookRepository;
import com.gl.mvc.crud.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public void save(Book book) {
		bookRepository.save(book);

	}

	@Override
	public List<Book> findAll() {

		return bookRepository.findAll();
	}

	@Override
	public Book findByID(int id) {

		Optional<Book> bookDetails = bookRepository.findById(id);
		if (bookDetails.isPresent()) {
			return bookDetails.get();
		} else {
			throw new RuntimeException("Did not find book id" + id);

		}
	}

	@Override
	public void deleteById(int id) {

		bookRepository.deleteById(id);

	}

}
