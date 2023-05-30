package clase1.hospital.modelo;

public class PatientBuilder {
    private String name;
    private int age;
    private String condition;

    public PatientBuilder withName(String name) {
        this.name = name;
        return this;
    }

    public PatientBuilder withAge(int age) {
        this.age = age;
        return this;
    }

    public PatientBuilder withCondition(String condition) {
        this.condition = condition;
        return this;
    }

    public Patient build() {
        return new Patient(name, age, condition);
    }
}
