# 🎬 Relatório Técnico do Projeto FEITV

Este documento é um relatório sobre o projeto programado em Java sobre catálogo de seríes e filmes.


## 📑 Índice
1. [Visão Geral do Projeto](#-visão-geral-do-projeto)
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

O sistema foi fei para ser executado em Desktop utilizando **Java** com interface gráfica baseada em Swing, feito no aplicativo Apache Netbeans 12.6 com integração ao banco de dados. A principal motivação do projeto é simular uma plataforma de streaming/catálogo digital, oferecendo aos usuários a capacidade de:

- Realizar cadastro e login.
- Visualizar detalhes de diferentes filmes e séries.
- Interagir com o conteúdo através de um sistema de "Curtidas".
- Organizar e agrupar conteúdo através da criação de **Playlists** personalizadas.
- Pesquisar títulos específicos na base de dados.
