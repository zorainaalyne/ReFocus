package com.refocus.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refocus.api.models.entitys.ModoFocoEntity;
import com.refocus.api.models.repositorys.ModoFocoRepository;

@Service
public class ModoFocoServices {

    @Autowired
    private ModoFocoRepository modoFocoRepo;

    /**
     * Cria um novo registro de modo foco.
     * 
     * @param modoFoco Dados do modo foco a serem salvos.
     * @return ModoFocoEntity Registro salvo.
     */
    public ModoFocoEntity createModoFoco(ModoFocoEntity modoFoco) {
        return modoFocoRepo.save(modoFoco);
    }

    /**
     * Busca todos os registros de modo foco.
     * 
     * @return Lista de registros de modo foco.
     */
    public List<ModoFocoEntity> findAllModoFoco() {
        return modoFocoRepo.findAll();
    }

    /**
     * Busca um registro de modo foco pelo ID.
     * 
     * @param id ID do registro.
     * @return Optional contendo o registro, se encontrado.
     */
    public Optional<ModoFocoEntity> findModoFocoById(Long id) {
        return modoFocoRepo.findById(id);
    }

    /**
     * Atualiza os dados de um registro de modo foco existente.
     * 
     * @param id       ID do registro a ser atualizado.
     * @param modoFoco Dados atualizados do modo foco.
     * @return ModoFocoEntity Registro atualizado.
     */
    public ModoFocoEntity updateModoFoco(Long id, ModoFocoEntity modoFoco) {
        if (modoFocoRepo.existsById(id)) {
            modoFoco.setId(id); // Garante que o ID seja mantido
            return modoFocoRepo.save(modoFoco);
        } else {
            throw new IllegalArgumentException("Registro de modo foco com o ID fornecido não existe.");
        }
    }

    /**
     * Remove um registro de modo foco pelo ID.
     * 
     * @param id ID do registro a ser removido.
     */
    public void deleteModoFocoById(Long id) {
        if (modoFocoRepo.existsById(id)) {
            modoFocoRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Registro de modo foco com o ID fornecido não existe.");
        }
    }
}