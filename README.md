# Desafios Beca (NTT DATA Europe & LATAM).
# Monique Parente [![Blog](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/monique13/) | Categoria: Desenvolvedora Jr. 
# Mentor: Flavius Gama.
______________________________________________________________________________________________________________________________________________________________________________

![Monique GitHub stats](https://github-readme-stats.vercel.app/api?username=MoniqueParente&show_icons=true&theme=radical)
______________________________________________________________________________________________________________________________________________________________________________

⭕ Criação dos repositorois.

⭕ Configuração Bando de dados H2 Database.

⭕ Implementando camada service.
______________________________________________________________________________________________________________________________________________________________________________

⚜ Criação dos repositorois.

Para identificar um repositório é necessário a assinatura: @Repository

Exemplo:

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
}

!! Obs: Respositório deve ser criado para cada uma das entidades que constam na modelagem.

⚜ Configuração Bando de dados H2 Database.

H2 Database é um banco de dados relacional escrito em Java, link: http://localhost:8080/h2-console/

Para conectar sua aplicação ao H2 Database: 

Clique em resources 
Em aplication.properties, adicione esse código:

spring.datasource.url=jdbc:h2:mem:testdb  //testdb = este nome pode ser personalizado de acordo com sua aplicação.
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect

⚜ Implementando camada service.

Apartir do código implementado no IntelliJ, os nomes das classes, atributos e os dados deven ser inseridos no Postman, utilizando JSON.

Após os dados inseridos e compilados em JSON no Postman ,os dados vão ser visualizados no H2 Database, em suas respectivas classes.

‼ Obs: As dados vinculados às entidade no H2 Database não vão ser salvos, caso reiniciei a aplicação no IntelliJ,
será necessrário encerrir todos os dados novamente.

Mais informações:

* Postman tem como função testar e desenvolver APIs.

* JSON é o acrônimo de JavaScript Object Notation, isso significa que usa-se uma formatação de texto que é semelhante à sintaxe de declaração de um objeto na linguagem JavaScript.

______________________________________________________________________________________________________________________________________________________________________________
✨ [Menu](https://github.com/MoniqueParente/DesafiosBecaMoniqueParente/blob/main/README.md)<br/>
