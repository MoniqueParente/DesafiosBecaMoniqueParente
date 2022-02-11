# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
______________________________________________________________________________________________________________________________________________________________________________

⭕ Criação das classes controllers (CRUD).

⭕ Implementado o OpenAPI na Spring Rest.

⭕ Implementado ResponseEntity nos retornos das chamadas.
______________________________________________________________________________________________________________________________________________________________________________

⚜ Criação das classes e classes controllers (CRUD).

Post: @PostMapping

Patch: @PatchMapping("/{id}")

Delete: @DeleteMapping("/{id}")

Get (lista): @GetMapping()

Get (Id): @GetMapping("/{id}")

✅ Endpoints.
 
|Requisições          | Descrição                                |
|---------------------|------------------------------------------|
| POST `/itemvenda`   | Adiciona um item de venda ao sistema.    |
| POST `/venda`       | Adiciona uma venda ao sistema.           |
| POST `/cliente`     | Adiciona um cliente ao sistema.          |
| POST `/vendedor`    | Adiciona um vendedor ao sistema.         |
| PATCH `/produto`    | Atualiza um cliente ao sistema.          |  
| PATCH `/itemvenda`  | Atualiza um item venda ao sistema.       |
| PATCH `/venda`      | Atualiza uma venda ao sistema.           |
| PATCH `/cliente`    | Atualiza um cliente ao sistema.          |
| PATCH `/vendedor`   | Atualiza um vendedor ao sistema.         |
| DELETE `/produto`   | Deleta um cliente ao sistema.            |
| DELETE `/itemvenda` | Deleta um item venda ao sistema.         | 
| DELETE `/venda`     | Deleta uma venda ao sistema.             |
| DELETE `/cliente`   | Deleta um cliente ao sistema.            | 
| DELETE `/vendedor`  | Deleta um vendedor ao sistema            |
| GET `/produto`      | Lista um cliente ao sistema.             |
| GET `/itemvenda`    | Lista um item venda ao sistema.          |
| GET `/venda`        | Lista uma venda ao sistema.              |
| GET `/cliente`      | Lista um cliente ao sistema.             |
| GET `/vendedor`     | Lista um vendedor ao sistema             |
| GET `/produto`      | Busca por ID um cliente ao sistema.      |
| GET `/itemvenda`    | Busca por ID um item venda ao sistema.   |
| GET `/venda`        | Busca por ID uma venda ao sistema.       |
| GET `/cliente`      | Busca por ID um cliente ao sistema.      |
| GET `/vendedor`     | Busca por ID um vendedor ao sistema.     | 
 
 Exemplo de uma requisição (JSON):
 
 POST `/venda`  
 ```json
 {
    "vendedor": {
        "id": 1,
        "nome": "Caio Santana"
    },
    "cliente": {
        "id": 1,
        "nome": "Pedro Amaral Ducati",
        "cpf": "39718436030"
    },
    "items": [
        {
            "id": 7,
            "valor": 200.0,
            "quantidade": 5,
            "produto": {
                "id": 4,
                "nome": "Teclado",
                "marca": "Redragon"
            },
            "valorTotal": 1000.0
        }
    ],
    "dataVenda": "2022-02-08T16:21:31.514Z"
}
``` 
______________________________________________________________________________________________________________________________________________________________________________
✨ [Menu](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/main/README.md)<br/>
