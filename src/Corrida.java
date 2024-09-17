public class Corrida {
    private Passageiro passageiro;
    private Motorista motorista;
    private Veiculo veiculo;
    private String destino;
    private double preco;
    private double distancia;
    private int tempo;
    private String status;
    private static final double tarifa_corrida = 5.0;
    private static final double preco_KM = 1.5; //final pois seu valor só pode mudar quando acaba a corrrida e inicia outra.
    private static final double preco_min = 0.5;

    public Corrida(Passageiro passageiro, Motorista motorista, Veiculo veiculo, String destino, double distancia, int tempo) {
        this.passageiro = passageiro;
        this.motorista = motorista;
        this.veiculo = veiculo;
        this.destino = destino;
        this.distancia = distancia;
        this.tempo = tempo;
        this.preco = calcularPreco();
        this.status = "Aguardando";
    }

    public double calcularPreco() {
        // Preço total = tarifa base + (preço por km * distância) + (preço por minuto * tempo)
        return tarifa_corrida + (preco_KM * distancia) + (preco_min * tempo); //continha para valor de corrida
    }

    public void atualizarStatus(String novoStatus) {
        this.status = novoStatus;
        System.out.println("Status da corrida: " + status);
    }

    public void iniciarCorrida() {
        System.out.println("Corrida para " + destino + " foi iniciada.");
        atualizarStatus("Em andamento");
    }

    public void exibirDetalhes() {
        System.out.println("Detalhes da Corrida:");
        System.out.println("Passageiro: " + passageiro);
        System.out.println("Motorista: " + motorista);
        System.out.println("Destino: " + destino);
        System.out.println("Preço: " + preco);
        System.out.println("Status: " + status);
    }

    public double getPreco() {
        return preco;
    }
}
