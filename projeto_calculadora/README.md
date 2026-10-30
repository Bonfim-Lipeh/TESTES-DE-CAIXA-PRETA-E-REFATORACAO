# projeto_calculadora — Branch `main`

## 📌 Descrição do Projeto
Módulo de calculadora em Java desenvolvido para a startup fictícia **FinançApp** (aplicativo mobile de controle de finanças pessoais). Serve como motor de cálculos para funcionalidades como orçamento mensal, divisão de despesas e projeção de economias.

Esta branch (`main`) contém a **versão original (inicial)** do projeto, com a implementação da calculadora e os testes. A versão refatorada e documentada está na branch `Refatoracao`.

## 🎯 Objetivo da Atividade
Desenvolver a capacidade prática de construção, validação, manutenção e documentação de software, aplicando: testes funcionais, testes unitários, tratamento de erros, refatoração, documentação técnica (JavaDoc) e versionamento com Git/GitHub.

## 🛠️ Tecnologias Utilizadas
- Java (JDK 17 ou superior)
- Git e GitHub (versionamento)
- VS Code / Eclipse IDE

## 📁 Estrutura do Projeto
```
projeto_calculadora/
├── src/
│   └── calculadora/
│       ├── Calculadora.java
│       └── TesteCalculadora.java
├── imagens/
├── .gitignore
└── README.md
```

## ➕ Explicação das Operações
O método `calc(int a, int b, String op)` realiza a operação conforme o operador `op` e armazena o resultado no atributo `r`:

| Operador | Operação      | Comportamento                                              |
|----------|---------------|------------------------------------------------------------|
| `+`      | Soma          | `r = a + b`                                                |
| `-`      | Subtração     | `r = a - b`                                                |
| `*`      | Multiplicação | `r = a * b`                                                |
| `/`      | Divisão       | `r = a / b`; se `b == 0`, exibe erro e retorna `0`         |
| outro    | Inválida      | Exibe "Operacao invalida" e retorna `0`                    |

O programa nunca é interrompido por divisão por zero ou operador inválido: uma mensagem é exibida e o resultado retornado é `0`.

## ▶️ Como Executar
```bash
cd src
javac -encoding UTF-8 -d ../out calculadora/*.java
java -Dfile.encoding=UTF-8 -cp ../out calculadora.TesteCalculadora
```

## ✅ Resultado da Execução dos Testes
```
===== TESTES DA CALCULADORA (versao original) =====

Teste: Soma
  Entrada  : 2 + 3
Resultado = 5
  Esperado : 5
  Obtido   : 5
  Status   : PASSOU

Teste: Subtracao
  Entrada  : 10 - 4
Resultado = 6
  Esperado : 6
  Obtido   : 6
  Status   : PASSOU

Teste: Multiplicacao
  Entrada  : 3 * 5
Resultado = 15
  Esperado : 15
  Obtido   : 15
  Status   : PASSOU

Teste: Divisao
  Entrada  : 8 / 2
Resultado = 4
  Esperado : 4
  Obtido   : 4
  Status   : PASSOU

Teste: Divisao por zero
  Entrada  : 8 / 0
Erro: divisao por zero, operação irregular
Resultado = 0
  Esperado : 0
  Obtido   : 0
  Status   : PASSOU

Teste: Operacao invalida
  Entrada  : 5 x 5
Operacao invalida
Resultado = 0
  Esperado : 0
  Obtido   : 0
  Status   : PASSOU

===== RESUMO =====
Aprovados: 6 | Reprovados: 0
```

### 📸 Print da execução dos testes
<!-- SUBSTITUA pela imagem do seu terminal: coloque o arquivo em /imagens e ajuste o nome -->
![Print dos testes](imagens/print_testes.png)

## 🌿 Branches
- `main`: versão original (esta).
- `Refatoracao`: código refatorado, JavaDoc e pasta `docs/`.

## 🔗 Link do Repositório
<!-- SUBSTITUA pelo link do seu repositório -->
https://github.com/SEU_USUARIO/projeto_calculadora

## 👤 Autor
Seu Nome — Atividade Individual — UX/UI e Testes de Software (Facens)
