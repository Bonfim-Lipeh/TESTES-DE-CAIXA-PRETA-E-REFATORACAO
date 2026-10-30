package calculadora;

/**
 * Classe de testes unitários da {@link Calculadora}.
 *
 * <p>Cada teste exibe no console as <strong>entradas utilizadas</strong>, o
 * <strong>resultado esperado</strong> e o <strong>resultado obtido</strong>,
 * informando ao final se o teste foi aprovado (PASSOU) ou reprovado (FALHOU).</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class TesteCalculadora {

    /** Contador de testes aprovados. */
    private static int aprovados = 0;

    /** Contador de testes reprovados. */
    private static int reprovados = 0;

    /**
     * Ponto de entrada: executa todos os testes da calculadora.
     *
     * @param args argumentos de linha de comando (não utilizados)
     */
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("===== TESTES DA CALCULADORA =====");

        testarOperacao(calc, "Soma",          2,  3, "+", 5);
        testarOperacao(calc, "Subtração",    10,  4, "-", 6);
        testarOperacao(calc, "Multiplicação", 3,  5, "*", 15);
        testarOperacao(calc, "Divisão",       8,  2, "/", 4);

        testarExcecao(calc, "Divisão por zero",    8, 0, "/",
                "Divisão por zero não é permitida.");
        testarExcecao(calc, "Operação inválida",   5, 5, "x",
                "Operador inválido: x");

        System.out.println("\n===== RESUMO =====");
        System.out.println("Aprovados: " + aprovados + " | Reprovados: " + reprovados);
    }

    /**
     * Testa uma operação que deve retornar um resultado válido.
     *
     * @param calc     instância da calculadora a ser testada
     * @param nome     nome descritivo do teste
     * @param a        primeiro operando
     * @param b        segundo operando
     * @param operador operador da operação
     * @param esperado resultado esperado
     */
    private static void testarOperacao(Calculadora calc, String nome,
                                       int a, int b, String operador, int esperado) {
        int obtido = calc.calcular(a, b, operador);
        registrar(nome, a + " " + operador + " " + b,
                String.valueOf(esperado), String.valueOf(obtido),
                esperado == obtido);
    }

    /**
     * Testa uma operação que deve lançar {@link IllegalArgumentException}.
     *
     * @param calc             instância da calculadora a ser testada
     * @param nome             nome descritivo do teste
     * @param a                primeiro operando
     * @param b                segundo operando
     * @param operador         operador da operação
     * @param mensagemEsperada mensagem esperada na exceção
     */
    private static void testarExcecao(Calculadora calc, String nome,
                                      int a, int b, String operador,
                                      String mensagemEsperada) {
        String obtido;
        try {
            obtido = "Sem exceção (resultado " + calc.calcular(a, b, operador) + ")";
        } catch (IllegalArgumentException e) {
            obtido = e.getMessage();
        }
        registrar(nome, a + " " + operador + " " + b,
                mensagemEsperada, obtido, mensagemEsperada.equals(obtido));
    }

    /**
     * Imprime o resultado de um teste e atualiza os contadores.
     *
     * @param nome     nome do teste
     * @param entrada  entradas utilizadas
     * @param esperado resultado esperado
     * @param obtido   resultado obtido
     * @param passou   {@code true} se o teste foi aprovado
     */
    private static void registrar(String nome, String entrada,
                                  String esperado, String obtido, boolean passou) {
        if (passou) {
            aprovados++;
        } else {
            reprovados++;
        }
        System.out.println("\nTeste: " + nome);
        System.out.println("  Entrada  : " + entrada);
        System.out.println("  Esperado : " + esperado);
        System.out.println("  Obtido   : " + obtido);
        System.out.println("  Status   : " + (passou ? "PASSOU" : "FALHOU"));
    }
}
