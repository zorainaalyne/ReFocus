package com.refocus.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refocus.api.models.entitys.Calendario;
import com.refocus.api.models.repositorys.CalendarioRepository;

@Service
public class calendarioservices {

    @Autowired
    private CalendarioRepository calendariorepo;


    /**
     * Cria um novo registro no calendário.
     * 
     * @param calendario Dados do calendário a serem salvos.
     * @return CalendarioEntity Registro salvo.
     */
    public CalendarioEntity createCalendario(CalendarioEntity calendario) {
        return calendarioservices.save(calendariorepo);
    }

    private static CalendarioEntity save(CalendarioRepository calendariorepo2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    /**
     * Busca todos os registros do calendário.
     * 
     * @return Lista de registros do calendário.
     */
    public List<Calendario> findAllCalendarios() {
        return calendariorepo.findAll();
    }

    /**
     * Busca um registro do calendário pelo ID.
     * 
     * @param id ID do registro.
     * @return Optional contendo o registro, se encontrado.
     */
    public Optional<Calendario> findCalendarioById(Long id) {
        return calendariorepo.findById(id);
    }

    /**
     * Atualiza um registro do calendário.
     * 
     * @param id         ID do registro a ser atualizado.
     * @param calendario Dados atualizados do calendário.
     * @return CalendarioEntity Registro atualizado.
     */
    public CalendarioEntity updateCalendario(Long id, CalendarioEntity calendario) {
        if (calendariorepo.existsById(id)) {
            calendario.setId(id); // Garante que o ID seja mantido
            return calendariorepo.save(calendario);
        } else {
            throw new IllegalArgumentException("Registro de calendário com o ID fornecido não existe.");
        }
    }

    /**
     * Remove um registro do calendário pelo ID.
     * 
     * @param id ID do registro a ser removido.
     */
    public void deleteCalendarioById(Long id) {
        if (calendariorepo.existsById(id)) {
            calendariorepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Registro de calendário com o ID fornecido não existe.");
        }
    }
}