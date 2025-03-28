package main.java.com.refocus.api.models.repositorys;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import main.java.com.refocus.api.models.entitys.ClienteEntity;

@Repository
public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {
    List<ClienteEntity> findByStatus(Boolean status);
}
