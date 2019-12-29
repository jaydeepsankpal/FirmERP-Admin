package com.firm.erp.admin.repository;

import com.firm.erp.admin.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

// Spring Data magic :)
public interface BookRepository extends JpaRepository<Book, Long> {
}
