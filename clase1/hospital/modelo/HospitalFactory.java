package clase1.hospital.modelo;

public class HospitalFactory {
    public static Hospital createHospital(String name, String address, int capacity) {
        return new Hospital(name, address, capacity);
    }
}