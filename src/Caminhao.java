public class Caminhao extends Veiculo{

    private int cargaMaxima;

    public int getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(int cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public Caminhao(String marca, String modelo, int ano, double quilometragem, String placa, int cargaMaxima) {
        super(marca, modelo, ano, quilometragem, placa);
        this.cargaMaxima = cargaMaxima;
    }

    @Override
    public String toString() {
        return super.toString() + "\n" +
                "Carga Maxima: " + cargaMaxima;
    }
}
