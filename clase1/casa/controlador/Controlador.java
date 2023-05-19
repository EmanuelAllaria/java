package clase1.casa.controlador;

import clase1.casa.modelo.Pais;
import clase1.casa.modelo.Provincia;
import clase1.casa.modelo.Direccion;
import clase1.casa.modelo.Electrodomestico;
import clase1.casa.modelo.Marca;
import clase1.casa.modelo.Puerta;
import clase1.casa.modelo.Ventana;
import clase1.casa.modelo.Muebles;
import clase1.casa.modelo.Room;
import clase1.casa.modelo.Sanitario;
import clase1.casa.modelo.Jardin;
import clase1.casa.modelo.Sanitario;
import clase1.casa.modelo.Baño;
import clase1.casa.modelo.Cocina;

public class Controlador {
    private String decision;
    private Pais pais;
    private Provincia provincia;
    private Direccion direccion;
    private Marca marca;
    private Puerta puerta;
    private Ventana ventana;
    private Muebles mueble;
    private Electrodomestico electrodomestico;
    private Room room;
    private Jardin jardin;
    private Baño baño;
    private Sanitario sanitario;
    private Sanitario sanitario1;
    private Sanitario sanitario2;
    private Cocina cocina;

    public Controlador(String decision, Pais pais, Provincia provincia, Direccion direccion, Marca marca, Puerta puerta, Ventana ventana, Muebles mueble, Electrodomestico electrodomestico, Room room, Jardin jardin, Baño baño, Sanitario sanitario, Sanitario sanitario1, Sanitario sanitario2, Cocina cocina) {
        this.decision = decision;
        this.pais = pais;
        this.provincia = provincia;
        this.direccion = direccion;
        this.marca = marca;
        this.puerta = puerta;
        this.ventana = ventana;
        this.mueble = mueble;
        this.electrodomestico = electrodomestico;
        this.room = room;
        this.jardin = jardin;
        this.baño = baño;
        this.sanitario = sanitario;
        this.sanitario = sanitario1;
        this.sanitario = sanitario2;
        this.cocina = cocina;
        if(decision == "Todo") {
            System.out.print("Casa {");
            System.out.println("");
            System.out.println("    " + marca.toString() + ",");
            System.out.println("    " + direccion.toString() + ",");
            System.out.println("    " + puerta.toString() + ",");
            System.out.println("    " + ventana.toString() + ",");
            System.out.println("    " + mueble.toString() + ",");
            System.out.println("    " + electrodomestico.toString() + ",");
            System.out.println("    " + room.toString() + ",");
            System.out.println("    " + jardin.toString() + ",");
            System.out.println("    " + baño.toString() + ",");
            System.out.println("    " + sanitario.toString() + ",");
            System.out.println("    " + sanitario1.toString() + ",");
            System.out.println("    " + sanitario2.toString() + ",");
            System.out.println("    " + cocina.toString() + ",");
            System.out.println("}");
        } else if(decision == "Marca") {
            initializeMarca();
        } else if(decision == "Address") {
            initializeAddress();
        } else if(decision == "Puerta") {
            initializePuerta();
        } else if(decision == "Ventana") {
            initializeVentana();
        } else if(decision == "Mueble") {
            initializeMueble();
        } else if(decision == "Electrodomestico") {
            initializeElectrodomestico();
        } else if(decision == "Room") {
            initializeRoom();
        } else if(decision == "Jardin") {
            initializeJardin();
        } else if(decision == "Baño") {
            initializeBaño();
        } else if(decision == "Sanitarios") {
            initializeSanitario();
            initializeSanitario1();
            initializeSanitario2();
        } else if(decision == "Cocina") {
            initializeCocina();
        } else {
            System.out.println("Error: Ponga una funcion valida");
        }
    }

    public void initializeAddress() {
        System.out.println(direccion.toString());
    }

    public void initializeMarca() {
        System.out.println(marca.toString());
    }

    public void initializePuerta() {
        System.out.println(puerta.toString());
    }

    public void initializeVentana() {
        System.out.println(ventana.toString());
    }

    public void initializeMueble() {
        System.out.println(mueble.toString());
    }

    public void initializeElectrodomestico() {
        System.out.println(electrodomestico.toString());
    }

    public void initializeRoom() {
        System.out.println(room.toString());
    }

    public void initializeJardin() {
        System.out.println(jardin.toString());
    }

    public void initializeSanitario() {
        System.out.println(sanitario.toString());
    }

    public void initializeSanitario1() {
        sanitario.setSanitario("Bañera", "Marca", 4000, "Linda Bañera");
        System.out.println(sanitario.toString());
    }

    public void initializeSanitario2() {
        sanitario.setSanitario("Lavamano", "Marca", 4000, "Linda Lavamano");
        System.out.println(sanitario.toString());
    }

    public void initializeBaño() {
        System.out.println(baño.toString());
    }

    public void initializeCocina() {
        System.out.println(cocina.toString());
    }

    public static void main(String[] args) {
        Pais pais = new Pais("Argentina");
        Provincia provincia = new Provincia("Buenos Aires", pais);
        Direccion direccion = new Direccion("Calle Falsa 123", provincia);
        Marca marca = new Marca("Pentagono");
        Puerta puerta = new Puerta(marca, 250, 250, "Puerta");
        Ventana ventana = new Ventana(marca, 250, 250, "Ventana");
        Muebles mueble = new Muebles("Mueble", "Marca", 50000, "Es un mueble bueno");
        Electrodomestico electrodomestico = new Electrodomestico(marca, "Electrodomestico", "Alto electrodomestico", 5000);
        Room room = new Room("Dormitorio", ventana, puerta, electrodomestico, mueble);
        Jardin jardin = new Jardin("200");
        Sanitario sanitario = new Sanitario("Hinodoro", "Marca", 4000, "Lindo hinodoro");
        Sanitario sanitario1 = new Sanitario("Bañera", "Marca", 5000, "Lindo bañera");
        Sanitario sanitario2 = new Sanitario("Lavamano", "Marca", 6000, "Lindo lavamano");
        Baño baño = new Baño(sanitario, sanitario1, sanitario2, "Baño", ventana, puerta);
        Cocina cocina = new Cocina(room, "Cocina", ventana, puerta, electrodomestico, mueble);

        Controlador controlador = new Controlador("Todo", pais, provincia, direccion, marca, puerta, ventana, mueble, electrodomestico, room, jardin, baño, sanitario, sanitario1, sanitario2, cocina);
    }
}