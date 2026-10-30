package calculadora;

public class TesteCalculadora {

    private static int aprovados = 0;
    private static int reprovados = 0;

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("===== TESTES DA CALCULADORA (versao original) =====");

        // Testes rápidos
        testar(calc, "Soma",              2, 3, "+", 5);   // esperado: 5
        testar(calc, "Subtracao",        10, 4, "-", 6);   // esperado: 6
        testar(calc, "Multiplicacao",     3, 5, "*", 15);  // esperado: 15
        testar(calc, "Divisao",           8, 2, "/", 4);   // esperado: 4
        testar(calc, "Divisao por zero",  8, 0, "/", 0);   // divisao por zero -> 0
        testar(calc, "Operacao invalida", 5, 5, "x", 0);   // operação inválida -> 0

        System.out.println("\n===== RESUMO =====");
        System.out.println("Aprovados: " + aprovados + " | Reprovados: " + reprovados);
    }

    private static void testar(Calculadora calc, String nome, int a, int b, String op, int esperado) {
        System.out.println("\nTeste: " + nome);
        System.out.println("  Entrada  : " + a + " " + op + " " + b);
        int obtido = calc.calc(a, b, op);
        boolean passou = (obtido == esperado);
        if (passou) {
            aprovados++;
        } else {
            reprovados++;
        }
        System.out.println("  Esperado : " + esperado);
        System.out.println("  Obtido   : " + obtido);
        System.out.println("  Status   : " + (passou ? "PASSOU" : "FALHOU"));
    }
}
