package io.github.moniqueparente.MPPecas.domains;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Venda {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne
    @JoinColumn(name = "vendedor_id", nullable = false)
    private Vendedor vendedor;

    @OneToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private Cliente cliente;

    @OneToMany
    private List<ItemVenda> items;

    private LocalDateTime dataVenda = LocalDateTime.now();

    private Double valorVenda;

    public Double getValorVenda() {
        double valor = 0;

        for(ItemVenda itemVenda : this.items){
            valor += itemVenda.getValorTotal();
        }

        this.valorVenda = valor;

        return this.valorVenda;
    }

}
