package com.animeplus.services;

import com.animeplus.models.Avaliacao;
import com.animeplus.repositories.AvaliacaoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AvaliacaoService {
    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacaoRepository.findAll();
    }

    public Optional<Avaliacao> getAvaliacaoById(Integer id) {
        return avaliacaoRepository.findById(id);
    }

    public Avaliacao saveAvaliacao(Avaliacao avaliacao) {
        return avaliacaoRepository.save(avaliacao);
    }

    public void deleteAvaliacao(Integer id) {
        avaliacaoRepository.deleteById(id);
    }

    public Avaliacao updateAvaliacao(Avaliacao avaliacao) {
        avaliacaoRepository.save(avaliacao);
        return avaliacao;
    }
}
