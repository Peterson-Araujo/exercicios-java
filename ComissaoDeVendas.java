import java.util.Scanner;

public class ComissaoDeVendas {

    // Método para calcular comissão do vendedor
    public double calculoComissao(int porcentagem, double valor) {
        return valor * (porcentagem / 100.0);
    }

    // Método principal
    public static void main(String[] args) {

        // Instanciação de classes utilizadas
        Scanner sc = new Scanner(System.in);
        ComissaoDeVendas comissao = new ComissaoDeVendas();

        // Criação de variáveis
        String nomeDoVendedor;
        int porcentagem, quantidadeVendida, codigoDaPeca;
        double valor, precoDaPeca, resultado;

        System.out.println("--- Cálculo de comissão de vendas ---");
        System.out.println("______________________________________");

        // Solicitação de porcentagem de comissão, lançando excessão caso haja porcentagem <= 0
        System.out.print("Digite a porcentagem de comissão (sem o sinal de %): ");
        porcentagem = sc.nextInt();
        if (porcentagem <= 0) {
            throw new IllegalArgumentException("O valor da porcentagem não pode ser igual ou menor que zero!");
        }

        System.out.print("Digite o nome de identificação do vendedor: ");
        nomeDoVendedor = sc.next();

        System.out.print("Digite o código da peça: ");
        codigoDaPeca = sc.nextInt();

        // Solicitação de quantidade itens vendidos, lançando excessão caso a quantidade seja <= 0
        System.out.print("Digite a quantidade de peças vendidas: ");
        quantidadeVendida= sc.nextInt();
        if (quantidadeVendida <= 0) {
            throw new IllegalArgumentException("O valor da quantidade vendida não pode ser igual ou menor que zero!");
        }

        // Solicitação de preço da peça, lançando excessão caso o preço seja <= 0
        System.out.print("Digite o preço da peça: ");
        precoDaPeca = sc.nextDouble();
        if (precoDaPeca <= 0) {
            throw new IllegalArgumentException("O valor do preço da peça não pode ser igual ou menor que zero!");
        }

        valor = precoDaPeca * quantidadeVendida;
        resultado = comissao.calculoComissao(porcentagem, valor); // Chamada do método de cáclulo

        // Mostrando na tela o resultado, trazendo o nome do vendedor, valor e resultado
        System.out.printf(
                "O vendedor %s obteve R$ %.2f em vendas e deverá receber R$ %.2f em comissão",
                nomeDoVendedor,
                valor,
                resultado
        );

        // Fechamento do Scanner
        sc.close();
    }
}
