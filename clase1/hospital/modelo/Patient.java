package clase1.hospital.modelo;

public class Patient {
    private String name;
    private int age;
    private String condition;

    public Patient(String name, int age, String condition) {
        this.name = name;
        this.age = age;
        this.condition = condition;
    }

    public String getPatient() {
        return "Patient { name {" + name + "}, age {" + age + "}, condition {" + condition + "}}";
    }
}
