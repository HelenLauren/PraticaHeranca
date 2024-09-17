import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Passageiro passageiro = new Passageiro("Helen Lauren", "Rua Rui Barbosa 123");
        Veiculo veiculoBlack = new VeiculoBlack("Lancer Evo X", "ABC-1234", "Preto", true, true);
        Motorista motorista = new Motorista("Felipe", veiculoBlack);
        Corrida corridaAtual = null;

        int opcao;
        do {
            System.out.println("1. Solicitar Corrida");
            System.out.println("2. Acompanhar Corrida");
            System.out.println("3. Pagar Corrida");
            System.out.println("4. Sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    scanner.nextLine();
                    System.out.println("Digite o destino:");
                    String destino = scanner.nextLine();
                    System.out.println("Digite a distância (em km):"); //solucao q achei, ja que nao tem banco de dados etc.
                    double distancia = scanner.nextDouble();
                    System.out.println("Digite o tempo estimado (em minutos):");
                    int tempo = scanner.nextInt();

                    passageiro.solicitarCorrida(destino, motorista, veiculoBlack, distancia, tempo);
                    corridaAtual = motorista.getCorridaAtual();

                    if (corridaAtual != null) {
                        System.out.println("Corrida solicitada com sucesso!");
                    } else {
                        System.out.println("Erro ao solicitar a corrida.");
                    }
                    break;

                case 2:
                    if (corridaAtual != null) {
                        passageiro.acompanharCorrida(corridaAtual);
                    } else {
                        System.out.println("Nenhuma corrida em andamento.");
                    }
                    break;

                case 3:
                    if (corridaAtual != null) {
                        passageiro.pagarCorrida(corridaAtual);
                        corridaAtual = null; //depois de pagar, encerra a corrida.
                    } else {
                        System.out.println("Nenhuma corrida em andamento.");
                    }
                    break;

                case 4:
                    System.out.println("Sistema finalizado.");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 4);

        scanner.close();
    }
}
/* esta meio ruinzinho mas funciona */
