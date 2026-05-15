# 🎬 Relatório Técnico do Projeto FEITV

Este documento é um relatório sobre o projeto programado em Java sobre catálogo de seríes e filmes.


## 📑 Índice
1. [Visão Geral do Projeto](#-visão-geral-do-projeto)
2. [Arquitetura do Sistema](#-arquitetura-do-sistema)
3. [Estrutura de Pacotes e Componentes](#-estrutura-de-pacotes-e-componentes)
    - [Model (Entidades)](#-model-Entidades)
    - [DAO (Acesso ao Banco de Dados)](#-dao-acesso-ao-banco-de-dados)
    - [Controller (Controladores de Interação)](#-controller-controladores-de-interação)
    - [View (Interface Gráfica)](#-view-interface-gráfica)
4. [Diagrama Lógico e Fluxo de Execução](#-diagrama-lógico-e-fluxo-de-execução)
5. [Modelagem do Banco de Dados](#-modelagem-do-banco-de-dados)
6. [Funcionalidades e Regras de Negócio](#-funcionalidades-e-regras-de-negócio)
7. [Instruções para Execução (Setup)](#-instruções-para-execução-setup)



## 📌 Visão Geral do Projeto

O sistema foi fei para ser executado em Desktop utilizando **Java** com interface gráfica baseada em Swing, feito no aplicativo Apache Netbeans 12.6 com integração ao banco de dados. A principal motivação do projeto é simular uma plataforma de streaming/catálogo digital, oferecendo aos usuários a capacidade de:

- Realizar cadastro e login.
- Visualizar detalhes de diferentes filmes e séries.
- Interagir com o conteúdo através de um sistema de "Curtidas".
- Organizar e agrupar conteúdo através da criação de **Playlists** personalizadas.
- Pesquisar títulos específicos na base de dados.

---

## 🏗 Arquitetura do Sistema


1. **MVC (Model-View-Controller)**: Separa as regras de negócio e dados (Model) da interface de usuário (View), utilizando os Controllers para realizar as interações do usuário com a tela.
2. **DAO (Data Access Object)**: Todos os arquivos da comunicação com o banco de dados (consultas SQL via JDBC) separadas em um pacote, garantindo que os controladores e modelos não precisem conhecer a infraestrutura de dados.

---

## 📂 Estrutura de Pacotes e Componentes

A organização das classes foi feita pensando em isolar ao máximo as responsabilidades:

### 📦 `model` (Entidades)
Classes que representam os atributos das entidades.
* **`Usuario.java`**: Representa os usuários da plataforma, armazenando informações de credenciais como usuario, nome de exibição e senha.
* **`Filme.java`**: Entidade para filmes, contendo atributos como nome, descrição, duração, o caminho do arquivo da imagem da capa.
* **`Serie.java`**: Entidade parecida ao filme, contém atributos como nome, quantidade de temporadas e episódios.

### 📦 `dao` (Acesso ao Banco de Dados)
Responsável por fazer operações relacionadas ao banco de dados utilizando a API JDBC.
* **`Conexao.java`**: Classe base que gerencia a abertura e fechamento da conexão com o banco de dados relacional.
* **`UsuarioDAO.java`**: Insere novos usuários, verifica as credenciais de login e atualiza informações do usuário.
* **`FilmeDAO.java` e `SerieDAO.java`**: Buscam os catálogos disponíveis no banco de dados, recuperam nomes por ID e fazem o filtro para o sistema de pesquisa.
* **`CurtidasDAO.java`**: Registra quais filmes ou séries o usuário marcou como curtido.
* **`PlaylistDAO.java`**: Lida com a criação de playlists e com a vinculação dos itens(séries ou filmes) a cada playlist selecionada.

### 📦 `controller` (Controladores de Interação)
O pacote é responsável por realizar interações do usuario com interface gráfica e processá-los no backend.
* **Autenticação e Perfil**:
  * `ControleLogin.java`: Verifica as credenciais junto ao `UsuarioDAO` e permite o acesso à Tela Principal.
  * `ControleCadastro.java`: Valida dados e realiza o cadastro de novos usuários.
  * `ControleAlterarLogin.java`: Permite que o usuário atualize o nome de exibição e senha.
* **Navegação e Resultados**:
  * `ControlePrincipal.java`: Carrega a tela principal após o login e inicializa os componentes da tela.
  * `ControlePesquisar.java`: Captura o termo digitado na barra de busca e retorna quatro instâncias, duas de filme e duas de série.
  * `ControleFilmeResultado.java` / `ControleSerieResultado.java`: Renderiza a tela de detalhes de um item específico selecionado.
  * `ControleTrocarTela.java`: Gerencia a navegação entre telas sem perder o contexto.
* **Interações (Curtidas e Playlists)**:
  * `ControleFilmesCurtidos.java` / `ControleSeriesCurtidas.java`: Renderizam a lista de série ou filme curtidos do usuário logado.
  * `ControlePlaylist.java`: Controla a lógica de criação e edição das playlists.
  * `ControleListarPlaylist.java`: Exibe as playlists criadas pelo usuário.
  * `ControleConteudoPlaylist.java`: Permite a visualização dos itens incluídos dentro de uma playlist específica.
  * `ControleSeletorPlaylist.java`: Interface pop-up para escolher em qual playlist o usuário quer adicionar o filme/série atual.

### 📦 `view` (Interface Gráfica)
Classes que concentram os componentes visuais (Botões, TextFields, Panels).
* **`TelaInicio.java`**: A Tela de login/cadastro.
* **`TelaPrincipal.java`**: A tela principal, uma tela que faz uso de *CardLayout* ou painéis trocáveis para exibir o menu principal, tela de pesquisa, playlists e filmes/séries curtidas, controlada pelo `ControleTrocarTela`.

### 📦 `main`
* **`Main.java`**: Classe responsável por instanciar `TelaInicio`.

---
