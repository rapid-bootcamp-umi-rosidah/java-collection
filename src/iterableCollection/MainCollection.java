package iterableCollection;

import model.Person;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class MainCollection {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Richi");
        names.add("Umy");
        names.addAll(List.of("Sri", "Ahmad", "Kezia"));

        // loop data
        for (String name: names){
            System.out.println(name);
        }

        Collection<Person> persons = new ArrayList<>();
        persons.add(new Person(1,"Suci","Padang"));
        persons.add(new Person(2,"Yuli","Medan"));
        persons.add(new Person(3,"Jihan","Bandung"));
        persons.addAll( Arrays.asList(new Person(4,"Hanifah","Bandung")));
        persons.addAll( Arrays.asList(
                new Person(5,"Lala","Tasikmalaya"),
                new Person(6,"Nana","Medan")
        ));


        System.out.println(persons.contains("Lala"));
        System.out.println(persons.containsAll(Arrays.asList("Nana","Hanifah")));

                persons.remove("Umy");
                persons.removeAll(Arrays.asList("Jihan","Yuli"));

        for (Person p: persons){
            System.out.println(p);
        }
    }
}

