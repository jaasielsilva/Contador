import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Recebendo os parâmetros via terminal
            System.out.println("Digite o primeiro número:");
            int primeiroParametro = scanner.nextInt();

            System.out.println("Digite o segundo número:");
            int segundoParametro = scanner.nextInt();

            // Validando os parâmetros
            if (primeiroParametro > segundoParametro) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }

            // Realizando as iterações e imprimindo os números
            contar(primeiroParametro, segundoParametro);

        } catch (ParametrosInvalidosException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
    }

    // Função para realizar as interações e imprimir os números
    static void contar(int primeiroParametro, int segundoParametro) {
        int quantidade = segundoParametro - primeiroParametro;
        for (int i = 1; i <= quantidade; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}
