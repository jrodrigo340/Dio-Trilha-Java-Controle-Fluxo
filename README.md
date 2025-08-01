# DesafioControleFluxo

Este projeto é um exercício prático proposto no módulo de **Controle de Fluxo** da plataforma **DIO (Digital Innovation One)**.  
O objetivo é aplicar estruturas condicionais, laços de repetição e exceções personalizadas em Java, criando um programa que simule uma contagem controlada por parâmetros fornecidos pelo usuário.

## 🧠 Descrição do Desafio

O sistema deve receber dois parâmetros inteiros via terminal:
- O **primeiro número**
- O **segundo número** (obrigatoriamente maior que o primeiro)

Com base nesses dois valores, o programa irá calcular quantas vezes deve iterar (loop `for`) e imprimir no console mensagens do tipo:

```
Imprimindo o número 1  
Imprimindo o número 2  
...  
Imprimindo o número N  
```

Caso o segundo número seja **menor ou igual ao primeiro**, o programa deverá lançar uma exceção personalizada chamada `ParametrosInvalidosException`, com a seguinte mensagem:

```
O segundo parâmetro deve ser maior que o primeiro
```

---

## 📂 Estrutura de Arquivos

```
DesafioControleFluxo/
├── Contador.java
└── ParametrosInvalidosException.java
```

---

## ✅ Check-list de Requisitos Atendidos

| Requisito                                                                 | Status     |
|---------------------------------------------------------------------------|------------|
| Criar o projeto com o nome `DesafioControleFluxo`                        | ✅ Atendido |
| Criar a classe `Contador.java` para execução principal                   | ✅ Atendido |
| Criar a classe `ParametrosInvalidosException.java`                       | ✅ Atendido |
| Receber dois parâmetros do usuário via terminal                          | ✅ Atendido |
| Validar se o segundo parâmetro é maior que o primeiro                    | ✅ Atendido |
| Lançar exceção customizada com mensagem adequada                         | ✅ Atendido |
| Calcular a quantidade de interações (`for`)                              | ✅ Atendido |
| Imprimir mensagens de contagem formatadas corretamente                   | ✅ Atendido |
| Utilizar `System.out.print` ou `System.out.printf`                       | ✅ Atendido |
| Organizar o código de forma clara e modularizada                         | ✅ Atendido |

---

## 🧪 Como Executar o Programa

### Pré-requisitos
- JDK 8 ou superior instalado
- Terminal configurado com o `javac` e `java`

### Passos:

1. Compile os arquivos:
```bash
javac Contador.java ParametrosInvalidosException.java
```

2. Execute o programa:
```bash
java Contador
```

3. Siga as instruções do terminal:
```
Digite o primeiro parâmetro: 12
Digite o segundo parâmetro: 30
```

Saída esperada:
```
Imprimindo o número 1  
Imprimindo o número 2  
...
Imprimindo o número 18
```

---

## 🧑‍💻 Autor

Desenvolvido por **João Rodrigo** como parte do aprendizado no bootcamp da DIO.

---

## 🛠️ Tecnologias Utilizadas

- Java
- IntelliJ IDEA / VS Code (opcional)
- Terminal / Prompt de Comando

---

## 📚 Aprendizados

Este desafio reforça conceitos como:
- Entrada de dados via terminal
- Estruturas condicionais (`if`)
- Laços de repetição (`for`)
- Exceções customizadas
- Modularização e boas práticas em Java

---
