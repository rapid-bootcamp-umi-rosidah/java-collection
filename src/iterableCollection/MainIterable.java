package iterableCollection;

import model.Person;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MainIterable {
    public static void main(String[] args) {
        Iterable<String> names = List.of("Umi Rosidah", "Umi Suci", "Umi Azizah", "Umi Yuliarni");
        /*
        for(var name: names){
            System.out.println(name);
        }
        */
        // iterator
        Iterator<String> namesIterator = names.iterator();
        while (namesIterator.hasNext()){
            System.out.println(namesIterator.next());
        }

        Iterable<Person> persons = Arrays.asList(
                new Person(1,"Umi Rosidah","Ciamis"),
                new Person(2,"Umi Suci","Jakarta"),
                new Person(3,"Umi Azizah","Yogyakarta"),
                new Person(4,"Umi Yuliarni","Medan")
        );

        /*
        for (var peson: persons){
            System.out.println(peson);
        }*/
        Iterator<Person> personIterator = persons.iterator();
        while (personIterator.hasNext()){
            System.out.println(personIterator.next());
        }
    }
}
