# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
______________________________________________________________________________________________________________________________________________________________________________

⭕ Implementar validações.

⭕ Adicionar Mapper.

⭕ Implementar Lombok.
______________________________________________________________________________________________________________________________________________________________________________

⚜ Implementar validações.

As validações são feitas nas classes controller e services coma assinatura: @Valid

Exemplo na classe controller:

   @PostMapping
   
    public ResponseEntity<ClienteDtoResponse> criar(@RequestBody @Valid ClienteDtoRequest clienteDtoRequest){

        return ResponseEntity.created(null).body(clienteService.criar(clienteDtoRequest));
    }
  
Exemplo na classe service: 
  
  public ClienteDtoResponse criar(@Valid ClienteDtoRequest clienteDtoRequest) {
  
        Cliente cliente = mapperClienteRequestToCliente.toModel(clienteDtoRequest);

        clienteRepository.save(cliente);

        ClienteDtoResponse clienteDtoResponse = mapperClienteToClienteResponse.toResponse(cliente);

        return clienteDtoResponse;
    }

⚜ Adicionar Mapper.

ORM (Object Relational Mapper) é uma técnica de mapeamento objeto relacional que permite fazer uma relação dos objetos com os dados que os mesmos representam.

Para evitar futuros bugs é interssante que em sua aplicação exista 3 tipos de mapper:

* MapperAtualização

* Mapper da classe request DTO para classe

* Mapper da classe para a classe response

Dependência Mapper deve ser adicionada ao pom.xml.

⚜ Implementar Lombok.

O Lombok é um Framework criado sob licença MIT, podendo ser usado livremente em qualquer projeto Java. Seu principal objetivo é diminuir a verbosidade das classes de mapeamento JPA, DTOs e Beans.

Dependência Lombok deve ser adicionada ao pom.xml.

______________________________________________________________________________________________________________________________________________________________________________
✨ [Menu](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/main/README.md)<br/>
