package clase1.casa.modelo;

public class Provincia {
    private String provincia;
    private Pais pais;

    public Provincia(String provincia, Pais pais) {
        this.provincia = provincia;
        this.pais = pais;
    }

    public String getProvincia() {
        return provincia + ", " + pais.getPais();
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Provincia {" + provincia + "}, Pais {" + pais.getPais() + "}";
    }
}
