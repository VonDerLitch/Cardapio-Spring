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
<dl>Dependências precisam ser instaladas com o Maven</dl>
## Como rodar os testes

<p>Após instalar os Pré-requisitos é importante configurar o Application.properties</p>
<p>spring.datasource.url=jdbc:postgresql://localhost:porta/tabela</p>
<p>spring.datasource.driver-class-name=org.postgresql.Driver</p>
<p>spring.datasource.username= Nome do usuário</p>
<p>spring.datasource.password= Senha</p>

## Iniciando/Configurando banco de dados
<p>Usar insomnia para conectar e mandar POST e GET</p>
<p></p>Exemplo:localhost:8080/food</p>
<p></p>Com metodo GET ALL FOOD para mostrar a tabela e POST com codigo SQL para adicionar {</p>
	<p>"price": 12,</p>
	<p>"title": "Refrigerante",</p>
	<p>"image": ""</p>
	
<p>},</p>
<p>É importante ja ter criado a tabela "foods" dentro do banco de dados "food" ou modificar no codigo para o seu BD e TABLE, porém criei um db.migration que faz automáticamente.,</p>

## Resolvendo Problemas :exclamation:

<p>Erro : Please refer to dump files (if any exist) [date].dump, [date]-jvmRun[N].dump and [date].dumpstream.</p>
<h2>Para esse erro basta adicionar o plugin abaixo nas dependências</h2>

![image](https://github.com/VonDerLitch/Cardapio-Spring/assets/99680991/cb23e9d2-c9a2-42e2-b4f1-6cf84648c3c3)

<p>Se a porta 8080 já estiver em uso você pode fechar o serviço, no cmd com o comando "netstat -a -o -n" você consegue identificar o PID</p>

## Desenvolvedores/Contribuintes :octocat:
Niflheim.Morke
