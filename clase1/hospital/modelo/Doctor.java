package clase1.hospital.modelo;

public class Doctor {
    private String name;
    private String specialization;

    public Doctor(String name, String specialization) {
        this.name = name;
        this.specialization = specialization;
    }
    
    public String getDoctor() {
        // return name + "," + specialization;
        return "Doctor { name {" + name + "}, specialization {" + specialization + "}}";
    }
}