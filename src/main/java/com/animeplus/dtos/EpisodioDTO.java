package com.animeplus.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpisodioDTO {
    private Long id;
    private Long animeId;
    private Long numero;
    private String tituloEpisodio;
    private String dataLancamento;
}