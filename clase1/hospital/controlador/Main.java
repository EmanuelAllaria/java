package clase1.hospital.controlador;

import clase1.hospital.modelo.Doctor;
import clase1.hospital.modelo.DoctorFactory;
import clase1.hospital.modelo.Hospital;
import clase1.hospital.modelo.HospitalFactory;
import clase1.hospital.modelo.Patient;
import clase1.hospital.modelo.PatientBuilder;

public class Main {
    public static void main(String[] args) {
        // Crear un hospital utilizando el Factory
        Hospital hospital = HospitalFactory.createHospital("Hospital ABC", "Dirección XYZ", 100);

        // Crear doctores utilizando el Factory
        Doctor doctor1 = DoctorFactory.createDoctor("Dr. Juan", "Cardiología");
        Doctor doctor2 = DoctorFactory.createDoctor("Dr. María", "Pediatría");

        // Crear pacientes utilizando el Builder
        Patient patient1 = new PatientBuilder()
                .withName("Paciente 1")
                .withAge(30)
                .withCondition("Fiebre")
                .build();

        Patient patient2 = new PatientBuilder()
                .withName("Paciente 2")
                .withAge(40)
                .withCondition("Fractura")
                .build();

        // Añadir doctores al hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        // Admitir pacientes al hospital
        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);
    }
}