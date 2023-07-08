package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Animals;

public class Doctor extends MedWorker implements DoctorInterface{
    public String name;
    public int id;
    public String specialization;
    public String medSpecialist = "doctor";
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();

    public Doctor() {

    }
    public Doctor(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.medSpecialist = medSpecialist;
    }

    public void diagnosis(Animals patient) {
        System.out.println("Доктор " + Doctor.this.getName() + " ставит диагноз для " + patient.getName());
    }
    public void giveInjections(Animals patient) {
        System.out.println("Доктор " + Doctor.this.getName() + " ставит укол " + patient.getName());
    }
    public void makeBandages(Animals patient) {
        System.out.println("Доктор " + Doctor.this.getName() + " делает перевязку " + patient.getName());
    }

    String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return CLASS_NAME + "{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", specialization=" + specialization +
                ", medSpecialist=" + medSpecialist +
                '}';
    }
}
