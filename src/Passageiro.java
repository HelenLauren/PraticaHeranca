public class Passageiro {
    private String nome;
    private String endereco;

    public Passageiro(String nome, String endereco) {
        this.nome = nome;
        this.endereco = endereco;
    }
    public void solicitarCorrida(String destino, Motorista motorista, Veiculo veiculo, double distancia, int tempo) {
        motorista.iniciarCorrida(this, destino, veiculo, distancia, tempo);  //vai chamr motorista p/ iniciar corrida.
    }

    public void acompanharCorrida(Corrida corrida) {
        System.out.println("Acompanhando a corrida...");
        corrida.exibirDetalhes();
    }
    public void pagarCorrida(Corrida corrida) {
        System.out.println("Corrida paga no valor de: R$ " + corrida.getPreco());
    }
}
