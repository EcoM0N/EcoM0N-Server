package org.example.ecom0n.dto.response;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import org.example.ecom0n.entity.BookEntity;
import org.example.ecom0n.entity.EcoEntity;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BookResDTO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int eco_index; // 환경몬 번호

    @Column
    private String eco_img; // 환경몬 img (url)

    @Column
    private String eco_name; // 환경몬 이름

    @Column
    private String eco_content; // 환경몬 설명


    public static BookResDTO toDTO(BookEntity bookentity) {
        BookResDTO bookResdDTO = new BookResDTO();

//        bookResdDTO.setEco_index(bookentity.getEco_index());
        bookResdDTO.setEco_img(bookResdDTO.getEco_img());
        bookResdDTO.setEco_name(bookResdDTO.getEco_name());
        bookResdDTO.setEco_content(bookResdDTO.getEco_content());

        return bookResdDTO;
    }
}
