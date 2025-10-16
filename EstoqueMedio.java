/*
* 1) Faça um programa para calcular o estoque médio de uma peça, sendo que:
* ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
*/

import java.util.Scanner;

public class EstoqueMedio {

    // Método para calcular e retornar o estoque médio
    public double calcularEstoqueMedio(int quantidadeMinima, int quantidadeMaxima) {
        return (quantidadeMinima + quantidadeMaxima) / 2.0;
    }

    // Método principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        EstoqueMedio estoque = new EstoqueMedio();

        System.out.println("..:: Cálculo de Estoque Médio ::..");

        System.out.print("Digite a quantidade mínima de itens: ");
        int quantidadeMinima = sc.nextInt();

        System.out.print("Digite a quantidade máxima de itens: ");
        int quantidadeMaxima = sc.nextInt();

        if (quantidadeMinima < 0 || quantidadeMaxima < 0) {
            System.out.println("Os valores não podem ser negativos.");
        } else if (quantidadeMaxima < quantidadeMinima) {
            System.out.println("A quantidade máxima deve ser maior ou igual à mínima.");
        } else {
            double resultado = estoque.calcularEstoqueMedio(quantidadeMinima, quantidadeMaxima);
            System.out.printf("O estoque médio do item é de: %.2f%n", resultado);
        }

        sc.close();
    }
}

