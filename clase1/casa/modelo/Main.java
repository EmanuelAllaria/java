package clase1.casa.modelo;

public class Main {
    public static void main(String[] args) {
        Casa casa = new Casa.Builder()
                .setCimientos("Concreto")
                .setEstructura("Ladrillo")
                .setTecho("Teja")
                .setInterior("Madera")
                .setHabitaciones(3)
                .setTieneCocina(true)
                .setPais("España")
                .setProvincia("Madrid")
                .setDireccion("Calle Principal, 123")
                .setTienePatio(true)
                .setTieneCochera(true)
                .construir();

        System.out.println(casa);
    }
}