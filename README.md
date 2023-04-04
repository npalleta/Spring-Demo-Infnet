# Spring-Demo-Infnet

## 📋 Introdução

Projeto para a INFNET - Curso de Devops e .

## 💻 Pré-requisitos

Antes de começar, verifique se você atendeu aos seguintes requisitos:
* Possuir a versão do Java JDK 17 ou superior;
* Instalar o Apache Maven 3.x.x;
* Utilizar uma IDE para Java - Eclipse, IntelliJ ou Visual Studio Code;
* Instalar o MySQL 5.7 ou superior;
* Instalar o Docker e Docker Compose.

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

```bash
mvn clean package
java -jar target/SpringDemo-0.0.1-SNAPSHOT.jar
```
Alternativamente, você pode rodar dessa forma:

```bash
mvn spring-boot:run
```

## 🏃 Rodando o projeto com Docker

Para executar o projeto utilizando o docker, execute o comando:

```docker
docker compose up -d
```

Para desmontar o projeto (containers, volume, network), execute o comando:

```docker
docker compose down
```

O app vai rodar nesse endereço <http://localhost:8080>.

[⬆ Voltar ao topo](#Spring-Demo-Infnet)

---