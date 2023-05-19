package clase1.casa.modelo;

public class Room {
    private String room;
    private Ventana ventana;
    private Puerta puerta;
    private Electrodomestico electrodomestico;
    private Muebles muebles; 

    public Room(String room, Ventana ventana, Puerta puerta, Electrodomestico electrodomestico, Muebles muebles) {
        this.room = room;
        this.ventana = ventana;
        this.puerta = puerta;
        this.electrodomestico = electrodomestico;
        this.muebles = muebles;
    }

    public String getRoom() {
        return room + ", " + ventana + ", " + puerta + ", " + electrodomestico + ", " + muebles;
    }

    public void setRoom(String room, Ventana ventana, Puerta puerta, Electrodomestico electrodomestico, Muebles muebles) {
        this.room = room;
        this.ventana = ventana;
        this.puerta = puerta;
        this.electrodomestico = electrodomestico;
        this.muebles = muebles;
    }

    @Override
    public String toString() {
        return "Cuarto { tipo {" + room + "}, ventana {" + ventana + "}, puerta {" + puerta + "}, electrodomestico {" + electrodomestico + "}, muebles {" + muebles + "}";
    }
}
