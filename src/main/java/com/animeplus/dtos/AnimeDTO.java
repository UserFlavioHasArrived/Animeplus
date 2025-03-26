package com.animeplus.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnimeDTO {
    private Integer id;
    private String nome;
    private String genero;
    private String anoLancamento;
    private String sinopse;
    private Double notaMedia;
}