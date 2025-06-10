# 🖼️ API de Pintores e Obras de Arte

Esta é uma API RESTful construída com **Spring Boot** que permite gerenciar **pintores** e suas **obras de arte**. É possível realizar operações como cadastro, consulta, atualização e exclusão de registros.

## 🚀 Tecnologias utilizadas

- Java
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Lombok
- Swagger
- Maven

---

## ✅ Funcionalidades

### 🎨 Pintores

- `GET /pintores`: Listar todos os pintores  
- `GET /pintores/{id}`: Buscar pintor por ID  
- `POST /pintores`: Criar novo pintor  
- `PUT /pintores/{id}`: Atualizar pintor existente  
- `DELETE /pintores/{id}`: Remover pintor  

### 🖌️ Obras de Arte

- `GET /obras`: Listar todas as obras  
- `GET /obras/{id}`: Buscar obra por ID  
- `POST /obras`: Criar nova obra (associada a um pintor)  
- `PUT /obras/{id}`: Atualizar obra existente  
- `DELETE /obras/{id}`: Remover obra  

---

## 📋 Regras de Negócio

- Um pintor pode ter **várias obras de arte** associadas.
- Uma obra de arte **pertence somente a um pintor**.
- **Não é possível cadastrar uma obra de arte sem um pintor válido**.

---

## 📚 Documentação da API

Acesse a documentação interativa do Swagger localmente em:
http://localhost:8080/swagger-ui.html

Você verá uma interface como esta:
![Captura de tela 2025-06-09 211954](https://github.com/user-attachments/assets/3fa035c6-678e-4740-91f4-0f3df89ea8c4)

