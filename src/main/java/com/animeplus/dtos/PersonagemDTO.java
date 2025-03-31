package com.animeplus.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class PersonagemDTO {
    private Long id;
    private Long animeId;
    private String nomePersonagem;
    private String descricao;
    private String tipo;
}