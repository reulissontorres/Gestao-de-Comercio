# API de Produtos
Esta é uma API de exemplo para gerenciar produtos usando o Spring Boot.

## Funcionalidades
- Listar todos os produtos
- Cadastrar um novo produto
- Alterar um produto existente
- Remover um produto
- Cadastrar uma venda de produtos

## Tecnologias utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (por padrão, a API utiliza o H2 Database em memória)

## Pré-requisitos
- Java JDK 8 ou superior instalado
- Maven instalado (opcionalmente, você pode utilizar o Maven Wrapper fornecido no projeto)

## Instalação e execução
- Clone este repositório: __`git clone https://github.com/seu-usuario/api-produtos.git__`
- Navegue até o diretório do projeto: __`cd api-produtos__`
- Execute o projeto usando o Maven Wrapper: __`./mvnw spring-boot:run (Linux/Mac) ou mvnw spring-boot:run__` (Windows)
- A API estará disponível em: __`http://localhost:8080__`

## Endpoints
- __`GET /listar`__: Retorna todos os produtos cadastrados.
- __`POST /cadastrar`__: Cadastra um novo produto. Envie um objeto JSON com as informações do produto.
- __`PUT /alterar`__: Altera um produto existente. Envie um objeto JSON com as informações atualizadas do produto.
- __`DELETE /remover/{codigo}`__: Remove um produto pelo código.
- __`POST /vendas`__: Cadastra uma venda de produtos. Envie um objeto JSON com os códigos dos produtos e as quantidades.