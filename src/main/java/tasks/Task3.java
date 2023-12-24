package tasks;

import common.Person;

import java.util.*;
import java.util.stream.Collectors;

/*
Задача 3
Отсортировать коллекцию сначала по фамилии, по имени (при равной фамилии), и по дате создания (при равных фамилии и имени)
 */
public class Task3 {

  public static List<Person> sort(Collection<Person> persons) {
    return persons.stream()
        .sorted(Comparator
            .comparing(Person::getFirstName)
            .thenComparing(Person::getSecondName)
            .thenComparing(Person::getCreatedAt))
        .toList();
  }
}
