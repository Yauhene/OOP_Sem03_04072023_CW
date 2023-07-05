package ru.gb.lessons.interfaces.core.drugStore;

import java.util.*;

public class Pharmacy implements Iterable<Component>, Comparable<Pharmacy>, Marker {
    private int id;
    protected List<Component> components;
    private int componentsCount;

    public Pharmacy(int id) {
        this.id = id;
        this.components = new ArrayList<>();
        this.componentsCount = 0;
    }

    public Pharmacy() {

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
        return "Pharmacy{" + "id=" + getId() +
                ", components=" + components +
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
        int result;
        int pow1 = getPower(this);
        int pow2 = getPower(o);
        result = Integer.compare(pow1, pow2);
        if (Integer.compare(pow1, pow2) == 0) {
            String Coll1 = getStr(this);
            String Coll2 = getStr(o);
            result = CharSequence.compare(Coll1,Coll2);
        }
        return Integer.compare(pow1, pow2);
//        Альтернативная запись:
//        if (pow1 > pow2) return 1;
//        else if (pow1 < pow2) return -1;
//        else return 0;
    }
    private int getPower (Pharmacy pharm) {
        int result = 0;
        System.out.println("---------------------------------------------------");
        for (Component elem: pharm.getComponents()) {
            System.out.println(elem);
            System.out.println("result = " + result + "; getPower = " + elem.getPower());
            result += elem.getPower();
        }
        return result;
    }
    private String getStr(Pharmacy pharm) {
        String cStr = "";
        for (Component elem: pharm.getComponents()) {
//            System.out.println(elem);
//            System.out.println("result = " + result + "; getPower = " + elem.getPower());
            cStr += elem.getName();
            System.out.println(cStr);
        }
        return cStr;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pharmacy that = (Pharmacy) o;
        return getId() == that.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


}
