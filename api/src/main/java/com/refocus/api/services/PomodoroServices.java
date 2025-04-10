package com.refocus.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refocus.api.models.entitys.PomodoroEntity;
import com.refocus.api.models.repositorys.PomodoroRepository;

@Service
public class PomodoroServices {

    @Autowired
    private PomodoroRepository pomodoroRepo;

    /**
     * Cria um novo registro de pomodoro.
     * 
     * @param pomodoro Dados do pomodoro a serem salvos.
     * @return PomodoroEntity Registro salvo.
     */
    public PomodoroEntity createPomodoro(PomodoroEntity pomodoro) {
        return pomodoroRepo.save(pomodoro);
    }

    /**
     * Busca todos os registros de pomodoro.
     * 
     * @return Lista de registros de pomodoro.
     */
    public List<PomodoroEntity> findAllPomodoros() {
        return pomodoroRepo.findAll();
    }

    /**
     * Busca um registro de pomodoro pelo ID.
     * 
     * @param id ID do registro.
     * @return Optional contendo o registro, se encontrado.
     */
    public Optional<PomodoroEntity> findPomodoroById(Long id) {
        return pomodoroRepo.findById(id);
    }

    /**
     * Atualiza os dados de um registro de pomodoro existente.
     * 
     * @param id       ID do registro a ser atualizado.
     * @param pomodoro Dados atualizados do pomodoro.
     * @return PomodoroEntity Registro atualizado.
     */
    public PomodoroEntity updatePomodoro(Long id, PomodoroEntity pomodoro) {
        if (pomodoroRepo.existsById(id)) {
            pomodoro.setId(id); // Garante que o ID seja mantido
            return pomodoroRepo.save(pomodoro);
        } else {
            throw new IllegalArgumentException("Registro de pomodoro com o ID fornecido não existe.");
        }
    }

    /**
     * Remove um registro de pomodoro pelo ID.
     * 
     * @param id ID do registro a ser removido.
     */
    public void deletePomodoroById(Long id) {
        if (pomodoroRepo.existsById(id)) {
            pomodoroRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Registro de pomodoro com o ID fornecido não existe.");
        }
    }

    public List<PomodoroEntity> getAllPomodoros() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getAllPomodoros'");
    }

    public PomodoroEntity getPomodoroById(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getPomodoroById'");
    }

    public void deletePomodoro(Long id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deletePomodoro'");
    }
}