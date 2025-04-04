package com.refocus.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refocus.api.models.entitys.TarefaEntity;
import com.refocus.api.models.repositorys.TarefaRepository;

@Service
public class TarefaServices {

    @Autowired
    private TarefaRepository tarefaRepo;

    /**
     * Cria uma nova tarefa no sistema.
     * 
     * @param tarefa Dados da tarefa a serem salvos.
     * @return TarefaEntity Registro salvo.
     */
    public TarefaEntity createTarefa(TarefaEntity tarefa) {
        return tarefaRepo.save(tarefa);
    }

    /**
     * Busca todas as tarefas no sistema.
     * 
     * @return Lista de tarefas.
     */
    public List<TarefaEntity> findAllTarefas() {
        return tarefaRepo.findAll();
    }

    /**
     * Busca uma tarefa pelo ID.
     * 
     * @param id ID da tarefa.
     * @return Optional contendo a tarefa, se encontrada.
     */
    public Optional<TarefaEntity> findTarefaById(Long id) {
        return tarefaRepo.findById(id);
    }

    /**
     * Atualiza os dados de uma tarefa existente.
     * 
     * @param id     ID da tarefa a ser atualizada.
     * @param tarefa Dados atualizados da tarefa.
     * @return TarefaEntity Registro atualizado.
     */
    public TarefaEntity updateTarefa(Long id, TarefaEntity tarefa) {
        if (tarefaRepo.existsById(id)) {
            tarefa.setId(id); // Garante que o ID seja mantido
            return tarefaRepo.save(tarefa);
        } else {
            throw new IllegalArgumentException("Tarefa com o ID fornecido não existe.");
        }
    }

    /**
     * Remove uma tarefa pelo ID.
     * 
     * @param id ID da tarefa a ser removida.
     */
    public void deleteTarefaById(Long id) {
        if (tarefaRepo.existsById(id)) {
            tarefaRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Tarefa com o ID fornecido não existe.");
        }
    }
}