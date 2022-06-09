# PROJETO INTEGRADOR - URNA

A seguir você encontrará as instruções para rodar o backend na sua máquina:

## Tecnologias necessárias

## Eclipse
A IDE utilizada para rodar o projeto é o eclipse.

## MySQL
Necessário subir um banco local MySQL.

## JAVA

Na sua versão desejada.

## Instalação

Para rodar o projeto na sua máquina, é preciso verificar a versão do JAVA da sua máquina. No nosso projeto utilizamos a versão 1.8 (JDK 8), mas caso a sua seja diferente é só alterar a versão do java no arquivo pom.xml na tag properties:

```xml
<properties>
		<java.version>1.8</java.version>
	</properties>
```

Após alterar para a versão desejada, compilar o projeto.

Uma vez compilado, será necessário alterar os dados do banco de dados no application.properties: 

```java
spring.jpa.hibernate.ddl-auto=update
spring.datasource.url=jdbc:mysql://localhost:3306/nomeDoBanco
spring.datasource.username=usernameDoBanco
spring.datasource.password=senhaDoBanco
spring.datasource.driver-class-name =com.mysql.cj.jdbc.Driver
```

## Uso

Com tudo instalado e configurado na máquina, basta rodar o projeto selecionando-o com o botão direito > Run as > Java Application

# Membros

Fazem parte do desenvolvimento deste projeto os membros:

* Lucas Alves Vanderlei Pedroza - <01299366@sempreuninassau.com.br>
* José Vitor dos Santos - <01306023@sempreuninassau.com.br>
* Hugo Filipe Siqueira Costa - <01289269@sempreuninassau.com.br>
* Renato Loureiro de Lima - <01301758@sempreuninassau.com.br>
* Victor Nacimento Brito Moreno Neves - <01302036@sempreuninassau.com.br>
* Filipe Luan da Silva - <01386106@sempreuninassau.com.br>
* José Gabriel Rodrigues dos Santos - <01308482@sempreuninassau.com.br>
* Gabriel Gomes Nunes - <01384456@sempreuninassau.com.br>
