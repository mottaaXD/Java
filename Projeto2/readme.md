## 📑 Índice
1. [Visão Geral do Projeto](#-visão-geral-e-escopo-do-projeto)
2. [Arquitetura do Sistema](#-arquitetura-do-sistema)
3. [Estrutura de Pacotes e Componentes](#-estrutura-de-pacotes-e-componentes)
    - [Model (Modelos de Domínio)](#-model-modelos-de-domínio)
    - [DAO (Acesso ao Banco de Dados)](#-dao-acesso-ao-banco-de-dados)
    - [Controller (Controladores de Fluxo)](#-controller-controladores-de-fluxo)
    - [View (Interface Gráfica)](#-view-interface-gráfica)
4. [Diagrama Lógico e Fluxo de Execução](#-diagrama-lógico-e-fluxo-de-execução)
5. [Modelagem do Banco de Dados](#-modelagem-do-banco-de-dados)
6. [Funcionalidades e Regras de Negócio](#-funcionalidades-e-regras-de-negócio)
7. [Instruções para Execução (Setup)](#-instruções-para-execução-setup)



## 📌 Visão Geral do Projeto

O sistema foi concebido como uma aplicação Desktop utilizando **Java** com interface gráfica (provavelmente baseada em Swing/JavaFX, estruturada no NetBeans). A principal motivação do projeto é simular uma plataforma de streaming ou catálogo digital (semelhante à Netflix ou Letterboxd), oferecendo aos usuários a capacidade de:

- Realizar cadastro e autenticação segura.
- Explorar e visualizar detalhes de diferentes obras audiovisuais separadas por categoria (Filmes e Séries).
- Avaliar/interagir com o conteúdo através de um sistema de "Curtidas" (Favoritos).
- Organizar e agrupar mídias através da criação de **Playlists** personalizadas.
- Pesquisar títulos específicos na base de dados.
