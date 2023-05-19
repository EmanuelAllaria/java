package clase1.casa.modelo;

public class Ventana {
    private Marca marca;
    private double ancho;
    private double largo;
    private String ventana;

    public Ventana(Marca marca, double ancho, double largo, String ventana) {
        this.marca = marca;
        this.ancho = ancho;
        this.largo = largo;
        this.ventana = ventana;
    }

    public String getVentana() {
        return marca + ", " + ancho + ", " + largo + ", " + ventana;
    }

    public void setVentana(Marca marca, double ancho, double largo, String ventana) {
        this.marca = marca;
        this.ancho = ancho;
        this.largo = largo;
        this.ventana = ventana;
    }

    @Override
    public String toString() {
        return "Ventana {" + "Marca {" + marca.getMarca() + "}, Ancho {" + ancho + "}, Largo {" + largo + "}, Tipo {" + ventana + "}}"; 
    }
}
