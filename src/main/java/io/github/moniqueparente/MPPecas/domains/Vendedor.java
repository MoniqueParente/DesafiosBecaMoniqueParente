package io.github.moniqueparente.MPPecas.domains;

import java.util.Objects;

public class Vendedor {

    private Integer id;
    private String nome;

    @Override
    public String toString() {
        return "Vendedor{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }

    public Vendedor() {
    }

    public Vendedor(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Vendedor vendedor = (Vendedor) o;
        return id.equals(vendedor.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}