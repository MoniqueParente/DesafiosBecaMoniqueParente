package io.github.moniqueparente.MPPecas.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Entity
public class ItemVenda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    //@Positive(message = "{valor.not.valid}")
    private Double valor;

    //@Min(value = 1, message = "{quantidade.not.valid}")
    private Integer quantidade;

    private Double valorTotal;

    @OneToOne
    private Produto produto;

    public Double getValorTotal() {
        return valor * quantidade;
    }
}
