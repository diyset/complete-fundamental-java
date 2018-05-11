package COMPARATOR;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorFirst {

    public static void main(String[] args){

        final List<Developer> listDevs = getDevelopers();


        for (Developer developer: listDevs) {
            System.out.println(developer.getName()+" "+developer.getSalary()+" "+developer.getAge());
        }

        Collections.sort(listDevs, new Comparator<Developer>() {

            public int compare(Developer o1, Developer o2) {
                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println("After Sort");
        for (Developer developer:listDevs) {
            System.out.println(developer.getName()+" "+developer.getSalary()+" "+developer.getAge());
        }
        //Sorting Nama
        Collections.sort(listDevs, new Comparator<Developer>() {
            public int compare(Developer o1, Developer o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        System.out.println("Sorting Nama");
        for (Developer developer: listDevs) {
            System.out.println(developer.getName()+" "+developer.getSalary()+" "+developer.getAge());
        }
        //Sort Salary
        Collections.sort(listDevs, new Comparator<Developer>() {
            public int compare(Developer o1, Developer o2) {
                return o1.getSalary().compareTo(o2.getSalary());
            }
        });
        System.out.println("Sorting Salary");
        for (Developer developer:listDevs) {
            System.out.println(developer.getName()+" "+developer.getSalary()+" "+developer.getAge());
        }
    }
    private static List<Developer> getDevelopers() {

        List<Developer> result = new ArrayList<Developer>();

        result.add(new Developer("mkyong", new BigDecimal("70000"), 33));
        result.add(new Developer("alvin", new BigDecimal("80000"), 20));
        result.add(new Developer("jason", new BigDecimal("100000"), 10));
        result.add(new Developer("iris", new BigDecimal("170000"), 55));

        return result;

    }
}
