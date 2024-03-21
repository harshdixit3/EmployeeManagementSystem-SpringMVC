package com.gl.mvc.crud.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gl.mvc.crud.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {

}
