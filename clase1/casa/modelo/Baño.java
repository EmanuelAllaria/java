package clase1.casa.modelo;

public class Baño {
    private Sanitario sanitario;
    private Sanitario sanitario1;
    private Sanitario sanitario2;
    private String room;
    private Ventana ventana;
    private Puerta puerta;

    public Baño(Sanitario sanitario, Sanitario sanitario1, Sanitario sanitario2, String room, Ventana ventana, Puerta puerta) {
        this.sanitario = sanitario;
        this.sanitario1 = sanitario1;
        this.sanitario2 = sanitario2;
        this.room = room;
        this.ventana = ventana;
        this.puerta = puerta;
    }

    public String getBaño() {
        return sanitario + ", " + room + ", " + ventana + ", " + puerta;
    }

    public void setBaño(Sanitario sanitario, Sanitario sanitario1, Sanitario sanitario2, String room, Ventana ventana, Puerta puerta) {
        this.sanitario = sanitario;
        this.sanitario1 = sanitario1;
        this.sanitario2 = sanitario2;
        this.room = room;
        this.ventana = ventana;
        this.puerta = puerta;
    }

    @Override
    public String toString() {
        return "Baño { sanitarios {" + sanitario + ", " + sanitario1 + ", " + sanitario2 + "} ventana {" + ventana + "}, puerta {" + puerta + "}}";
    }
}
