package clase1.casa.modelo;

public class Main {
    public static void main(String[] args) {
        Casa casa = Casa.Builder()
                .cimientos("Concreto")
                .estructura("Ladrillo")
                .techo("Teja")
                .interior("Madera")
                .habitaciones(3)
                .tieneCocina(true)
                .pais("España")
                .provincia("Madrid")
                .direccion("Calle Principal, 123")
                .tienePatio(true)
                .tieneCochera(true)
                .construir();

        System.out.println(casa);
    }
}