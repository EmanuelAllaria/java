package clase1.casa.modelo;

public class Direccion {
    private Provincia provincia;
    private String direccion;

    public Direccion(String direccion, Provincia provincia) {
        this.direccion = direccion;
        this.provincia = provincia;
    }

    public String getDireccion() {
        return direccion + ", " + provincia.toString();
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Direccion {" + direccion + "}" + ", " + provincia.toString();
    }
}
