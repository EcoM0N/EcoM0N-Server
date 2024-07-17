package org.example.ecom0n.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BookReqDTO {

    private String email; // user email

    private int eco_index; // 환경몬 번호
}
