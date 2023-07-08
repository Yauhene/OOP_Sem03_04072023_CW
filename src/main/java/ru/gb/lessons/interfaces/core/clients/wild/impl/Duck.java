package ru.gb.lessons.interfaces.core.clients.wild.impl;

import java.time.LocalDate;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

public class Duck extends WildAnimal implements Flyable, Runnable, Soundable, Swimable {

    int flySpeed = 30;
    int runSpeed = 15;
    String speeks = "Quack-quack!";
    int swimSpeed = 25;
    String swimReaction = "Я плаваю с удовольствием!";




    public Duck() {
        rDesire = true;
        flyDesire = true;
        swimDesire = true;
        speekDesire = true;
    }

    public Duck(int id, int numberOfLimbs, String name, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
        rDesire = true;
        flyDesire = true;
        swimDesire = true;
        speekDesire = true;
        this.name = name;
    }

    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " летит со скоростью: " + flySpeed + " км/ч");
        return 5;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " бегает со скоростью: " + runSpeed + " км/ч");
        return 3;
    }
    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " говорит: " + speeks);

    }
    @Override
    public void swim() {
        System.out.println(CLASS_NAME + " говорит: " + '"' + swimReaction+ '"'
                + "- и плывет со скоростью " + swimSpeed + " км/ч");

    }
}
