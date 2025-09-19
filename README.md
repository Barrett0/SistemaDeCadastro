# 📌 Sistema de Cadastro (Spring Boot)

Este é um projeto simples de **Sistema de Cadastro de Usuários** feito em **Java + Spring Boot**.  
Ele permite **cadastrar, listar, buscar, atualizar e deletar usuários**.

---

## 🚀 Tecnologias utilizadas
- Java 17+  
- Spring Boot  
- Spring Data JPA  
- H2 Database (memória)  

---

## ▶️ Como rodar o projeto

1. Clone o repositório:
   ```bash
   git clone https://github.com/Barrett0/SistemaDeCadastro.git

   Abra no Eclipse/IntelliJ ou rode no terminal:

./mvnw spring-boot:run


A aplicação estará disponível em:

http://localhost:8080

📌 Endpoints da API
➤ Listar todos usuários

GET /usuarios

➤ Buscar usuário por ID

GET /usuarios/{id}

➤ Cadastrar novo usuário

POST /usuarios
Body (JSON):

{
  "nome": "João da Silva",
  "email": "joao@email.com"
}

➤ Atualizar usuário

PUT /usuarios/{id}
Body (JSON):

{
  "nome": "João Atualizado",
  "email": "joao@email.com"
}

➤ Deletar usuário

DELETE /usuarios/{id}

📂 Estrutura básica do projeto
src/
 ├─ main/java/controller/UsuarioController.java
 ├─ main/java/repository/UsuarioRepository.java
 ├─ main/java/model/Usuario.java
 └─ SistemaDeCadastroApplication.java

📖 Observações

O banco de dados usado é o H2 (em memória) → ao reiniciar a aplicação, os dados são apagados.

Você pode trocar para MySQL ou PostgreSQL editando o application.properties.

✍️ Autor: Barrett0
📌 Repositório: SistemaDeCadastro
