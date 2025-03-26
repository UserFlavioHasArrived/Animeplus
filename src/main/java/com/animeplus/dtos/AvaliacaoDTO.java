package com.animeplus.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoDTO {
    private Integer id;
    private Integer animeId;
    private Integer episodioId;
    private Double notaUsuario;
    private String comentario;
}