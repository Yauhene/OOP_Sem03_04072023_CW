package ru.gb.lessons.interfaces.core.clients.wild.impl;

import ru.gb.lessons.interfaces.core.clients.Flyable;
import ru.gb.lessons.interfaces.core.clients.Runnable;
import ru.gb.lessons.interfaces.core.clients.Soundable;
import ru.gb.lessons.interfaces.core.clients.Swimable;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;

import java.time.LocalDate;

public class Fish  extends WildAnimal implements Flyable, Runnable, Soundable, Swimable {
    int flySpeed = 0;
    int runSpeed = 0;
    String speeks = "...";
    int swimSpeed = 25;
    String swimReaction = " шевелит плавниками ";

    public Fish() {
        rDesire = false;
        flyDesire = false;
        swimDesire = true;
        speekDesire = false;

    }

    public Fish(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
        rDesire = false;
        flyDesire = false;
        swimDesire = true;
        speekDesire = false;
    }
    @Override
    public int fly() {
        System.out.println(CLASS_NAME + " не летает");
        return 0;
    }

    @Override
    public int run() {
        System.out.println(CLASS_NAME + " не бегает");
        return 0;
    }
    @Override
    public void sound() {
        System.out.println(CLASS_NAME + " говорит: " + speeks);

    }
    @Override
    public void swim() {
        System.out.println(CLASS_NAME + " молчит: "  + swimReaction
                + "- и плывет со скоростью " + swimSpeed + " км/ч");

    }
}
