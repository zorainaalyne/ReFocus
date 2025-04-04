package com.refocus.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refocus.api.models.entitys.UsuarioEntity;
import com.refocus.api.models.repositorys.UsuarioRepository;

@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepo;

    /**
     * Cria um novo usuário no sistema.
     * 
     * @param usuario Dados do usuário a serem salvos.
     * @return UsuarioEntity Registro salvo.
     */
    public UsuarioEntity createUsuario(UsuarioEntity usuario) {
        return usuarioRepo.save(usuario);
    }

    /**
     * Busca todos os usuários no sistema.
     * 
     * @return Lista de usuários.
     */
    public List<UsuarioEntity> findAllUsuarios() {
        return usuarioRepo.findAll();
    }

    /**
     * Busca um usuário pelo ID.
     * 
     * @param id ID do usuário.
     * @return Optional contendo o usuário, se encontrado.
     */
    public Optional<UsuarioEntity> findUsuarioById(Long id) {
        return usuarioRepo.findById(id);
    }

    /**
     * Atualiza os dados de um usuário existente.
     * 
     * @param id      ID do usuário a ser atualizado.
     * @param usuario Dados atualizados do usuário.
     * @return UsuarioEntity Registro atualizado.
     */
    public UsuarioEntity updateUsuario(Long id, UsuarioEntity usuario) {
        if (usuarioRepo.existsById(id)) {
            usuario.setId(id); // Garante que o ID seja mantido
            return usuarioRepo.save(usuario);
        } else {
            throw new IllegalArgumentException("Usuário com o ID fornecido não existe.");
        }
    }

    /**
     * Remove um usuário pelo ID.
     * 
     * @param id ID do usuário a ser removido.
     */
    public void deleteUsuarioById(Long id) {
        if (usuarioRepo.existsById(id)) {
            usuarioRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Usuário com o ID fornecido não existe.");
        }
    }
}
