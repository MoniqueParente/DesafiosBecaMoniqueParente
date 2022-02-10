# Desafios Beca (NTT DATA Europe & LATAM).
# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
# Mentor: Flavius Gama.
______________________________________________________________________________________________________________________________________________________________________________

![Monique GitHub stats](https://github-readme-stats.vercel.app/api?username=MoniqueParente&show_icons=true&theme=radical)
______________________________________________________________________________________________________________________________________________________________________________

⭕ Criação das classes controllers (CRUD).

⭕ Implementado o OpenAPI na Spring Rest.

⭕ Implementado ResponseEntity nos retornos das chamadas.

Linguagem de Programação: JAVA.
______________________________________________________________________________________________________________________________________________________________________________

⚜ Criação das classes e classes controllers (CRUD).

Post: @PostMapping

Patch: @PatchMapping("/{id}")

Delete: @DeleteMapping("/{id}")

Get (lista): @GetMapping()

Get (Id): @GetMapping("/{id}")

✅3️⃣	Ferramentas.
* Draw.io - Aplicar UML
* Intelij - Desenvolvimento Java.
* Postman - Simulação de Interface.
* H2 - Banco de Dados.

✅4️⃣ Linguage de Programação.

<div style="display: inline_block">
 <img alt="Java" src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" />
 
✅5️⃣ Frameworks.

* Spring Boot. 
* JPA.
* Lambdas.
* JDBC.
* JSON.
* Swagger.

✅6️⃣ Endpoints.
 
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
 
 Exemplo de uma requisição:
 POST `/venda`  
 ```json
 {
    "id": 1,
    "vendedor" : {
        "id" : 1,
        "nome" : "Eliezer"
    },
    "cliente" : {
        "id" : 1,
        "nome" : "Monique",
        "cpf" : "777.777.777-77"
    },
    "itemVendaList": [
        {
            "id" : 1,
            "valor" : 200.00,
            "quantidade" : 1,
            "produto" : {
                "id" : 1,
                "nome" : "Teclado",
                "marca" : "Redragon"
        }
       }
    ]
}
``` 
 
 ✅7️⃣ Tratamento de Erros.
 
 Tipos tratados:
 `/MethodArgumentNotValidException`
 `/UnexpectedTypeException`
 `/HttpMessageNotReadableException`
 
 
 
