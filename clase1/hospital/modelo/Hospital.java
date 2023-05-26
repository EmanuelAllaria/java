package clase1.hospital.modelo;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private int capacity;
    private List<Doctor> doctors;
    private List<Patient> patients;

    public Hospital(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void admitPatient(Patient patient) {
        if (patients.size() < capacity) {
            patients.add(patient);
            System.out.println("Patient admitted to the hospital.");
        } else {
            System.out.println("Hospital is at full capacity. Patient cannot be admitted.");
        }
    }
}

