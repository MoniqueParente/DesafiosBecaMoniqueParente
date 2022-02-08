# DesafiosBeca - MoniqueParente

Nome: Monique Parente Lima.|
Categoria: CJ Junior – Center.| 
Mentor: Flavius Gama.
______________________________________________________________________________________________________________________________________________________________________________
# Sumário

* Seja Bem-Vindo(a)!!

1️⃣	Pensamentos Iniciais de Estruturação.

2️⃣ Resumo da aplicação.

3️⃣ Ferramentas.

4️⃣ Frameworks.

5️⃣ Endpoints.

6️⃣ Controllers.

7️⃣ Services.

8️⃣ DTOs.

9️⃣ Mappers.

🔟 Tratamento de Erros.

______________________________________________________________________________________________________________________________________________________________________________
# Documentação

✅1️⃣ Pensamentos Iniciais de Estruturação. 

Para introduzir alguns pensamentos nesse tópico devemos planejar algumas estratégias que de início podem parecer imaturas porém vão se tornar mais concretas, ágeis e compactas para evitar erros de execução.  

Algumas dicas para estruturação de um sistema, pensar de forma objetiva, escolher um substantivo adequado para definir uma entidade, utilizar de raciocínio lógico inspirado em programação orienta objeto e por fim verificar a normalização. Existem diversos ambientes nos quais podem ser utilizados para realizar um Modelo de Entidade Relacional (MER), alguns exemplos: BrModelo, Draw.oi, entre outros.

✅2️⃣ Resumo da Aplicação.

Plano de Negócios.

A aplicação MP Peças tem como objetivo proporcionar a venda de produto que integra a montagem de um computador.
	Escopo do Produto
O produto final MP Peças consiste em uma aplicação para vendas.
As funções da aplicação consistem em cadastrar uma venda relacionada com os cadastros relacionados aos atributos das classes vendedor, cliente ,item venda e produto.   

![DIAGRAMACONCEITUALOFICIAL.PNG](DIAGRAMACONCEITUALOFICIAL.PNG)
 
 IDE utilizada na modelagem: Draw.io.

Conclusão, o usuário deste site poderá cadastrar uma venda através dos cadastros nos domínios, vendedor, cliente, item de venda e produto que constarão no sistema.

  •	Premissas: 
- Aplicação será desenvolvida de Segunda-Feira às Sextas-Feiras em horário comercial.

 •	Restrições:
- Tratamento de erros relacionados ao desenvolvimento e versionamento.

✅3️⃣	Ferramentas.
* Draw.io - Aplicar UML
* Intelij - Desenvolvimento Java.
* Postman - Simulação de Interface.
* H2 - Banco de Dados.

✅4️⃣	Frameworks
* JPA.
* Spring Boot.
* Lambdas.
* JDBC.
* JSON.
* Swagger.

✅5️⃣ Endpoints
 
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
 
 
 


