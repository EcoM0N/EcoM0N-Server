package org.example.ecom0n.service;

import lombok.RequiredArgsConstructor;
import org.example.ecom0n.dto.request.BoardReqDTO;
import org.example.ecom0n.dto.response.CalculationResult;
import org.example.ecom0n.entity.BoardEntity;
import org.example.ecom0n.repository.BoardRepository;
import org.example.ecom0n.repository.BookRepository;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public CalculationResult calculation(BoardReqDTO boardReqDTO) {

        Integer shower = (boardReqDTO.getShower()) - 5;
        Integer cloth = boardReqDTO.getCloth() -5;
        Integer dish = boardReqDTO.getDish() -5;

        Integer minus = shower + cloth + dish;
        Integer remain = 100 - minus;

        return new CalculationResult(minus, remain);



//        BoardEntity boardEntity = BoardEntity.builder()
//                .shower(shower)
//                .cloth(cloth)
//                .dish(dish)
//                .build();
//
//        boardRepository.save(boardEntity);
    }
}
