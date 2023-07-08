package ru.gb.lessons.interfaces.core;

import java.util.ArrayList;
import java.util.List;

import ru.gb.lessons.interfaces.core.clients.Animals;
import ru.gb.lessons.interfaces.core.clients.Human;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;

public class VetClinic {
    private static List<Animals> animals = new ArrayList<>();

    //private Animals ;

    //private Animals patient;
//    public static void main(String[] args) {
//        Human human = new Human("Пайтон");
    //Cat cat = new Cat(0, null, 0, null, null);
    // animals.add(human);
    //animals.add(cat);
//        for (Animals element : animals) {
//            heal(element);
//        }
    //   }

    private static void heal(Animals patient) {
        System.out.println(patient.getClassName() + " вылечен");
    }

    public List<Animals> addAnimal(Animals patient) {
        animals.add(patient);
        return animals;
    }

    public void printPatients() {
        for (Animals element : animals) {
            System.out.println(element);
        }
    }
    public void printFlyingPatients() {
        for (Animals element : animals) {
            if (element.getFlyDesire()) {
                System.out.println(element);
            }
        }
    }
    public void printSwimingPatients() {
        for (Animals element : animals) {
            if (element.getSwimDesire()) {
                System.out.println(element);
            }
        }
    }
    public void printRunningPatients() {
        for (Animals element : animals) {
            if (element.getRunDesire()) {
                System.out.println(element);
            }
        }
    }
    public void printSpeakingPatients() {
        for (Animals element : animals) {
            if (element.getSpeekDesire()) {
                System.out.println(element);
            }
        }
    }
    public List<Animals> getPets() {
        return animals;
    }


}