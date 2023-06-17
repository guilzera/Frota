public class Carro extends Veiculo {

    private String porta;

    public String getPorta() {
        return porta;
    }

    public void setPorta(String porta) {
        this.porta = porta;
    }

    public Carro(String marca, String modelo, int ano, double quilometragem, String placa, String porta) {
        super(marca, modelo, ano, quilometragem, placa);
        this.porta = porta;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Quantidade de Portas: " + porta + " portas";
    }
}
