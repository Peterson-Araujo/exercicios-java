/*
Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
V = 3.14159 * R * R * A
Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcularVolume {

    private static double pi = 3.14159;

    public double calcularVolume(double raio, double altura){
        return pi * (Math.pow(raio, 2)) * altura;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalcularVolume calcularVolume = new CalcularVolume();

        double raio, altura, resultado;

        System.out.println("Calcular Volume de uma lata de óleo: ");
        System.out.println();

        try {
            System.out.print("Digite o valor do raio da lata: ");
            raio = scanner.nextDouble();
            if (raio < 0) throw new InputMismatchException();

            System.out.print("Digite agora o valor da altura da lata: ");
            altura = scanner.nextDouble();
            if (altura < 0) throw new InputMismatchException();

            resultado = calcularVolume.calcularVolume(raio, altura);

            System.out.printf("O valor do volume desta lata é de %.2f", resultado);


        } catch (InputMismatchException e) {
            System.out.println("Digite um valor válido (maior que 0)!");
        } finally {
            System.out.println("\nPrograma finalizado!");
            scanner.close();
        }
    }

}
