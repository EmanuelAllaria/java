package clase1.casa.modelo;

public class Puerta {
    private Marca marca;
    private double ancho;
    private double largo;
    private String puerta;

    public Puerta(Marca marca, double ancho, double largo, String puerta) {
        this.marca = marca;
        this.ancho = ancho;
        this.largo = largo;
        this.puerta = puerta;
    }

    public String getPuerta() {
        return marca + ", " + ancho + ", " + largo + ", " + puerta;
    }

    public void setPuerta(Marca marca, double ancho, double largo, String puerta) {
        this.marca = marca;
        this.ancho = ancho;
        this.largo = largo;
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Puerta {" + "Marca {" + marca.getMarca() + "}, Ancho {" + ancho + "}, Largo {" + largo + "} Tipo {" + puerta + "}}"; 
    }
}
