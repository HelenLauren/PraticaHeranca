public class Veiculo {
    private String modelo;
    private String placa;
    private String cor;

    public Veiculo(String modelo, String placa, String cor){
        this.modelo = modelo;
        this.placa = placa;
        this.cor = cor;
    }
    public void exibirDetalhes() {
        System.out.println("Modelo: " + modelo + ", Placa: " + placa + ", Cor: " + cor);
    }
}
