package com.refocus.api.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.refocus.api.models.entitys.ClienteEntity;
import com.refocus.api.models.repositorys.ClienteRepository;

@Service

public class ClienteServices {

    @Autowired
    private ClienteRepository clienteRepo;

    /**
     * Cria um novo cliente no sistema.
     * 
     * @param cliente Dados do cliente a serem salvos.
     * @return ClienteEntity Registro salvo.
     */
    public ClienteEntity createCliente(ClienteEntity cliente) {
        return clienteRepo.save(cliente);
    }

    /**
     * Busca todos os clientes no sistema.
     * 
     * @return Lista de clientes.
     */
    public List<ClienteEntity> findAllClientes() {
        return clienteRepo.findAll();
    }

    /**
     * Busca um cliente pelo ID.
     * 
     * @param id ID do cliente.
     * @return Optional contendo o cliente, se encontrado.
     */
    public Optional<ClienteEntity> findClienteById(Long id) {
        return clienteRepo.findById(id);
    }

    /**
     * Atualiza os dados de um cliente existente.
     * 
     * @param id      ID do cliente a ser atualizado.
     * @param cliente Dados atualizados do cliente.
     * @return ClienteEntity Registro atualizado.
     */
    public ClienteEntity updateCliente(Long id, ClienteEntity cliente) {
        if (clienteRepo.existsById(id)) {
            cliente.setId(id); // Garante que o ID seja mantido
            return clienteRepo.save(cliente);
        } else {
            throw new IllegalArgumentException("Cliente com o ID fornecido não existe.");
        }
    }

    /**
     * Remove um cliente pelo ID.
     * 
     * @param id ID do cliente a ser removido.
     */
    public void deleteClienteById(Long id) {
        if (clienteRepo.existsById(id)) {
            clienteRepo.deleteById(id);
        } else {
            throw new IllegalArgumentException("Cliente com o ID fornecido não existe.");
        }
    }
    
    
    
}
