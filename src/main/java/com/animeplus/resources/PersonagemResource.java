package com.animeplus.resources;

import com.animeplus.models.Personagem;
import com.animeplus.services.PersonagemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/personagens")
public class PersonagemResource {
    @Autowired
    private PersonagemService personagemService;

    @GetMapping
    public List<Personagem> getAllPersonagens() {
        return personagemService.getAllPersonagens();
    }

    @GetMapping("/{id}")
    public Optional<Personagem> getPersonagemById(@PathVariable Integer id) {
        return personagemService.getPersonagemById(id);
    }

    @PostMapping
    public Personagem savePersonagem(@RequestBody Personagem personagem) {
        return personagemService.savePersonagem(personagem);
    }

    @PutMapping
    public Personagem updatePersonagem(@RequestBody Personagem personagem) {
        return personagemService.updatePersonagem(personagem);
    }

    @DeleteMapping("/{id}")
    public void deletePersonagem(@PathVariable Integer id) {
        personagemService.deletePersonagem(id);
    }
}

