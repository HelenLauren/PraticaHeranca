public class Motorista {
    private String nome;
    private Veiculo veiculo;
    private Corrida corridaAtual;

    public Motorista(String nome, Veiculo veiculo) {
        this.nome = nome;
        this.veiculo = veiculo;
    }

    public void aceitarCorrida(Corrida corrida) {
        System.out.println("Corrida aceita pelo motorista " + nome);
        this.corridaAtual = corrida;
    }

    public void iniciarCorrida(Passageiro passageiro, String  destino, Veiculo veiculo, double distancia, int tempo) {
        this.corridaAtual = new Corrida(passageiro, this, veiculo, destino, distancia, tempo); // Correção
        System.out.println("Motorista " + nome + " iniciou a corrida.");
        corridaAtual.atualizarStatus("Em andamento");
    }

    public void concluirCorrida() {
        System.out.println("Corrida concluída.");
        corridaAtual.atualizarStatus("Concluída");
    }

    public void setCorridaAtual(Corrida corrida) {
        this.corridaAtual = corrida;
    }

    public Corrida getCorridaAtual() {   //nao consegui solucionar o get que funciona com o get no main
        return corridaAtual;
        /* nao sei oq colocar de retorno, o IntelliJ recomenda retornar Null, eu coloquei corridaAtual. */
    }
}
