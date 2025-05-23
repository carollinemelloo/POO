# 💊 Sistema de Gerenciamento de Estoque Hospitalar

Este projeto é uma aplicação simples desenvolvida em **Java**, utilizando os princípios da **Programação Orientada a Objetos (POO)**, com o objetivo de simular um sistema de controle de insumos hospitalares. A proposta faz parte de um estudo acadêmico sobre paradigmas de programação aplicados a contextos reais.

## 🎓 Objetivo Acadêmico

Este projeto foi desenvolvido como parte de um trabalho acadêmico sobre **paradigmas de programação**, com foco na aplicação prática do paradigma orientado a objetos em um cenário realista de **gestão hospitalar**. A intenção é demonstrar como conceitos como **encapsulamento**, **herança**, **polimorfismo** e **abstração** podem ser aplicados para construir sistemas robustos, modulares e escaláveis.

## 👩‍💻 Autoras

- Ana Beatriz Nunes  
- Ana Luiza Souto  
- Carolline Mello  

## 🧠 Paradigma Utilizado

O sistema foi implementado com base no **paradigma orientado a objetos**, explorando conceitos fundamentais como:

- **Encapsulamento**
- **Herança**
- **Polimorfismo**
- **Abstração**
- **Modularidade e coesão**

Esses conceitos permitem uma organização mais clara, reutilizável e escalável do código, ideal para aplicações críticas como o controle de estoque em ambientes hospitalares.

## 🛠️ Funcionalidades

- Cadastro de **medicamentos** e **equipamentos hospitalares**
- Controle de **entradas** e **saídas** de produtos
- Registro de **histórico de movimentações**
- Validação de estoque antes de saídas
- Simulação de vencimento e categorias de produto
- Listagem atualizada de todos os itens em estoque

## 🚀 Tecnologias Utilizadas

- **Java** (linguagem principal)
- **Visual Studio Code** (IDE de desenvolvimento)
- **JDK 21**
- **Git** e **GitHub** (controle de versão)

## 📸 Exemplo de Uso

```java
Estoque estoque = new Estoque();

Medicamento m1 = new Medicamento("Paracetamol", 100, "2025-10");
Medicamento m2 = new Medicamento("Dipirona", 50, "2024-12");
Equipamento e1 = new Equipamento("Bisturi", 20, "Cirúrgico");

estoque.adicionarItem(m1);
estoque.adicionarItem(m2);
estoque.adicionarItem(e1);

estoque.removerItem("Dipirona", 10);
estoque.removerItem("Bisturi", 5);

estoque.listarItens();
estoque.listarHistorico();
