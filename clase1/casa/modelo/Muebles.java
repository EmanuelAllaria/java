package clase1.casa.modelo;

public class Muebles {
    private String mueble;
    private String marca;
    private double precio;
    private String descripcion;

    public Muebles(String mueble, String marca, double precio, String descripcion) {
        this.mueble = mueble;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    public String getMueble() {
        return mueble + ", " + precio + ", " + descripcion;
    }

    public void setMueble(String mueble, String marca, double precio, String descripcion) {
        this.mueble = mueble;
        this.marca = marca;
        this.precio = precio;
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Mueble {" + "Marca {" + marca + "}, Descripción {" + descripcion + "}, Precio {" + precio + "}, Tipo {" + mueble + "}}"; 
    }
}