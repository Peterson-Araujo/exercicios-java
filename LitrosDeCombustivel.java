/*
Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um automóvel que faz
12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e a velocidade média.
Desta forma, será possível obter a distância percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.
Tendo o valor da distância, basta calcular a quantidade de litros de combustível utilizada na viagem com a
fórmula: LITROS_USADOS = DISTANCIA / 12. O programa deve apresentar os valores da velocidade média,
tempo gasto, a distância percorrida e a quantidade de litros utilizada na viagem. Dica: trabalhe com valores reais.
*/


import java.util.InputMismatchException;
import java.util.Scanner;

public class LitrosDeCombustivel {

    // metodo para calcular a distancia percorrida
    public double distanciaPercorrida(int tempoGastoMinutos, double velocidadeMedia) {
        double tempoEmHoras = tempoGastoMinutos / 60.0;
        return tempoEmHoras * velocidadeMedia;
    }

    // metodo para calcular o combustivel utilizado, atraves da distancia percorrida
    public double combustivelUtilizado(double distancia, int quilometrosPorLitros) {
        return distancia / quilometrosPorLitros;
    }

    // metodo principal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LitrosDeCombustivel consumo = new LitrosDeCombustivel();

        int tempoGasto, quilometrosPorLitros;
        double velocidadeMedia, distanciaPercorrida, combustivelUtilizado;

        System.out.println("Cálculo de quantidade de combustível utilizado em uma viagem");
        System.out.println("____________________________________________________________");
        System.out.println();

        try {
            System.out.print("Digite quantos quilômetros seu veículo faz por litro: ");
            quilometrosPorLitros = sc.nextInt();
            if (quilometrosPorLitros <= 0) throw new IllegalArgumentException(); // lançamento de exceção caso quilometrosPorLitros seja menor ou igual a zero

            System.out.print("Digite o tempo gasto da viagem (em minutos): ");
            tempoGasto = sc.nextInt();
            if (tempoGasto <= 0) throw new IllegalArgumentException(); // lançamento de exceção caso tempoGasto seja menor ou igual a zero

            System.out.print("Digite a velocidade média da viagem: ");
            velocidadeMedia = sc.nextDouble();
            if (velocidadeMedia <= 0) throw new IllegalArgumentException(); // lançamento de exceção caso velocidadeMedia seja menor ou igual a zero

            distanciaPercorrida = consumo.distanciaPercorrida(
                    tempoGasto,
                    velocidadeMedia
            );

            combustivelUtilizado = consumo.combustivelUtilizado(
                    distanciaPercorrida,
                    quilometrosPorLitros
            );

            System.out.printf("A sua viagem foi com velocidade média de %.1fkm e distância percorrida de %.1fkm. Levando em conta que seu veículo faz %d km/litro, você gastou de combustível um total de %.1fL!\n",
                    velocidadeMedia,
                    distanciaPercorrida,
                    quilometrosPorLitros,
                    combustivelUtilizado
            );
        } catch (InputMismatchException e) { // tratamento da exceção caso haja erro de entrada (. no lugar de , ou double no lugar de inteiro)
            System.out.println("\n Erro de entrada de dados!");
            System.out.println("• Use apenas números inteiros nos campos de 'tempo' e 'km por litro'.");
            System.out.println("• Use ponto (,) — e não vírgula (.) — para separar decimais em 'velocidade média'.");
        } catch (IllegalArgumentException e) { // tratamento para caso de algum valor das variáveis ser menor que zero
                System.out.println("O valor digitado deve ser maior do que zero!");
        } finally {
            System.out.println("Programa finalizado!");
            sc.close();
        }
    }

}
