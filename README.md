## ☎️ APIRest com persistencia de dados em banco de dados
Este projeto consiste na criação de uma APIRest com persistencia em banco de dados
relacional (Postgres) containerizado, com foco em praticar toda essa parte pratica da
criação da APIRest utilizando Spring boot configurado com o Maven para as dependencia,
SpringWeb, Spring Data JPA, PostgreSQL Driver, containers com o docker e docker-compose,
banco de dados relacional com PostgreSQL e utilização do PGAdmin.

## 🛠️ Tecnologias Utilizadas
 - Java 17+
 - Spring Boot
   - Spring Web
   - Spring Data JPA
- PostgreSQL (containerizado via Docker)
- PgAdmin 4 (containerizado via Docker)
- Docker Compose
- Maven (gerenciamento de dependências)

## 📂 Estrutura do Projeto

```
api-rest-basica/
├── app/
│   └── src/
│       └── main/
│           ├── java/com.projetos.api_rest_basica/
│           │   ├── controller/        # Controladores REST
│           │   ├── model/              # Entidades JPA
│           │   ├── repository/         # Interfaces de acesso ao banco
│           │   └── service/            # Classe principal (main)
│           └── resources/
│               ├── static/
│               ├── templates/
│               ├── application.example.properties
│               └── application.properties
├── docker-compose.example.yml
├── docker-compose.yml
├── postgres-data/                       # Volume de dados do Postgres
├── pom.xml
└── README.md
```

## ⚙️ Arquivos de Configuração
O projeto contém arquivos de exemplo para configuração:

- application.example.properties
- docker-compose.example.yml

Esses arquivos não são utilizados diretamente pela aplicação ou pelos containers.
Eles servem como modelos contendo a estrutura e as chaves necessárias para funcionamento.

Para utilizar:
1. Copie o arquivo de exemplo para o nome efetivo esperado pelo sistema:

- application.example.properties ➜ application.properties
- docker-compose.example.yml ➜ docker-compose.yml

2. Edite o arquivo copiado inserindo suas credenciais e parâmetros reais.

- No application.properties, configure dados como spring.datasource.url, usuário e senha do banco.
- No docker-compose.yml, configure portas, nomes de containers, usuário, senha e nome do banco conforme necessário.

#### ⚠ Importante:

- Nunca altere diretamente os arquivos .example.* para uso, pois eles devem permanecer como referência limpa.
- O .gitignore já está configurado para impedir que credenciais reais sejam versionadas.

## 🐳 Containerização
A aplicação utiliza Docker Compose para orquestrar os seguintes serviços:

- **PostgreSQL** — Banco de dados relacional.
- **PgAdmin 4** — Interface gráfica para gerenciamento do banco.

O docker-compose.yml define a configuração necessária para subir os containers.

## 📡 Endpoints da API
A API expõe endpoints REST para gerenciamento de produtos (CRUD).
Os endpoints seguem a estrutura:

- GET /produtos — Lista todos os produtos
- GET /produtos/{id} — Busca produto por ID
- POST /produtos — Cria um novo produto
- DELETE /produtos/{id} — Remove produto

## 🧪 Testes
Os testes podem ser realizados utilizando:
- PgAdmin 4 — Verificação da criação e persistência de dados no banco.
- Postman — Execução de requisições HTTP para os endpoints da API.

## 🚀 Execução
O processo de execução do projeto envolve duas etapas principais: inicialização da infraestrutura e execução da aplicação.

1. Infraestrutura de Banco de Dados
   - Subir os containers definidos no docker-compose.yml, garantindo que o PostgreSQL e o PgAdmin estejam operacionais.
   - Confirmar que as credenciais utilizadas na aplicação correspondem às definidas no arquivo de configuração do banco.
   - Criar um database pelo PgAdmin, utilizando as mesmas autenticações do seu banco criado.

2. Aplicação Spring Boot

   - Com a infraestrutura ativa, executar a aplicação via Maven ou pela IDE configurada.
   - A aplicação utilizará automaticamente as configurações definidas no application.properties.

3. Testes e Validação
   - A comunicação entre a API e o banco de dados pode ser validada por consultas no PgAdmin ou execução de requisições HTTP via Postman.
   - Caso haja falha de conexão, revisar configurações de rede, portas expostas e credenciais.

#### ⚠ Observação:
-  Toda alteração de credenciais ou parâmetros no banco exige sincronização entre os arquivos application.properties e docker-compose.yml.

- O uso de arquivos .example garante que o repositório permaneça livre de informações sensíveis, devendo ser copiados e renomeados antes da execução.