package org.example.ecom0n.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecom0n")
public class HomeController {
    @GetMapping("")
    public void main() {
        // 빠질 물, 남은물, 코인(24시간)
    }
}
