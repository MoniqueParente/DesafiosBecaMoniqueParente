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

    private Double valor;

    private Integer quantidade;

    private Double valorTotal;

    @OneToOne
    private Produto produto;

    @ManyToOne
    private Venda venda;

    public Double getValorTotal() {

        return valor * quantidade;
    }
}
