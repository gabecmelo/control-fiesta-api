# Festa Control API

Este projeto é uma API REST desenvolvida com **Spring Boot**, como exercício da disciplina de **Programação Orientada a Objetos**, ministrada pelo professor **Eliel Borges Nascimento**.

A aplicação permite o **cadastro e listagem de pessoas para uma festa**, aplicando validações de idade e persistindo os dados com JPA em um banco de dados em memória (H2).

## ✨ Tecnologias utilizadas

* Java 17
* Spring Boot

    * Spring Web
    * Spring Data JPA
* H2 Database
* Maven

## ✅ Funcionalidades

* Cadastro de pessoas (com validação de idade mínima de 18 anos)
* Listagem de todas as pessoas cadastradas
* Persistência em banco de dados em memória (H2)
* Tratamento global de erros com mensagens descritivas

## 📄 Endpoints da API

* `POST /pessoas`

    * Cadastra uma nova pessoa
    * Corpo (JSON):

      ```json
      {
        "nome": "Maria",
        "idade": 25
      }
      ```
* `GET /pessoas`

    * Retorna a lista de todas as pessoas cadastradas

## 💼 Estrutura do projeto

O projeto segue a arquitetura em camadas, separando bem as responsabilidades de cada componente:

### `controller`

Contém as classes responsáveis por receber e responder requisições HTTP.
No caso, `PessoaController` lida com as operações de cadastro e listagem de pessoas.

### `exception`

Define a classe `GlobalExceptionHandler`, que trata exceções de forma centralizada, retornando mensagens amigáveis para o cliente em caso de erro (como idade inválida).

### `model`

Contém as entidades JPA que representam as tabelas do banco. A classe `Pessoa` é mapeada para persistir nome e idade.

### `repository`

Interface que estende `JpaRepository`, permitindo operações de persistência (salvar, buscar, listar, etc) sem necessidade de implementação manual.

### `service`

Camada que encapsula as regras de negócio. A classe `PessoaService` executa lógicas como a validação da idade antes de salvar uma pessoa.

## 📂 Como executar o projeto

1. Clone o repositório:

   ```bash
   git clone https://github.com/seu-usuario/seu-repo.git
   ```

2. Acesse a pasta do projeto:

   ```bash
   cd festa-control
   ```

3. Execute com Maven:

   ```bash
   ./mvnw.cmd spring-boot:run
   
   ou
   
   ./mvnw spring-boot:run
   ```

4. Acesse os endpoints:

    * `POST http://localhost:8080/pessoas`
    * `GET  http://localhost:8080/pessoas`

---

Este projeto serve como aplicação prática dos princípios de orientação a objetos com uso de frameworks modernos.
