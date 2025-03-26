package com.animeplus.specs;


import com.animeplus.dtos.UsuarioDTO;
import com.animeplus.exceptions.BusinessException;
import com.animeplus.models.Usuario;
import com.animeplus.repositories.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static java.util.Objects.isNull;
import static java.util.Objects.nonNull;

@Service
public class UsuarioSpec {

    private static final String MSG_EMAIL = "Usuário já cadastrado com e-mail: %s.";
    private static final String MSG_ID = "O ID do usuário não pode ser nulo.";
    private static final String MSG_ID_INEXISTENTE = "Usuário com o ID %d não encontrado.";

    @Autowired
    private UsuarioRepository usuarioRepository;


    public void verificarSeExisteUsuarioComEmailDuplicado(Usuario usuario) {
        if (nonNull(usuario) && usuarioRepository.findByEmail(usuario.getEmail()) != null) {
            throw new BusinessException(String.format(MSG_EMAIL, usuario.getEmail()));
        }
    }


    public void verificarCampoIdNulo(Long id) {
        if (isNull(id)) {
            throw new BusinessException(MSG_ID);
        }
    }


    public void verificarEmailEmUso(Usuario usuario, UsuarioDTO usuarioDTO) {
        boolean alterouEmail = !(usuario.getEmail().equals(usuarioDTO.getEmail()));

        if (alterouEmail) {
            boolean encontrouUsuarioComEmailInformado =
                    nonNull(usuarioRepository.findByEmail(usuarioDTO.getEmail()));

            if(encontrouUsuarioComEmailInformado)
                throw new BusinessException(String.format(MSG_EMAIL, usuarioDTO.getEmail()));
        }
    }


    public void verificarUsuarioExistente(Long id) {
        if (isNull(usuarioRepository.findById(id).orElse(null))) {
            throw new BusinessException(String.format(MSG_ID_INEXISTENTE, id));
        }
    }
}

