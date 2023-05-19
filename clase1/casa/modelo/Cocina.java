package clase1.casa.modelo;

public class Cocina {
    private String cocina;
    private Room room;
    private Ventana ventana;
    private Puerta puerta;
    private Electrodomestico electrodomestico;
    private Muebles muebles;

    public Cocina(Room room, String cocina, Ventana ventana, Puerta puerta, Electrodomestico electrodomestico, Muebles muebles) {
        this.room = room;
        this.cocina = cocina;
        this.ventana = ventana;
        this.puerta = puerta;
        this.electrodomestico = electrodomestico;
        this.muebles = muebles;
    }

    public String getCocina() {
        room.setRoom(cocina, ventana, puerta, electrodomestico, muebles);
        return room + ", " + cocina;
    }

    public void setCocina(Room room, String cocina, Ventana ventana, Puerta puerta, Electrodomestico electrodomestico, Muebles muebles) {
        this.room = room;
        this.cocina = cocina;
        this.ventana = ventana;
        this.puerta = puerta;
        this.electrodomestico = electrodomestico;
        this.muebles = muebles;
    }

    @Override
    public String toString() {
        room.setRoom(cocina, ventana, puerta, electrodomestico, muebles);
        return "Cocina { tipo {" + room + "}";
    }
}
