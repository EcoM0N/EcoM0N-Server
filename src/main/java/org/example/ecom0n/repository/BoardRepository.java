package org.example.ecom0n.repository;

import org.example.ecom0n.entity.BoardEntity;
import org.example.ecom0n.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BoardRepository extends JpaRepository<BoardEntity, Long> {
}
