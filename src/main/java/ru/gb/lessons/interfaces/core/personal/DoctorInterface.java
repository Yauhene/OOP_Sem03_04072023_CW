package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Animals;

public interface DoctorInterface {
    void diagnosis(Animals patient);

    void giveInjections(Animals patient);
    void makeBandages(Animals patient);
}
