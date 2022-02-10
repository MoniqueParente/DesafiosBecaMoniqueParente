package io.github.moniqueparente.MPPecas.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProdutoDtoRequest {

    private Integer id;

    @NotBlank(message = "Por favor, preencha este campo.")
    @Size(min = 4, message = "Por favor, preencha com mais de 4 caracteres.")
    private String nome;

    @NotBlank(message = "Por favor, preencha este campo.")
    @Size(min = 4, message = "Digite mais do q 4 letras")
    private String marca;

}
