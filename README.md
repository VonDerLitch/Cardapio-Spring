<h1>Cardápio</h1>
## Descrição do projeto 

<p align="justify">
  Projeto para colocar o aprendizado de Java/Spring em atividade com Front-end em Angular. Usando PGAdmin 4 com a IDE IntelliJ.
</p>

## Funcionalidades

:heavy_check_mark: Ver Cardápio  

:heavy_check_mark: Criar item

:heavy_check_mark: Excluir item  

:heavy_check_mark: Atualizar item

## Layout ou Deploy da Aplicação :dash:

> Link do deploy da aplicação. Em testes

... 

Ainda sendo trabalhado

## Pré-requisitos

<dl>POSTGRE "https://www.postgresql.org/download/"</dl>
<dl>PGAdmin4 "https://www.pgadmin.org/download/"</dl>
<dl>IntelliJ "https://www.jetbrains.com/pt-br/idea/download/?section=windows"</dl>
<dl>Insomnia "https://insomnia.rest/download"</dl>
<dl>JDK17 "https://www.oracle.com/br/java/technologies/downloads/"</dl>
<dl>Spring - Maven - Java - 3.1.5 Spring Boot - Jar "https://start.spring.io", Para melhor vizualização das dependências, veja o código.</dl>

## Como rodar os testes

Após instalar os Pré-requisitos é importante configurar o Application.properties
spring.datasource.url=jdbc:postgresql://localhost:porta/tabela
spring.datasource.driver-class-name=org.postgresql.Driver
spring.datasource.username= Nome do usuário
spring.datasource.password= Senha

Para o back-end
Usar insomnia para conectar e mandar POST e GET
Exemplo:localhost:8080/food
Com metodo GET ALL FOOD para mostrar a tabela e POST com codigo SQL para adicionar {
	"price": 12,
	"title": "Refrigerante",
	"image": ""
	
}
É importante ja ter criado a tabela "foods" dentro do banco de dados "food" ou modificar no codigo para o seu BD e TABLE, porém criei um db.migration que faz automáticamente.

## Resolvendo Problemas :exclamation:

Ainda sem topico

## Desenvolvedores/Contribuintes :octocat:
Niflheim.Morke
