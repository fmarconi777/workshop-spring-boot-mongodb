<a name="readme-top"></a>

<!-- PROJECT SHIELDS -->
<!--
*** I'm using markdown "reference style" links for readability.
*** Reference links are enclosed in brackets [ ] instead of parentheses ( ).
*** See the bottom of this document for the declaration of the reference variables
*** for contributors-url, forks-url, etc. This is an optional, concise syntax you may use.
*** https://www.markdownguide.org/basic-syntax/#reference-style-links
-->

[![Licence](https://img.shields.io/github/license/Ileriayo/markdown-badges?style=for-the-badge)](./LICENSE)
[![LinkedIn][linkedin-shield]][linkedin-url]



<!-- PROJECT LOGO -->
<br />
<div align="center">  

<h3 align="center">Workshop spring boot</h3>

  <p align="center">
    API para agendamento de aulas particulares. Facilita o agendamento e comunicação entre alunos e professores. MVP em desenvolvimento com funcionalidades básicas de cadastro, busca, agendamento e comunicação. Tecnologias: Java, Spring Boot e MySQL. Próximos passos: avaliações, pagamento online, notificações e app mobile.
    <br />
    <!-- <a href="https://github.com/github_username/repo_name"><strong>Explore the docs »</strong></a>
    <br />
    <br />
    <a href="https://github.com/github_username/repo_name">View Demo</a>
    ·
    <a href="https://github.com/github_username/repo_name/issues/new?labels=bug&template=bug-report---.md">Report Bug</a>
    ·
    <a href="https://github.com/github_username/repo_name/issues/new?labels=enhancement&template=feature-request---.md">Request Feature</a> -->
  </p>
</div>



<!-- TABLE OF CONTENTS -->
<details>
  <summary>Table of Contents</summary>
  <ol>
    <li>
      <a href="#about-the-project">Sobre o projeto</a>
      <ul>
        <li><a href="#built-with">Construído com</a></li>
      </ul>
    </li>
    <li>
      <a href="#getting-started">Como começar</a>
      <ul>
        <li><a href="#prerequisites">Pré-requisitos</a></li>
        <li><a href="#installation">Instalação
    </li>
    <li><a href="#usage">Como usar</a></li>
    <li><a href="#roadmap">Roadmap</a></li>
    <li><a href="#license">Licença</a></li>
    <li><a href="#contact">Contato</a></li>li> -->
  </ol>
</details>



<!-- ABOUT THE PROJECT -->
## Sobre o projeto


Este projeto tem como objetivo desenvolver uma API RESTful utilizando o framework Spring Boot para simular uma aplicação de microblog, similar ao Twitter. A API permitirá que usuários façam postagens, comentem postagens de outros usuários e sigam outros usuários. O projeto será utilizado como ferramenta de aprendizado prático do Spring Boot, explorando seus recursos e funcionalidades.

A API de microblog oferecerá as seguintes funcionalidades:

Cadastro de usuários: Usuários podem se cadastrar na plataforma, criando perfis com suas informações pessoais.
Criação de postagens: Usuários podem criar e publicar postagens na plataforma, compartilhando textos, imagens e links.
Visualização de postagens: Usuários podem visualizar as postagens de outros usuários.
Comentários em postagens: Usuários podem comentar as postagens de outros usuários, expressando suas opiniões e ideias.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



### Construído com

* [![Java][Java]][Java-url]
* [![Spring][Spring]][Spring-url]
* [![MongoDB][MongoDB]][MongoDB-url]
* [![Docker][Docker]][Docker-url]

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- GETTING STARTED -->
## Como começar

Adicionar instruções para iniciar o projeto...

### Pré-requisitos

* Java Development Kit (JDK) 21: O JDK é necessário para compilar e executar o código Java da aplicação. Você pode baixar o JDK em https://www.java.com/download/ie_manual.jsp.
* Maven 3.6 ou superior: O Maven é uma ferramenta de gerenciamento de projetos Java que facilita a construção, instalação e execução da aplicação. Você pode baixar o Maven em https://maven.apache.org/download.cgi.
* Docker: Versão 20.10.7 ou superior: O Docker é uma plataforma de containerização que será utilizada para executar o banco de dados MongoDB. Se necessário, faça o download e instale o Docker em https://www.docker.com/get-started/.

### Instalação

<strong>Configuração do Docker:</strong>

- O Docker deve estar instalado e configurado corretamente em seu sistema.
- O usuário utilizado para executar o Docker precisa ter permissões de sudo.
- O arquivo docker-compose.yml na raiz do projeto deve estar configurado com as variáveis de ambiente adequadas para o seu ambiente de desenvolvimento.

<br>

<strong>Configuração do ambiente:</strong>

- Instale o JDK e o Maven: Siga as instruções de instalação para cada software em seus respectivos sites.
- Configure o ambiente de desenvolvimento: Defina as variáveis de ambiente JAVA_HOME e MAVEN_HOME para apontar para os diretórios de instalação do JDK e do Maven, respectivamente.
- Crie um diretório para o projeto: Crie um diretório para armazenar o código da aplicação.
- Clone o repositório do projeto: Clone o repositório do projeto Git para o diretório que você criou na etapa anterior.
- Execute o comando no terminal.
```sh 
docker-compose up-d
```
- Abra o projeto no seu editor de código.

<p align="right">(<a href="#readme-top">back to top</a>)</p>



<!-- USAGE EXAMPLES -->
## Como usar

### Criar Usuário

**Descrição:** Este endpoint permite criar um novo usuário na plataforma.

**Endpoint:** POST /user

**Requisição JSON:**

```json
{
  "name": "Alex",
  "email": "alex@mail.com"
}
```
<br>

### Excluir um Usuário

**Descrição:** Este endpoint permite excluir um usuário específico pelo seu ID na plataforma.

**Endpoint:** DELETE /user/ID_do_usuário

<br>

### Atualizar um Usuário

**Descrição:** Este endpoint permite atualizar o cadastro de um usuário específico pelo seu ID na plataforma.

**Endpoint:** PUT /user/ID_do_usuário

<br>

### Buscar todos Usuários

**Descrição:** Este endpoint permite buscar todos os usuários na plataforma.

**Endpoint:** GET /user

<br>

### Buscar apenas um Usuário

**Descrição:** Este endpoint permite buscar um usuário específico pelo seu ID na plataforma.

**Endpoint:** GET /user/ID_do_usuário

<br>

### Buscar os posts de um Usuário

**Descrição:** Este endpoint permite buscar os posts de um usuário específico pelo seu ID na plataforma.

**Endpoint:** GET user/ID_do_usuário/posts

<br>

### Buscar apenas um post

**Descrição:** Este endpoint permite buscar um post específico pelo seu ID na plataforma.

**Endpoint:** GET /post/ID_do_post

<br>

<p align="right">(<a href="#readme-top">back to top</a>)</p>


<!-- LICENSE -->
## Licença
Distribuído sob a licença GNU AGPLv3. Veja `LICENSE.txt` para mais informações.

<p align="right">(<a href="#readme-top">back to top</a>)</p>





<!-- MARKDOWN LINKS & IMAGES -->
<!-- https://www.markdownguide.org/basic-syntax/#reference-style-links -->
[license-shield]: https://img.shields.io/github/license/github_username/repo_name.svg?style=for-the-badge
[license-url]: https://github.com/fmarconi777/workshop-spring-boot-mongodb/blob/master/LICENSE.txt
[linkedin-shield]: https://img.shields.io/badge/-LinkedIn-black.svg?style=for-the-badge&logo=linkedin&colorB=555
[linkedin-url]: https://www.linkedin.com/in/fmarconi777
[product-screenshot]: images/screenshot.png
[Java]: https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white
[Java-url]: https://www.java.com/pt-BR/
[Spring]: https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white
[Spring-url]: https://spring.io/
[MongoDB]: https://img.shields.io/badge/MongoDB-%234ea94b.svg?style=for-the-badge&logo=mongodb&logoColor=white
[MongoDB-url]: https://www.mongodb.com/
[Docker]: https://img.shields.io/badge/docker-%230db7ed.svg?style=for-the-badge&logo=docker&logoColor=white
[Docker-url]: https://www.docker.com/
