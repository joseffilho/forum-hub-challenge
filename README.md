# Tópicos API

## Descrição

Esta é uma API RESTful desenvolvida em Java com Spring Boot, que permite o cadastro, listagem, detalhamento, atualização e exclusão de tópicos. 
A aplicação também possui autenticação usando Spring Security.

## Funcionalidades

- **Cadastro de Tópicos:** Adiciona novos tópicos.
- **Listagem de Tópicos:** Retorna todos os tópicos cadastrados.
- **Detalhamento de Tópico:** Retorna os detalhes de um tópico específico.
- **Atualização de Tópico:** Atualiza as informações de um tópico existente.
- **Exclusão de Tópico:** Remove um tópico da base de dados.
- **Autenticação:** Segurança e proteção das rotas com Spring Security.

## Tecnologias Utilizadas

- Java 17
- Spring Boot 3
- Spring Security
- JPA / Hibernate
- H2 Database (para ambiente de desenvolvimento)
- mysql (para ambiente de produção)
- Maven

## Como Executar

### Pré-requisitos

- Java 17
- Maven
- mysql (se for utilizar o banco de dados em produção)

### Configuração do Banco de Dados

1. Configure seu banco de dados no arquivo `application.properties` ou `application.yml`:

    ```properties
    spring.datasource.url=jdbc:mysql://localhost/nome_do_banco
    spring.datasource.username=seu_usuario
    spring.datasource.password=sua_senha
    ```

### Executando a Aplicação

1. Clone o repositório:

    ```bash
    git clone https://github.com/seu-usuario/seu-repositorio.git
    cd seu-repositorio
    ```

2. Compile e execute a aplicação usando Maven:

    ```bash
    mvn clean install
    mvn spring-boot:run
    ```

3. A aplicação estará disponível em `http://localhost:8080`.

## Endpoints

### Autenticação

- **Login**
  -

### Tópicos

- **Cadastro de Tópico**
  - `POST /topicos`
  - Body: `{ "titulo": "Título do Tópico", "mensagem": "Mensagem do Tópico", "autor": "Autor do Tópico", "curso": "Curso Relacionado" }`

- **Listagem de Tópicos**
  - `GET /topicos`

- **Detalhamento de Tópico**
  - `GET /topicos/{id}`

- **Atualização de Tópico**
  - `PUT /topicos/{id}`
  - Body: `{ "titulo": "Novo Título", "mensagem": "Nova Mensagem" }`

- **Exclusão de Tópico**
  - `DELETE /topicos/{id}`

## Segurança

Esta aplicação usa Spring Security para autenticação e autorização. Apenas usuários autenticados podem acessar os endpoints.

## Contribuição

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests.

## Licença
