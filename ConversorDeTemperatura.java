/*
Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit. A fórmula de conversão de
temperatura a ser utilizada é F = (9 * C + 160) / 5, em que a variável F representa é a temperatura em graus
Fahrenheit e a variável C representa é a temperatura em graus Celsius.
*/

import java.util.Scanner;

public class ConversorDeTemperatura {

    public double conversorFahrenheit(double celsius) {
        return (9 * celsius + 160) / 5;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ConversorDeTemperatura conversor = new ConversorDeTemperatura();

        double temperaturaCelsius, resultado;

        System.out.println("..:: Conversor de Temperatura ::..");
        System.out.println("___________________________________");

        try {
            System.out.print("Digite o valor da temperatura, em Celsius, que deseja converter para Fahrenheit: ");
            temperaturaCelsius = sc.nextDouble();
            if(temperaturaCelsius < -273.15) throw new IllegalArgumentException();

            resultado = conversor.conversorFahrenheit(temperaturaCelsius);

            System.out.printf("A temperatura %.1fº Celsius convertida em Fahrenheit é de %.1fºF", temperaturaCelsius, resultado);

            sc.close();
        } catch (IllegalArgumentException e) {
            System.out.println("O valor mínimo absoluto na escala Celsius é de -273,15 °C!");
        } finally {
            System.out.println("\nPrograma finalizado...");
            sc.close();
        }
    }

}
