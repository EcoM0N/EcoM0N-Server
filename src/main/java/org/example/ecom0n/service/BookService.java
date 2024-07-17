package org.example.ecom0n.service;

import lombok.RequiredArgsConstructor;
import org.example.ecom0n.dto.request.BookReqDTO;
import org.example.ecom0n.dto.response.BookResDTO;
import org.example.ecom0n.entity.BookEntity;
import org.example.ecom0n.entity.EcoEntity;
import org.example.ecom0n.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<BookResDTO> findBookAll() {
        List<BookEntity> bookEntityList = bookRepository.findAll();
        List<BookResDTO> bookResdDTOList = new ArrayList<>();

        for (BookEntity bookentity : bookEntityList) {
            bookResdDTOList.add(BookResDTO.toDTO(bookentity));
        }

        return bookResdDTOList;
    }
}
