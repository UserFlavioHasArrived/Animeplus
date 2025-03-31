package com.animeplus.resources;

import com.animeplus.models.Avaliacao;
import com.animeplus.services.AvaliacaoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/avaliacoes")
public class AvaliacaoResource {
    @Autowired
    private AvaliacaoService avaliacaoService;

    @GetMapping
    public List<Avaliacao> getAllAvaliacoes() {
        return avaliacaoService.getAllAvaliacoes();
    }

    @GetMapping("/{id}")
    public Optional<Avaliacao> getAvaliacaoById(@PathVariable Integer id) {
        return avaliacaoService.getAvaliacaoById(id);
    }

    @PostMapping
    public Avaliacao saveAvaliacao(@RequestBody Avaliacao avaliacao) {
        return avaliacaoService.saveAvaliacao(avaliacao);
    }

    @PutMapping
    public Avaliacao updateAvaliacao(@RequestBody Avaliacao avaliacao) {
        return avaliacaoService.updateAvaliacao(avaliacao);
    }

    @DeleteMapping("/{id}")
    public void deleteAvaliacao(@PathVariable Integer id) {
        avaliacaoService.deleteAvaliacao(id);
    }
}

