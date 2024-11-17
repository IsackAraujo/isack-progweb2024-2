package br.edu.utfpr.pb.pw44s.server.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class CategoryDTO {

    private Long id;

    private String name;
}