package org.example.ecom0n.controller;

import lombok.RequiredArgsConstructor;
import org.example.ecom0n.dto.request.BookReqDTO;
import org.example.ecom0n.dto.response.BookResDTO;
import org.example.ecom0n.entity.BookEntity;
import org.example.ecom0n.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecom0n/main")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    //CompletableFuture<ResponseEntity<BookEntity>>

    @GetMapping("/book")
    public List findBookAll(BookReqDTO bookreqDTO) {
        List<BookResDTO> bookResdDTOList = bookService.findBookAll(bookreqDTO);
        return bookResdDTOList;
    }

    @GetMapping("/book/{id}")
    public BookResDTO findById(BookReqDTO bookreqDTO) {
        BookResDTO bookresDTO = bookService.findById(bookreqDTO.getEco_index());
        return bookresDTO;
    }
}