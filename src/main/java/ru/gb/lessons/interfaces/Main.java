package ru.gb.lessons.interfaces;

import ru.gb.lessons.interfaces.core.VetClinic;
import ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import ru.gb.lessons.interfaces.core.clients.owners.Owner;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import ru.gb.lessons.interfaces.core.clients.wild.impl.Fish;
import ru.gb.lessons.interfaces.core.personal.Doctor;
import ru.gb.lessons.interfaces.core.personal.Nurse;

import java.time.LocalDate;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {


        VetClinic iBolit = new VetClinic();

        Cat homeCat =
                new Cat(2, "Tom", 4, LocalDate.of(2022, 4,13), new Owner("Ivanov Ivan"));

        ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat wildCat =
                new ru.gb.lessons.interfaces.core.clients.wild.impl.WildCat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));

        Dog tuzik = new Dog(5,"Тузик",4,null,null);
        Fish karas = new Fish();

        homeCat.hunt();
        wildCat.hunt();

        Duck greenNeck = new Duck(15,2,"Cерая Шейка", null, null);
        System.out.println();

        homeCat.run();
        homeCat.fly();
        homeCat.sound();
        homeCat.swim();
        System.out.println();

        tuzik.run();
        tuzik.fly();
        tuzik.sound();
        tuzik.swim();

        System.out.println();
        //System.out.println(tuzik.rDesire);

        karas.run();
        karas.fly();
        karas.sound();
        karas.swim();
        System.out.println();

        iBolit.addAnimal(karas);
        iBolit.addAnimal(tuzik);
        iBolit.addAnimal(homeCat);
        iBolit.addAnimal(greenNeck);
        iBolit.addAnimal(wildCat);

        System.out.println("Дружный коллектив пациентов: ----------------------");
        iBolit.printPatients();
        System.out.println();
        System.out.println("Готовы к полету: ----------------------");
        iBolit.printFlyingPatients();
        System.out.println();
        System.out.println("Готовы плыть: ----------------------");
        iBolit.printSwimingPatients();
        System.out.println();
        System.out.println("Готовы побегать: ----------------------");
        iBolit.printRunningPatients();
        System.out.println();
        System.out.println("Они издают звуки: ----------------------");
        iBolit.printSpeakingPatients();

        Doctor pilulkin = new Doctor(1,"Пилюлькин", "терапевт");
        System.out.println();
        pilulkin.makeBandages(tuzik);
        pilulkin.giveInjections(homeCat);
        pilulkin.diagnosis(greenNeck);
        System.out.println();

        Nurse klizma = new Nurse(8,"Клизменко", "терапевт");
        System.out.println();
        klizma.giveInjections(homeCat);
        klizma.makeBandages(homeCat);
        klizma.temperMeasuring(greenNeck);
        klizma.writePrescriptions(tuzik);



    }
}
