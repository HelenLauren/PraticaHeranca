public class VeiculoEconomico extends Veiculo{
    private boolean isEletrico;

    public VeiculoEconomico(String modelo, String placa, String cor) {
        super(modelo, placa, cor);
    }

    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("É elétrico: " + isEletrico);

    }
}
