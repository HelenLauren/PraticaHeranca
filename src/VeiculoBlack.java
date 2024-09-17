public class VeiculoBlack extends Veiculo{
    private boolean temWifi;
    private boolean temAr;

    public VeiculoBlack(String modelo, String placa, String cor, boolean temWifi, boolean temAr) {
        super(modelo, placa, cor);
        this.temWifi = temWifi;
        this.temAr = temAr;
    }
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Possui Wi-Fi: " + temWifi);
        System.out.println("Possui Ar-condicionado: " + temAr);
    }
}
