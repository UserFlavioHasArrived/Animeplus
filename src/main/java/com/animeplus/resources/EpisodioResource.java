package com.animeplus.resources;

import com.animeplus.models.Episodio;
import com.animeplus.services.EpisodioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/episodios")
public class EpisodioResource {
    @Autowired
    private EpisodioService episodioService;

    @GetMapping
    public List<Episodio> getAllEpisodios() {
        return episodioService.getAllEpisodios();
    }

    @GetMapping("/{id}")
    public Optional<Episodio> getEpisodioById(@PathVariable Integer id) {
        return episodioService.getEpisodioById(id);
    }

    @PostMapping
    public Episodio saveEpisodio(@RequestBody Episodio episodio) {
        return episodioService.saveEpisodio(episodio);
    }

    @DeleteMapping("/{id}")
    public void deleteEpisodio(@PathVariable Integer id) {
        episodioService.deleteEpisodio(id);
    }
}