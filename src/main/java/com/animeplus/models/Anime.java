package com.animeplus.models;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    private String genero;
    private Date anoLancamento;
    private String sinopse;
    private Double notaMedia;

    @OneToMany(mappedBy = "anime")
    private List<Episodio> episodios;

    @OneToMany(mappedBy = "anime")
    private List<Personagem> personagens;
}