package io.github.moniqueparente.MPPecas.dto.response;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import lombok.Data;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class VendaDtoResponse {

    private VendedorDtoResponse vendedor;
    private ClienteDtoResponse cliente;
    private List<ItemVendaDtoResponse> items;

    private Double valorVenda;

    private LocalDateTime dataVenda = LocalDateTime.now();
}
