package ru.gb.lessons.interfaces.core.drugStore;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private int id;
    private List<Component> components;
    private int componentsCount;

    public Pharmacy() {
        this.id = id;
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }
    public Pharmacy addComponent (Component component) {
        this.components.add(component);
        this.componentsCount++;
        return this;
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public String toString() {
        return "Pharmacy{" +
                "components=" + components +
                ", index=" + componentsCount +
                '}'+"Total power = "+getPower(this)+"\n";
    }

    @Override
    public Iterator<Component> iterator() {
//        return new Iterator<Component>() { //Анонимный класс
//            public Component next() {
//                return components.get(componentsCount++);
//            }
//
//            public boolean hasNext() {
//                return componentsCount < components.size();
//            }
//        };
        return new ComponentIterator();
    }

    @Override
    public int compareTo(Pharmacy o) {
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        return Integer.compare(pow1, pow2);
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;
    }
    private int getPower (Pharmacy pharm) {
        int result = 0;
        System.out.println("Поехали----------------------------------------");
        for (Component elem: pharm.getComponents()) {
            System.out.println(elem);
            System.out.println("result = " + result + "; getPower = " + elem.getPower());
            result += elem.getPower();
        }
        return result;
    }

    public int getId() {
        return id;
    }
}
