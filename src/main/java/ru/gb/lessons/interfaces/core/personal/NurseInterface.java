package ru.gb.lessons.interfaces.core.personal;

import ru.gb.lessons.interfaces.core.clients.Animals;

public interface NurseInterface {
    void writePrescriptions(Animals patient);
    void temperMeasuring(Animals patient);

    void giveInjections(Animals patient);
    void makeBandages(Animals patient);
}
