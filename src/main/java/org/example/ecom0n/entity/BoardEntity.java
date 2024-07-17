package org.example.ecom0n.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
//@Table(name = "board_table")
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
public class BoardEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String email; // user email

    @Column
    private int shower; // 샤워 시간

    @Column
    private int cloth; // 세탁 시간

    @Column
    private int dish; // 설거지 시간

}
