# FiapRide - Sistema de Gestão

Este projeto é uma aplicação Java inicial desenvolvida para demonstrar conceitos fundamentais de **Programação Orientada a Objetos (POO)**, como a criação de classes, atributos, métodos e a instanciação de objetos.

## 🚀 O que o projeto representa?

O sistema simula o gerenciamento de dois elementos distintos que podem ser encontrados no cotidiano de um serviço de transporte ou ambiente acadêmico:

1. **Passageiro:** Representa o usuário do sistema, contendo informações básicas como nome e saldo financeiro.
2. **Caneta:** Uma abstração de um objeto físico (utensílio de escrita) usado para validar estados como disponibilidade de tinta e proteção da ponta (tampa).

---

## 🛠️ Detalhes das Classes

### 1. Classe `Caneta`

A classe `Caneta` modela o comportamento e as características de uma caneta física.

* **Atributos:**
* `cor`: Define a cor da tinta ou do corpo da caneta.
* `material`: Define do que a caneta é feita (ex: Plástico, Metal).
* `tampa`: Um valor booleano que indica se a caneta está protegida.
* `tinta`: Um valor booleano que indica se ainda há carga disponível.


* **Métodos (Comportamentos):**
* `estaTampada()`: Verifica o atributo `tampa` e imprime no console se o objeto está protegido ou não.
* `temTinta()`: Verifica o atributo `tinta` e informa se a caneta está pronta para o uso ou vazia.



### 2. Classe `Passageiro`

Representa o modelo de um cliente dentro do ecossistema FiapRide.

* **Atributos:** `nome` e `saldo`.

---

## 💻 Como usar

Para utilizar as classes, basta instanciá-las dentro de um método `main`, como demonstrado no arquivo `SistemaPrincipal.java`:

```java
// Criando uma nova caneta
Caneta minhaCaneta = new Caneta("Azul", "Plástico", true, true);

// Verificando o estado da caneta
minhaCaneta.estaTampada(); // Saída: A caneta está tampada
minhaCaneta.temTinta();    // Saída: A caneta tem tinta

```

---

## 📊 Diagrama de Classe (UML)

O modelo da classe `Caneta` segue a estrutura abaixo:

---
