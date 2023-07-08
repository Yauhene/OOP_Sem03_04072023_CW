package ru.gb.lessons.interfaces.core.drugStore;

import org.w3c.dom.ls.LSSerializer;
//import ru.gb.lessons.interfaces.core.clients.DoctorSpecialities;
import ru.gb.lessons.interfaces.core.personal.Doctor;

import java.io.Serializable;
import java.util.*;

//import static ru.gb.lessons.interfaces.core.clients.DoctorSpecialities.THERAPIST;

public class Main {
    public static void main(String[] args) {
        Pharmacy pharmacy1 = new Pharmacy(1);
        Component comp1 = new Component("Penicillin", "10 mg", 10);
        Component comp2 = new Component("Spirit", "100 g", 1000);

        pharmacy1.addComponent(comp1).addComponent(comp2);

//        Интерфейс Serializable - отвечает за сериализацию объектов. Превращает объект в массив байтов, который потом
//        можно собрать обратно при помощи десериализатора.

//        List<Marker> markers = new ArrayList<>();
//        Doctor doc1 = new Doctor(234, "Петрович", THERAPIST, "8(495)429-43-23");
//        markers.add().add();

//        while (((Iterator<Component>) pharmacy1).hasNext()){
//            System.out.println(pharmacy1.next());
//        }
        System.out.println(pharmacy1);

//        DogPharmacy dogPharmacy = new DogPharmacy();
//        System.out.println(dogPharmacy.hashCode());
        for (Component elem : pharmacy1) {
            System.out.println(elem);
        }

        Pharmacy pharmacy2 = new Pharmacy(2);
        Component comp3 = new Component("Penicillin", "10 mg", 3);
        Component comp4 = new Component("Spirit", "100 g", 13);
        pharmacy2.addComponent(comp3).addComponent(comp4);

        Pharmacy pharmacy3 = new Pharmacy(3);
        Component comp5 = new Component("Penicillin", "10 mg", 12);
        Component comp6 = new Component("Spirit", "100 g", 100);
        pharmacy3.addComponent(comp5).addComponent(comp6);

        Pharmacy pharmacy4 = new Pharmacy(2);
        pharmacy4.addComponent(comp5).addComponent(comp6).addComponent(comp2);


        List<Pharmacy> nomenclature = new ArrayList<>();
        nomenclature.add(pharmacy3);
        nomenclature.add(pharmacy1);
        nomenclature.add(pharmacy2);

        System.out.println("************* До сортировки nomenclature: ");
        System.out.println(nomenclature);
        Collections.sort(nomenclature);
        System.out.println("============================================================================");
        System.out.println("************* После сортировки nomenclature: " );
        System.out.println(nomenclature);
        System.out.println();
        System.out.println("***********************************************************************");
        System.out.println("Первая часть домашнего задания========================================");
        System.out.println("***********************************************************************");
        System.out.println();
        System.out.println("Проверяемся:=========================================");
        HashSet<Pharmacy> result = new HashSet<>();
        System.out.println("Сет result в момент объявления: , размер result.size()=" + result.size() + ": ");
        resOut(result);
        result.add(pharmacy1);
        result.add(pharmacy2);
        result.add(pharmacy3);
        System.out.println();
        System.out.println("Сет result: после добавления pharmacy1, pharmacy2, pharmacy3 размер result.size()=" + result.size() + ": ");
        resOut(result);
        System.out.println();
        System.out.println("Повторная попытка добавить pharmacy3");
        result.add(pharmacy3);
        System.out.println("Сет result: после попытки добавления дубликата pharmacy3, размер result.size()=" + result.size() + ": ");
        resOut(result);
        System.out.println("Попытка добавления pharmacy4 с неуникальным id=2");
        result.add(pharmacy4);
        System.out.println();
        System.out.println("Сет result: после попытки добавления pharmacy4 с неуникальным id=2, размер result.size()=" + result.size() + ": ");
        //System.out.println(result);
        resOut(result);

        System.out.println("***********************************************************************");
        System.out.println("Вторая часть домашнего задания========================================");
        System.out.println("***********************************************************************");
        Pharmacy pharmacy7 = new Pharmacy(7);
        Component comp7 = new Component("Aspirin", "100 g", 998);
        pharmacy7.addComponent(comp5).addComponent(comp7);

        List<Pharmacy> nomenclature_2 = new ArrayList<>();
        nomenclature_2.add(pharmacy7);
        nomenclature_2.add(pharmacy1);
        nomenclature_2.add(pharmacy2);
        System.out.println("************* До сортировки nomenclature_2: ");
        System.out.println(nomenclature_2);
        Collections.sort(nomenclature_2);
        System.out.println("============================================================================");
        System.out.println("************* После сортировки nomenclature_2: " );
        System.out.println(nomenclature_2);


    }
    public static void resOut(HashSet<Pharmacy> result) {
        for(var item: result) {
            System.out.println("id = " + item.getId() + ": " + item.getComponents());
        }
    }


}
