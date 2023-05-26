package clase1.hospital.modelo;

public class Windows implements IHospital {
    private String marca;
    private Integer ancho;
    private Integer largo;
    private Integer cantidadWindows;
    
    
    public Windows(Integer cantidadWindows) {
        this.ancho = 1;
        this.largo = 2;
        this.marca = "Marca Windows";
        this.cantidadWindows = cantidadWindows;
    }

    public String getWindows() {
        return ancho + "," + largo + "," + marca + "," + cantidadWindows;
    }

    @Override
    public void windows(Integer cantidadWindows) {
        System.out.println("Window { quantity {" + cantidadWindows + "}, width {" + ancho + "}, height {" + largo + "}, brand {" + marca + "}}");
    }

    @Override
    public void door(Integer cantidadDoors) {
        // System.out.println(null);
        return;
    }

    @Override
    public void floors(Integer cantidadFloors) {
        // System.out.println(null);
        return;
    }

    @Override
    public void parking(Boolean parking) {
        // System.out.println(null);
        return;
    }

    @Override
    public void guard(Boolean guard) {
        // System.out.println(null);
        return;
    }

    @Override
    public void rooms(Integer cantidadRooms) {
        // System.out.println(null);
        return;
    }

    @Override
    public void patientRooms(Integer cantidadPatientRooms) {
        // System.out.println(null);
        return;
    }
}
