package io.github.moniqueparente.MPPecas.dto.response;

import lombok.Data;

@Data
public class ItemVendaDtoResponse {

    private Integer id;
    private Double valor;
    private Integer quantidade;
    private ProdutoDtoResponse produto;
    private Double valorTotal;
}
