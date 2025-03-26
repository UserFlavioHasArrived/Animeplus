package com.animeplus.services;

import com.animeplus.models.Episodio;
import com.animeplus.repositories.EpisodioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EpisodioService {

    @Autowired
    private EpisodioRepository episodioRepository;


    public List<Episodio> getAllEpisodios() {
        return episodioRepository.findAll();
    }


    public Optional<Episodio> getEpisodioById(Integer id) {
        return episodioRepository.findById(id);
    }


    public Episodio saveEpisodio(Episodio episodio) {
        return episodioRepository.save(episodio);
    }


    public void deleteEpisodio(Integer id) {
        episodioRepository.deleteById(id);
    }
}
