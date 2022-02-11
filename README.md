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
⚜ Implementar Lombok.
______________________________________________________________________________________________________________________________________________________________________________
✨ [Menu](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/main/README.md)<br/>
