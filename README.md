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

*A API (LOCAL) vai rodar nesse endereço:* <http://localhost:9000>.

*A API (PROD) está publicada no endereço:* <https://spring-demo-infnet.herokuapp.com/api/notes>

As chamadas das APIs se encontram na collection do Postman **MySQL-Spring-Test.postman_collection.json**.

Caso o comando *docker compose up -d* não funcione, rode o *docker compose down* e após isso, rode o compose novamente. 

## 👨‍💻 Projeto da Disciplina

As rubricas estão nos links seguintes:

1. [- Actuator](projeto_da_disciplina/ACTUATOR.md);
2. [- Azure Pipeline](projeto_da_disciplina/AZURE_PIPELINE.md);
3. [- Papertrail](projeto_da_disciplina/PAPERTRAIL.md);
4. [- Prometheus](projeto_da_disciplina/PROMETHEUS.md);
5. [- Sonarcloud](projeto_da_disciplina/SONARCLOUD.md).
6. [- Terraform + AWS EC2](projeto_da_disciplina/TERRAFORM.md).

[⬆ Voltar ao topo](#Spring-Demo-Infnet)

---