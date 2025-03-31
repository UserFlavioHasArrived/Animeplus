package com.animeplus.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AvaliacaoDTO {
    private Long id;
    private Long animeId;
    private Long episodioId;
    private Double notaUsuario;
    private String comentario;
}