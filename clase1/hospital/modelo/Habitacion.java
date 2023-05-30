package clase1.hospital.modelo;

public class Habitacion {
    private int numero;
    private String tipo;
    private boolean ocupada;

    public Habitacion(int numero, String tipo) {
        this.numero = numero;
        this.tipo = tipo;
        this.ocupada = false;
    }

    public String getHabitacion() {
        return "Habitación { type{" + tipo + "}, number {" + numero + "}, ocupated {" + ocupada + "}}";
    }

    public int getNumero() {
        return numero;
    }

    public String getTipo() {
        return tipo;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void ocupar() {
        ocupada = true;
    }

    public void desocupar() {
        ocupada = false;
    }
}
