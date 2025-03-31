package com.animeplus.resources;


import com.animeplus.models.Anime;
import com.animeplus.services.AnimeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/animes")
public class AnimeResource {
    @Autowired
    private AnimeService animeService;

    @GetMapping
    public List<Anime> getAllAnimes() {
        return animeService.getAllAnimes();
    }

    @GetMapping("/{id}")
    public Optional<Anime> getAnimeById(@PathVariable Integer id) {
        return animeService.getAnimeById(id);
    }

    @PostMapping
    public Anime saveAnime(@RequestBody Anime anime) {
        return animeService.saveAnime(anime);
    }

    @PutMapping
    public Anime updateAnime(@RequestBody Anime anime) {
        return animeService.updateAnime(anime);
    }

    @DeleteMapping("/{id}")
    public void deleteAnime(@PathVariable Integer id) {
        animeService.deleteAnime(id);
    }
}
