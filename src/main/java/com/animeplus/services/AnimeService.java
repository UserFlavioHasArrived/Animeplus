package com.animeplus.services;

import com.animeplus.models.Anime;
import com.animeplus.repositories.AnimeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimeService {
    @Autowired
    private AnimeRepository animeRepository;

    public List<Anime> getAllAnimes() {
        return animeRepository.findAll();
    }

    public Optional<Anime> getAnimeById(Integer id) {
        return animeRepository.findById(id);
    }

    public Anime saveAnime(Anime anime) {
        return animeRepository.save(anime);
    }

    public void deleteAnime(Integer id) {
        animeRepository.deleteById(id);
    }
}
