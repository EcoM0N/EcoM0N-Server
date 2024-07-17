package org.example.ecom0n.controller;

import lombok.RequiredArgsConstructor;
import org.example.ecom0n.dto.request.BoardReqDTO;
import org.example.ecom0n.dto.response.CalculationResult;
import org.example.ecom0n.service.BoardService;
import org.example.ecom0n.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ecom0n/main")
@RequiredArgsConstructor
public class BoardController {
    private final BoardService boardService;

//    UserEntity user = userRepository.findByEmail(request.getEmail())
//            .orElseThrow(() -> new RuntimeException("사용자를 찾을 수 없습니다."));

    // 0~100
    @GetMapping("/board")
    public CalculationResult board(BoardReqDTO boardReqDTO) {
        CalculationResult result = boardService.calculation(boardReqDTO);
        return result;
    }

}
