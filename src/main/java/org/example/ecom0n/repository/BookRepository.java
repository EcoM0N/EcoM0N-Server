package org.example.ecom0n.repository;

import org.example.ecom0n.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface BookRepository extends JpaRepository<BookEntity, Long> {

    Optional<BookEntity> findByIndex(int ecoIndex);

    List<BookEntity> findByEmail(String email);
}
