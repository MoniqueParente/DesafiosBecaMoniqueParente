# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
______________________________________________________________________________________________________________________________________________________________________________

⭕ Implementar os conceitos de DTO.

⭕ Relacionamento entre tabelas.

______________________________________________________________________________________________________________________________________________________________________________

⚜ Implementar os conceitos de DTO.

Data Transfer Object (DTO) ou simplesmente Transfer Object é um padrão de projetos bastante usado em Java para o transporte de dados entre diferentes componentes de um sistema, diferentes instâncias ou processos de um sistema distribuído ou diferentes sistemas via serialização.

Exemplo: 

@Data  //equivalente a @Getter @Setter @RequiredArgsConstructor @ToString @EqualsAndHashCode.
@NoArgsConstructor //gerador do construtor vazio.
@AllArgsConstructor //gerador de todos os construtores necessários.
public class ClienteDto {
    private String nome;
    private String cpf;

    public ClienteDto(Cliente cliente) {
        this.nome = cliente.getNome();
        this.cpf = cliente.getCpf();
    }
}

⚜ Relacionamento entre tabelas. 

Tipos de relacionamento entre tabelas:

@OneToOne

@OneToMany

@ManyToOne

@ManyToMany

Esses relacionamentos são implementados de acordo com a modelagem no [Desafio 1](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/features-modificacao/README.md)<br/>

Exemplo:

@OneToOne
private Produto produto;

______________________________________________________________________________________________________________________________________________________________________________
✨ [Menu](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/main/README.md)<br/>


