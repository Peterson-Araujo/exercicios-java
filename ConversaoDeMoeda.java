import java.util.Scanner;

public class ConversaoDeMoeda {

    // Método para converter a moeda
    public double calcularValorConvertido(double cotacao, double valor) {
        return valor * cotacao;
    }

    // Método principal
    public static void main(String[] args) {
        double cotacao, valor, resultado;

        Scanner sc = new Scanner(System.in);
        ConversaoDeMoeda conversor = new ConversaoDeMoeda();

        System.out.println("--- Conversor de Moedas ---");
        System.out.println();

        System.out.print("Digite o valor da cotação da moeda que deseja converter: ");
        cotacao = sc.nextDouble();
        System.out.print("Digite o valor que deseja converter: ");
        valor = sc.nextDouble();

        resultado = conversor.calcularValorConvertido(cotacao, valor);
        System.out.printf("O valor convertido na moeda é : %f", resultado);

        sc.close();
    }
}
