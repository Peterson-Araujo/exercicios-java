/*
Faça um programa para pagamento de comissão de vendedores de peças, levando-se em consideração que sua
comissão será de 5% do total da venda e que você tem os seguintes dados:
- Identificação do vendedor
- Código da peça
- Preço unitário da peça
- Quantidade vendida
*/

import java.util.Scanner;

public class ComissaoDeVendas {

    // Método para calcular comissão do vendedor
    public double calculoComissao(int porcentagem, double valor) {
        return valor * (porcentagem / 100.0);
    }

    // Método principal
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ComissaoDeVendas comissao = new ComissaoDeVendas();

        String nomeDoVendedor;
        int porcentagem, quantidadeVendida, codigoDaPeca;
        double precoDaPeca, valor, resultado;

        System.out.println("--- Cálculo de Comissão de Vendas ---");
        System.out.println("______________________________________");

        try {
            // Solicitação da porcentagem de comissão
            System.out.print("Digite a porcentagem de comissão (sem o sinal de %): ");
            porcentagem = sc.nextInt();
            if (porcentagem <= 0) {
                throw new IllegalArgumentException("A porcentagem deve ser maior que zero!");
            }

            sc.nextLine(); // limpa o buffer do Scanner

            // Nome do vendedor
            System.out.print("Digite o nome de identificação do vendedor: ");
            nomeDoVendedor = sc.nextLine();

            // Código da peça
            System.out.print("Digite o código da peça: ");
            codigoDaPeca = sc.nextInt();

            // Quantidade vendida
            System.out.print("Digite a quantidade de peças vendidas: ");
            quantidadeVendida = sc.nextInt();
            if (quantidadeVendida <= 0) {
                throw new IllegalArgumentException("A quantidade vendida deve ser maior que zero!");
            }

            // Preço da peça
            System.out.print("Digite o preço da peça: ");
            precoDaPeca = sc.nextDouble();
            if (precoDaPeca <= 0) {
                throw new IllegalArgumentException("O preço da peça deve ser maior que zero!");
            }

            // Cálculo de valores
            valor = precoDaPeca * quantidadeVendida;
            resultado = comissao.calculoComissao(porcentagem, valor);

            // Exibição do resultado formatado
            System.out.printf(
                    "\n✅ O vendedor %s (cód. %d)\nrealizou R$ %.2f em vendas\n" +
                            "e receberá R$ %.2f de comissão (%.0f%%)\n",
                    nomeDoVendedor,
                    codigoDaPeca,
                    valor,
                    resultado,
                    (double) porcentagem
            );

        } catch (IllegalArgumentException e) {
            System.out.println("\nErro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("\nOcorreu um erro inesperado. Verifique os dados digitados.");
        } finally {
            sc.close();
            System.out.println("\nPrograma finalizado.");
        }
    }
}
