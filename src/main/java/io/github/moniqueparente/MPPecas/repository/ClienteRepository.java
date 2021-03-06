package io.github.moniqueparente.MPPecas.repository;

import io.github.moniqueparente.MPPecas.domains.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
