# Modulo 3 - Consumer Kafka

Este repositório contém um microsserviço desenvolvido em **Java 21** com **Spring Boot** e **Spring Cloud Stream**, atuando como um consumidor de mensagens Kafka.

## 🛠 Implementação

O projeto utiliza o modelo de programação funcional do Spring Cloud.

- **Função**: `usuarioCriadoConsumer`
- **Tópico Kafka**: `usuario.criado`
- **Grupo de Consumo**: `usuarioCriadoGroup`
- **Lógica**: A aplicação consome mensagens do tópico especificado e exibe o conteúdo no console (log).

A configuração de binding do Kafka está definida no `application.yaml`, utilizando a abstração do Spring Cloud Stream.

## 🚀 Como executar

O projeto inclui um arquivo `docker-compose.yaml` que sobe toda a infraestrutura necessária (Zookeeper, Kafka e a Aplicação).

### Pré-requisitos
- Docker e Docker Compose instalados.

### Passos
1. Na raiz do projeto, execute:
   ```bash
   docker-compose up --build
   ```
2. O serviço `consumer` aguardará o Kafka estar pronto e iniciará a escuta no tópico `usuario.criado`.

## 🔄 Pipeline CI/CD

O projeto possui um workflow do GitHub Actions configurado em `.github/workflows/deploy-main.yaml`.

- **Trigger**: Push nas branches `main` ou `develop`.
- **Processo**:
  1. Checkout do código.
  2. Login no DockerHub (utilizando secrets).
  3. Build da imagem Docker.
  4. Push da imagem para o DockerHub com a tag `latest`.
