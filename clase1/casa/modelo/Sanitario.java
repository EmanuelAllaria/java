package clase1.casa.modelo;

public class Sanitario {
    private String sanintario;
    private String marca;
    private double precio;
    private String descripcion;

    public Sanitario(String sanintario, String marca, double precio, String descripcion) {
        this.sanintario = sanintario;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getSanitario() {
        return sanintario + ", " + precio + ", " + descripcion;
    }

    public void setSanitario(String sanintario, String marca, double precio, String descripcion) {
        this.sanintario = sanintario;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Sanitario {" + "Marca {" + marca + "}, Descripción {" + descripcion + "}, Precio {" + precio + "}, Tipo {" + sanintario + "}}"; 
    }
}
