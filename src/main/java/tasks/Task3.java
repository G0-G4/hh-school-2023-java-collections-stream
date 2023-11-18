package tasks;

import common.Person;

import java.util.*;

/*
Задача 3
Отсортировать коллекцию сначала по фамилии, по имени (при равной фамилии), и по дате создания (при равных фамилии и имени)
 */
public class Task3 {

  public static List<Person> sort(Collection<Person> persons) {
    ArrayList<Person> sortedPersons = new ArrayList<>(persons);
    sortedPersons.sort(Comparator
        .comparing(Person::getFirstName)
        .thenComparing(Person::getSecondName)
        .thenComparing(Person::getCreatedAt));
    return sortedPersons;
  }
}
