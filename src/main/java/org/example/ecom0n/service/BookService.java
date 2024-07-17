package org.example.ecom0n.service;

import lombok.RequiredArgsConstructor;
import org.example.ecom0n.dto.request.BookReqDTO;
import org.example.ecom0n.dto.response.BookResDTO;
import org.example.ecom0n.entity.BookEntity;
import org.example.ecom0n.entity.EcoEntity;
import org.example.ecom0n.repository.BookRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.stereotype.Service;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository bookRepository;

    public List<BookResDTO> findBookAll(BookReqDTO bookreqDTO) {
        String email = bookreqDTO.getEmail();

        List<BookEntity> bookEntityList = bookRepository.findByEmail(email);
        List<BookResDTO> bookResdDTOList = new ArrayList<>();

        for (BookEntity bookentity : bookEntityList) {
            bookResdDTOList.add(BookResDTO.toDTO(bookentity));
        }

        return bookResdDTOList;
    }

    public BookResDTO findById(int ecoIndex) {
        Optional<BookEntity> bookEntity = bookRepository.findByIndex(ecoIndex);
        if (bookEntity.isPresent()) {
            return BookResDTO.toDTO(bookEntity.get());
        } else {
//            BookResDTO bookresDTO = new BookResDTO();
             return null;
        }
    }
}
