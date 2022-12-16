package listCollection;
import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainList {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Siti", "Maimunah", "Toyibah", "Rahmah"));
        System.out.println(names);

        names.set(2,"Aisyah");
        names.set(0, "Joko");
        System.out.println(names);

        List<Person> persons = new ArrayList<>(
                Arrays.asList(
                        new Person(1,"Joko","Jakarta"),
                        new Person(2,"Andi","Jakarta"),
                        new Person(3,"Budi","Jakarta")
                )
        );
        for(int i=0; i < persons.size(); i++) {
            System.out.println("Index ke "+i +" : "+persons.get(i));
        }

        System.out.println("\nSetalah Diubah");
        persons.set(1, new Person(2, "Gilang","Lampung"));
        for(int i=0; i < persons.size(); i++) {
            System.out.println("Index ke "+i +" : "+persons.get(i));
        }
    }
}

