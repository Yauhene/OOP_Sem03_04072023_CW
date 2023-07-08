package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Animals;

public class Nurse implements NurseInterface{
    public String name;
    public int id;
    public String specialization;
    public String medSpecialist = "nurse";
    protected final String CLASS_NAME = "The " + getClass().getSimpleName();

    public Nurse() {

    }
    public Nurse(int id, String name, String specialization) {
        this.id = id;
        this.name = name;
        this.specialization = specialization;
        this.medSpecialist = medSpecialist;
    }
    public void giveInjections(Animals patient) {
        System.out.println("Медсестра " + Nurse.this.getName() + " ставит укол " + patient.getName());
    }
    public void makeBandages(Animals patient) {
        System.out.println("Медсестра " + Nurse.this.getName() + " делает перевязку " + patient.getName());
    }
    public void writePrescriptions(Animals patient) {
        System.out.println("Медсестра " + Nurse.this.getName() + " выписывает рецепт " + patient.getName());
    }
    public void temperMeasuring(Animals patient) {
        System.out.println("Медсестра " + Nurse.this.getName() + " измеряет температуру " + patient.getName());
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
