# Gerenciamento-Usuarios-JPA-Hibernate
## Introdução

Este repositório contém a implementação de um sistema de gerenciamento de usuários utilizando **JPA** (Java Persistence API) e **Hibernate**. O projeto permite realizar operações de CRUD (Create, Read, Update, Delete) em uma base de dados relacional, com a criação de usuários, e funcionalidades para consultar, atualizar e listar usuários.

## Objetivos

- **Adicionar um novo usuário** ao banco de dados.
- **Alterar dados de um usuário** existente.
- **Consultar um usuário por ID**.
- **Listar todos os usuários** registrados na base de dados.
- **Usar JPA/Hibernate** para gerenciar a persistência de dados.
- **Garantir operações seguras e eficientes** utilizando EntityManager e transações.

## Funcionalidades

### Adicionar um Usuário

Permite a criação de um novo usuário com os campos **nome** e **e-mail**.

### Alterar um Usuário

Permite alterar os dados de um usuário existente no banco de dados, como seu nome e e-mail.

### Buscar um Usuário por ID

Consulta o banco de dados para recuperar um usuário específico com base no seu **ID**.

### Listar Todos os Usuários

Retorna todos os usuários registrados na base de dados, exibindo uma lista completa.

## Requisitos Funcionais

### CRUD de Usuários

- **Adicionar**: O sistema deve permitir adicionar novos usuários ao banco de dados.
- **Alterar**: O sistema deve permitir alterar os dados de um usuário existente.
- **Consultar**: O sistema deve permitir buscar um usuário por seu ID.
- **Listar**: O sistema deve listar todos os usuários registrados no banco de dados.

### Persistência com JPA/Hibernate

- O sistema utiliza **JPA** com **Hibernate** para gerenciamento da persistência dos dados.
- As transações de persistência são gerenciadas de forma explícita utilizando o **EntityTransaction**
