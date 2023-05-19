package clase1.casa.modelo;

public class Jardin {
    private String m2;

    public Jardin(String m2) {
        this.m2 = m2;
    }

    public String getJardin() {
        return m2;
    }

    public void setJardin(String m2) {
        this.m2 = m2;
    }

    @Override
    public String toString() {
        return "Jardin { mCuadrados {" + m2 + "}}";
    }
}
