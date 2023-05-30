package clase1.hospital.modelo;

import java.util.ArrayList;
import java.util.List;

public class Hospital {
    private String name;
    private String address;
    private int capacity;
    private List<Doctor> doctors;
    private List<Patient> patients;
    private List<Habitacion> habitaciones;

    public Hospital(String name, String address, int capacity) {
        this.name = name;
        this.address = address;
        this.capacity = capacity;
        this.doctors = new ArrayList<>();
        this.patients = new ArrayList<>();
        this.habitaciones = new ArrayList<>();
    }

    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public void addHabitacion(Habitacion habitacion) {
        habitaciones.add(habitacion);
    }

    public String getHospital() {
        StringBuilder hospitalInfo = new StringBuilder();
        hospitalInfo.append("name {").append(name).append("}, address {").append(address).append("}, capacity {").append(capacity).append("}, ");
        for (Doctor doctor : doctors) {
            hospitalInfo.append(doctor.getDoctor()).append(", ");
        }
        for (Patient patient : patients) {
            hospitalInfo.append(patient.getPatient()).append(", ");
        }
        for (Habitacion habitacion : habitaciones) {
            hospitalInfo.append(habitacion.getHabitacion()).append(", ");
        }
        return "Hospital {" + hospitalInfo.toString() + "}";
    }

    public void admitPatient(Patient patient) {
        if (patients.size() < capacity) {
            patients.add(patient);
        }
    }

    public void ocuparHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                if (!habitacion.isOcupada()) {
                    habitacion.ocupar();
                    System.out.println("Habitación " + numero + " ocupada.");
                } else {
                    System.out.println("La habitación " + numero + " ya está ocupada.");
                }
                return;
            }
        }
        System.out.println("La habitación " + numero + " no existe en el hospital.");
    }

    public void desocuparHabitacion(int numero) {
        for (Habitacion habitacion : habitaciones) {
            if (habitacion.getNumero() == numero) {
                if (habitacion.isOcupada()) {
                    habitacion.desocupar();
                    System.out.println("Habitación " + numero + " desocupada.");
                } else {
                    System.out.println("La habitación " + numero + " ya está desocupada.");
                }
                return;
            }
        }
        System.out.println("La habitación " + numero + " no existe en el hospital.");
    }
}
