# Uber-Code-Challenger
Desafio do Uber 

Uber Code Challenge: Email Sender
Descrição
Este projeto é uma implementação do desafio de código do Uber para um serviço de envio de e-mails, desenvolvido em Java utilizando o Spring Boot. O objetivo é fornecer um serviço que possa enviar e-mails utilizando AWS SES (Simple Email Service). Devido a restrições de configuração, a integração com AWS não foi concluída, mas as instruções para configurar estão incluídas abaixo.

Tecnologias Utilizadas
Java
Spring Boot
Maven
Funcionalidades
Enviar e-mails através de um serviço RESTful.
Configuração fácil para integração com AWS SES.
Pré-requisitos
Java 11 ou superior
Maven 3.6.3 ou superior
Conta na AWS para configurar o SES (Simple Email Service)
Git para controle de versão
Configuração e Execução do Projeto
1. Clonar o repositório
bash
Copiar código
git clone https://github.com/Matensy/Uber-Code-Challenger.git
cd Uber-Code-Challenger
2. Configurar AWS SES
Para configurar o AWS SES, você precisa de uma conta AWS. Siga os passos abaixo para configurar:

Criar uma Conta AWS: Vá para AWS e crie uma conta.
Configurar SES:
No Console de Gerenciamento AWS, procure por "SES" e abra o serviço.
Verifique seu e-mail no SES.
Obtenha suas credenciais AWS (Access Key ID e Secret Access Key).
Configurar Credenciais no Projeto:
Crie um arquivo application.properties na pasta src/main/resources e adicione as seguintes configurações:
properties
Copiar código
spring.mail.host=email-smtp.us-east-1.amazonaws.com
spring.mail.port=587
spring.mail.username=SEU_ACCESS_KEY_ID
spring.mail.password=SEU_SECRET_ACCESS_KEY
spring.mail.properties.mail.transport.protocol=smtp
spring.mail.properties.mail.smtp.auth=true
spring.mail.properties.mail.smtp.starttls.enable=true
spring.mail.properties.mail.debug=true
3. Construir o Projeto
bash
Copiar código
mvn clean install
4. Executar o Projeto
bash
Copiar código
mvn spring-boot:run
Endpoints
Enviar E-mail
POST /send-email

Request Body
json
Copiar código
{
  "to": "destinatario@example.com",
  "subject": "Assunto do E-mail",
  "body": "Corpo do e-mail"
}
Estrutura do Projeto
plaintext
Copiar código
.
├── src
│   ├── main
│   │   ├── java
│   │   │   └── com
│   │   │       └── example
│   │   │           └── emailsender
│   │   │               ├── EmailSenderApplication.java
│   │   │               ├── controller
│   │   │               │   └── EmailController.java
│   │   │               ├── service
│   │   │               │   └── EmailService.java
│   │   └── resources
│   │       └── application.properties
└── pom.xml
Futuras Melhorias
Integração com outras plataformas de e-mail.
Melhorar a documentação com exemplos de casos de uso.
Adicionar testes unitários e de integração.
Contribuição
Contribuições são bem-vindas! Por favor, abra uma issue ou envie um pull request para contribuir.

Licença
Este projeto está licenciado sob a MIT License.
