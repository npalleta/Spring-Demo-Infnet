# Spring-Demo-Infnet

## 📋 Introdução

Projeto para a INFNET - Curso de Devops e Integração Contínua.

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
* Ter instalada a versão do Java JDK 17 ou superior;
* Ter instalado o Apache Maven 3.x.x;
* Utilizar uma IDE para Java - Eclipse, IntelliJ ou Visual Studio Code;
* Ter instalado o MySQL 5.7 ou superior;
* Ter instalado o Docker e Docker Compose.

## 🚀 Realizando o Setup

Clone o repositório:

```bash
git clone https://github.com/npalleta/Spring-Demo-Infnet.git
```

Crie um banco de dados no MySQL:

```bash
create database notes_app
```

Gere o build do projeto:

- Antes você pode rodar os testes unitários utilizando o comando:

```bash
mvn test -Dtest="NoteControllerTest" <-- Classe que contém os testes
```

```bash
mvn clean package ou  mvn clean install -U
java -jar target/SpringDemo-0.0.1-SNAPSHOT.jar
```
Alternativamente, você pode rodar dessa forma:

```bash
mvn spring-boot:run
```

## 🏃 Rodando o projeto com Docker

Para executar o projeto utilizando o docker, execute o comando:

```bash
docker compose up -d
```

Para desmontar o projeto (containers, volume, network), execute o comando:

```bash
docker compose down
```

O app vai rodar nesse endereço <http://localhost:8080>.

As chamadas das APIs se encontram na collection do Postman **MySQL-Spring-Test.postman_collection.json**.

Caso o comando *docker compose up -d* não funcione, rode o *docker compose down* e após isso, rode o compose novamente. 

[⬆ Voltar ao topo](#Spring-Demo-Infnet)

---