package clase1.casa.modelo;

public class Electrodomestico {
    private Marca marca;
    private String electrodomestico;
    private String descripcion;
    private double precio;

    public Electrodomestico(Marca marca, String electrodomestico, String descripcion, double precio) {
        this.marca = marca;
        this.electrodomestico = electrodomestico;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public String getElectrodomestico() {
        return electrodomestico + ", " + precio + ", " + descripcion;
    }

    public void setElectrodomestico(Marca marca, String electrodomestico, String descripcion, double precio) {
        this.electrodomestico = electrodomestico;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Electrodomestico {" + "Marca {" + marca.getMarca() + "}, Descripción {" + descripcion + "}, Precio {" + precio + "}, Tipo {" + electrodomestico + "}}"; 
    }
}
