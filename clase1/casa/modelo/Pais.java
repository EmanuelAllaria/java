package clase1.casa.modelo;

public class Pais { 
    private String pais;

    public Pais(String pais) {
        this.pais = pais;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Pais {" + pais + "}";
    }
}