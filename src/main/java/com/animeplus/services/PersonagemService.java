package com.animeplus.services;

import com.animeplus.models.Personagem;
import com.animeplus.repositories.PersonagemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonagemService {
    @Autowired
    private PersonagemRepository personagemRepository;

    public List<Personagem> getAllPersonagens() {
        return personagemRepository.findAll();
    }

    public Optional<Personagem> getPersonagemById(Integer id) {
        return personagemRepository.findById(id);
    }

    public Personagem savePersonagem(Personagem personagem) {
        return personagemRepository.save(personagem);
    }

    public void deletePersonagem(Integer id) {
        personagemRepository.deleteById(id);
    }

    public Personagem updatePersonagem(Personagem personagem) {personagemRepository.save(personagem);
        return personagem;
    }
}
