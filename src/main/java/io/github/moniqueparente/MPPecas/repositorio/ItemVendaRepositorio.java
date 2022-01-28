package io.github.moniqueparente.MPPecas.repositorio;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemVendaRepositorio extends JpaRepository<ItemVenda, Integer> {

}