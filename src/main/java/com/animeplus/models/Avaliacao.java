package com.animeplus.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Avaliacao {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Double nota;
    private String comentario;

    @ManyToOne
    @JoinColumn(name = "anime_id")
    private Anime anime;

    @ManyToOne
    @JoinColumn(name = "episodio_id")
    private Episodio episodio;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;
}