package clase1.hospital.controlador;

import clase1.hospital.modelo.Doctor;
import clase1.hospital.modelo.DoctorFactory;
import clase1.hospital.modelo.Habitacion;
import clase1.hospital.modelo.Hospital;
import clase1.hospital.modelo.HospitalFactory;
import clase1.hospital.modelo.Patient;
import clase1.hospital.modelo.PatientBuilder;

public class Main {
    public static void main(String[] args) {
        Hospital hospital = HospitalFactory.createHospital("Hospital ABC", "Dirección XYZ", 100);

        Doctor doctor1 = DoctorFactory.createDoctor("Dr. Juan", "Cardiología");
        Doctor doctor2 = DoctorFactory.createDoctor("Dr. María", "Pediatría");

        Habitacion habitacion1 = new Habitacion(101, "Consultorio");
        Habitacion habitacion2 = new Habitacion(201, "Terapia");
        Habitacion habitacion3 = new Habitacion(301, "Consultorio");

        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);

        hospital.addHabitacion(habitacion1);
        hospital.addHabitacion(habitacion2);
        hospital.addHabitacion(habitacion3);

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

        hospital.admitPatient(patient1);
        hospital.admitPatient(patient2);

        hospital.ocuparHabitacion(101);
        hospital.ocuparHabitacion(201);

        System.out.println(patient1.getPatient() + "\n" + patient2.getPatient());
        System.out.println(doctor1.getDoctor() + "\n" + doctor2.getDoctor());
        System.out.println(habitacion1.getHabitacion() + "\n" + habitacion2.getHabitacion() + "\n" + habitacion3.getHabitacion());
        System.out.println(hospital.getHospital());

        hospital.desocuparHabitacion(101);
        hospital.desocuparHabitacion(201);
    }
}
