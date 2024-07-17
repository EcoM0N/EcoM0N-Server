package org.example.ecom0n.controller;

import lombok.RequiredArgsConstructor;
import org.example.ecom0n.dto.request.BookReqDTO;
import org.example.ecom0n.dto.response.BookResDTO;
import org.example.ecom0n.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ecom0n")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    //CompletableFuture<ResponseEntity<BookEntity>>

    @GetMapping("/findAll")
    public List findBookAll() {
        List<BookResDTO> bookResdDTOList = bookService.findBookAll();
        return  bookResdDTOList;
    }

    @GetMapping("/{id}")
    public void findById() {

    }
}