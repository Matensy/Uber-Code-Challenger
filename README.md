# Desafio Uber Email Sender em Java

Este projeto é uma implementação do desafio Uber Email Sender em Java usando Spring Boot.

## Configuração da AWS

Para utilizar o serviço de envio de e-mails da AWS, é necessário configurar suas credenciais de acesso. Siga as instruções abaixo para configurar a AWS:

1. **Crie uma conta na AWS**: Acesse [Amazon Web Services](https://aws.amazon.com/pt/) e siga as instruções para criar uma conta. Se você já possui uma conta, pule para o próximo passo.

2. **Acesse o Console da AWS**: Faça login no [Console de Gerenciamento da AWS](https://aws.amazon.com/pt/console/), onde você poderá gerenciar todos os serviços da AWS.

3. **Obtenha suas credenciais de acesso**: Após fazer login no Console da AWS, vá para a seção "Minhas Credenciais" ou "Credenciais de Acesso" para obter suas chaves de acesso (Access Key ID e Secret Access Key).

4. **Configure suas credenciais localmente**: No seu ambiente de desenvolvimento, configure as credenciais da AWS. Você pode fazer isso definindo as variáveis de ambiente `AWS_ACCESS_KEY_ID` e `AWS_SECRET_ACCESS_KEY` com suas chaves de acesso.

## Como executar o projeto

### Pré-requisitos

- Java JDK 11 ou superior
- Maven
- IDE Java (opcional)

### Passos

1. Clone este repositório:

    ```bash
    git clone https://github.com/seu-usuario/uber-email-sender-java.git
    ```

2. Importe o projeto na sua IDE Java ou navegue até o diretório clonado e execute o seguinte comando para compilar e executar o projeto:

    ```bash
    mvn spring-boot:run
    ```

## Utilização

Após executar o projeto, você pode usar o Insomnia ou qualquer outra ferramenta de teste de API REST para enviar e-mails. O endpoint para enviar e-mails será algo como `POST /api/email`.

### Exemplo de Requisição (JSON)

```json
{
  "destinatario": "exemplo@example.com",
  "assunto": "Assunto do Email",
  "corpo": "Conteúdo do Email"
}
```

## Contribuindo

Contribuições são bem-vindas! Para maiores detalhes, veja [CONTRIBUTING.md](CONTRIBUTING.md).

## Licença

Este projeto é licenciado sob a [Licença MIT](LICENSE).
