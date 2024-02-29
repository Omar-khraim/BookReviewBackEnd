package com.example.bookreviewbackend.Repository;

import com.example.bookreviewbackend.Enitity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BooksRepo extends JpaRepository<Book, Long> {
}
