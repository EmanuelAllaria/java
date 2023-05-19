package clase1.casa.modelo;

public class Marca {
    private String marca;

    public Marca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    @Override
    public String toString() {
        return "Marca {" + marca + "}";
    }
}