package io.github.moniqueparente.MPPecas.dto.request;

import io.github.moniqueparente.MPPecas.domains.ItemVenda;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class VendaDtoRequest {

    private Integer id;

    private VendedorDtoRequest vendedor;
    private ClienteDtoRequest cliente;

    private List<ItemVendaDtoRequest> items;

    @PastOrPresent(message = "Data acima do dia atual não é aceita!")
    private LocalDateTime dataVenda = LocalDateTime.now();


    private List<ItemVenda> itemVendaLista;

}