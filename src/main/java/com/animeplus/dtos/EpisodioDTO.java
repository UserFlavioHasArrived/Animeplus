package com.animeplus.dtos;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class EpisodioDTO {
    private Integer id;
    private Integer animeId;
    private Integer numero;
    private String tituloEpisodio;
    private String dataLancamento;
}