# API de Gerenciamento de Comércio para Mercearia
Esta é uma API desenvolvida em Java com o framework Spring Boot, projetada para facilitar o gerenciamento de comércio de uma mercearia. Ela fornece endpoints para cadastrar, listar, atualizar e remover produtos, além de permitir o registro de vendas.

## Recursos Principais
A API oferece os seguintes recursos principais:

- Cadastro de produtos: Permite cadastrar novos produtos, informando seu nome, preço, quantidade em estoque, entre outros detalhes relevantes.
- Listagem de produtos: Fornece a capacidade de listar todos os produtos disponíveis na mercearia.
- Atualização de produtos: Permite atualizar as informações de um produto existente, como preço, quantidade em estoque, entre outros.
- Remoção de produtos: Permite remover um produto do sistema com base no seu código identificador único.
- Registro de vendas: Possibilita o registro de vendas, informando os produtos vendidos e suas quantidades, calculando automaticamente o valor total da venda e atualizando o estoque dos produtos.

## Tecnologias utilizadas
- Java
- Spring Boot
- Spring Data JPA
- Banco de dados relacional (por padrão, a API utiliza o H2 Database em memória)

## Pré-requisitos
- Java JDK 8 ou superior instalado
- Maven instalado (opcionalmente, você pode utilizar o Maven Wrapper fornecido no projeto)

## Instalação e execução
- Clone este repositório: __`git clone https://github.com/seu-usuario/api-produtos.git`__
- Navegue até o diretório do projeto: __`cd api-produtos`__
- Execute o projeto usando o Maven Wrapper: __`./mvnw spring-boot:run (Linux/Mac) ou mvnw spring-boot:run`__ (Windows)
- A API estará disponível em: __`http://localhost:8080`__

## Endpoints
- __`GET /listar`__: Retorna todos os produtos cadastrados.
- __`POST /cadastrar`__: Cadastra um novo produto. Envie um objeto JSON com as informações do produto.
- __`PUT /alterar`__: Altera um produto existente. Envie um objeto JSON com as informações atualizadas do produto.
- __`DELETE /remover/{codigo}`__: Remove um produto pelo código.
- __`POST /vendas`__: Cadastra uma venda de produtos. Envie um objeto JSON com os códigos dos produtos e as quantidades.