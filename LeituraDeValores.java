/*
Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois da adição e multiplicação entre os
valores lidos, baseando-se na utilização do conceito de propriedade distributiva. Dica: se forem lidas as variáveis
A, B, C e D, devem ser somados e multiplicados os valores de A com B, A com C e A com D; depois B com C, B
com D e por último C com D. Note que para cada operação serão utilizadas seis combinações. Assim sendo,
devem ser realizadas doze operações de processamento, sendo seis para as adições e seis para as
multiplicações.
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class LeituraDeValores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] valores = new int[4];

        try {
            System.out.println("Digite 4 números inteiros para realizar a soma e multiplicação com propriedade distributiva: ");

            for (int i = 0; i < valores.length; i++){
                System.out.print("Digite o valor " + (i+1) + ": ");
                valores[i] = sc.nextInt();
            }

            System.out.println();

            for (int i = 0; i <= valores.length; i++) {
                for (int j = i + 1; j < valores.length; j++) {
                    System.out.printf("Soma: %d + %d = %d\n", valores[i], valores[j], (valores[i] + valores[j]));
                    System.out.printf("Multiplicação: %d * %d = %d\n\n", valores[i], valores[j], (valores[i] * valores[j]));
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("\nErro: Você deve digitar apenas números inteiros!");
        } finally {
            System.out.println("Programa finalizado...");
            sc.close();
        }
    }
}
