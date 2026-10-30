## Projeto_calculadora — Branch `Refatoracao`


## 📌 Descrição do Projeto
Módulo de calculadora em Java desenvolvido para a startup fictícia FinançApp (aplicativo mobile de controle de finanças pessoais). O módulo serve como motor de cálculos para funcionalidades como orçamento mensal, divisão de despesas e projeção de economias.
Esta branch (`Refatoracao`) contém a versão refatorada do código original, com tratamento de erros por exceções, testes com entrada/esperado/obtido e documentação JavaDoc completa.


## 🎯 Objetivo da Atividade
Desenvolver a capacidade prática de construção, validação, manutenção e documentação de software, aplicando: testes funcionais, testes unitários, tratamento de erros, refatoração, documentação técnica (JavaDoc) e versionamento com Git/GitHub.


## 🛠️ Tecnologias Utilizadas
Java (JDK 17 ou superior)
JavaDoc (documentação em HTML)
Git e GitHub (versionamento)
VS Code / Eclipse IDE
📁 Estrutura do Projeto
```
projeto_calculadora/
├── src/
│   └── calculadora/
│       ├── Calculadora.java
│       └── TesteCalculadora.java
├── docs/          <- JavaDoc gerado (abrir docs/index.html)
├── .gitignore
└── README.md
```
## ➕ Explicação das Operações:
O método `calcular(int a, int b, String operador)` seleciona a operação pelo operador informado:
Operador	Método	Descrição
`+`	`somar`	Retorna `a + b`
`-`	`subtrair`	Retorna `a - b`
`*`	`multiplicar`	Retorna `a * b`
`/`	`dividir`	Retorna `a / b` (divisão inteira)
Tratamento de erros
Divisão por zero → `IllegalArgumentException("Divisão por zero não é permitida.")`
Operador inválido (ou nulo) → `IllegalArgumentException("Operador inválido: ...")`

## 🔧 Refatorações Aplicadas
Extração de métodos: `somar`, `subtrair`, `multiplicar` e `dividir`.
Simplificação de condicionais: cadeia de `if/else if` substituída por `switch`.
Melhoria de nomes: `calc` → `calcular`, `op` → `operador`.
Constantes para os operadores (`SOMA`, `SUBTRACAO`, `MULTIPLICACAO`, `DIVISAO`), evitando magic strings.
Métodos puros: removido o atributo de estado `r` e os `System.out.println` de dentro da lógica de cálculo.
Erros por exceção em vez de retornar `0` silenciosamente.


## ▶️ Como Executar
```bash
cd src
javac -encoding UTF-8 -d ../out calculadora/*.java
java -cp ../out calculadora.TesteCalculadora
```
## 📖 Gerar o JavaDoc
```bash
cd src
javadoc -encoding UTF-8 -docencoding UTF-8 -charset UTF-8 -author -version -private -d ../docs -sourcepath . calculadora
```
Depois abra `docs/index.html` no navegador.
✅ Resultado da Execução dos Testes
```
===== TESTES DA CALCULADORA =====

Teste: Soma
  Entrada  : 2 + 3
  Esperado : 5
  Obtido   : 5
  Status   : PASSOU

Teste: Subtração
  Entrada  : 10 - 4
  Esperado : 6
  Obtido   : 6
  Status   : PASSOU

Teste: Multiplicação
  Entrada  : 3 * 5
  Esperado : 15
  Obtido   : 15
  Status   : PASSOU

Teste: Divisão
  Entrada  : 8 / 2
  Esperado : 4
  Obtido   : 4
  Status   : PASSOU

Teste: Divisão por zero
  Entrada  : 8 / 0
  Esperado : Divisão por zero não é permitida.
  Obtido   : Divisão por zero não é permitida.
  Status   : PASSOU

Teste: Operação inválida
  Entrada  : 5 x 5
  Esperado : Operador inválido: x
  Obtido   : Operador inválido: x
  Status   : PASSOU

===== RESUMO =====
Aprovados: 6 | Reprovados: 0
```
📸 Print da execução dos testes
<!-- SUBSTITUA pela imagem do seu terminal: coloque o arquivo em /imagens e ajuste o nome -->
![Print dos testes](imagens/print_testes.png)
📚 Print da Documentação JavaDoc
<!-- SUBSTITUA pela imagem do seu index.html aberto no navegador -->
![Print do JavaDoc](imagens/print_javadoc.png)
🔗 Link do Repositório
<!-- SUBSTITUA pelo link do seu repositório -->
https://github.com/SEU_USUARIO/projeto_calculadora
👤 Autor
Seu Nome — Atividade Individual — UX/UI e Testes de Software (F
