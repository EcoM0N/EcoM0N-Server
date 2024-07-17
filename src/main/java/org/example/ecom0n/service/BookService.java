package org.example.ecom0n.service;

import lombok.RequiredArgsConstructor;
import org.example.ecom0n.repository.BookRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRepository BookRepository;
}
