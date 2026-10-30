package calculadora;

/**
 * <p><strong>Projeto Calculadora</strong></p>
 *
 * <p>Esta classe fornece operações matemáticas básicas como soma, subtração,
 * multiplicação e divisão, além de um método principal que seleciona a operação
 * desejada com base em um operador informado pelo usuário.</p>
 *
 * <p>Esse projeto é utilizado para demonstrar:</p>
 * <ul>
 *     <li>Testes funcionais e unitários</li>
 *     <li>Tratamento de erros com exceções</li>
 *     <li>Aplicação de refatoração em código Java</li>
 *     <li>Documentação com Javadoc</li>
 * </ul>
 *
 * <p>Após a refatoração, os métodos desta classe são <strong>métodos puros</strong>,
 * sem efeitos colaterais, permitindo maior legibilidade e facilitando testes unitários.</p>
 *
 * @author Seu Nome
 * @version 1.0
 */
public class Calculadora {

    /** Operador que representa a soma. */
    public static final String SOMA = "+";

    /** Operador que representa a subtração. */
    public static final String SUBTRACAO = "-";

    /** Operador que representa a multiplicação. */
    public static final String MULTIPLICACAO = "*";

    /** Operador que representa a divisão. */
    public static final String DIVISAO = "/";

    /**
     * Soma dois números inteiros.
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @return o resultado da soma de {@code a} e {@code b}
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Subtrai o segundo número inteiro do primeiro.
     *
     * @param a minuendo (valor do qual será subtraído)
     * @param b subtraendo (valor a ser subtraído)
     * @return o resultado de {@code a - b}
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro fator
     * @param b segundo fator
     * @return o resultado de {@code a * b}
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide o primeiro número inteiro pelo segundo (divisão inteira).
     *
     * @param a dividendo
     * @param b divisor (não pode ser zero)
     * @return o resultado inteiro de {@code a / b}
     * @throws IllegalArgumentException se o divisor {@code b} for zero
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * <p>Executa a operação matemática solicitada com base no operador informado.</p>
     *
     * <p>Operadores aceitos:</p>
     * <ul>
     *     <li>"+" : Soma</li>
     *     <li>"-" : Subtração</li>
     *     <li>"*" : Multiplicação</li>
     *     <li>"/" : Divisão</li>
     * </ul>
     *
     * <p>Qualquer operador inválido resulta em exceção.</p>
     *
     * @param a primeiro operando
     * @param b segundo operando
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente ao operador informado
     * @throws IllegalArgumentException se o operador não for um símbolo válido
     *                                  ou se for solicitada uma divisão por zero
     */
    public int calcular(int a, int b, String operador) {
        if (operador == null) {
            throw new IllegalArgumentException("Operador inválido: null");
        }
        return switch (operador) {
            case SOMA          -> somar(a, b);
            case SUBTRACAO     -> subtrair(a, b);
            case MULTIPLICACAO -> multiplicar(a, b);
            case DIVISAO       -> dividir(a, b);
            default -> throw new IllegalArgumentException("Operador inválido: " + operador);
        };
    }
}
