package org.example.ecom0n.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardReqDTO {

    private String email;

    private int shower;

    private int cloth;

    private int dish;
}
