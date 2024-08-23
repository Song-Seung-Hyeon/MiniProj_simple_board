package com.example.simple_board.common;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Api<T> {
    private T body;
    private Pagination pagination;
}
