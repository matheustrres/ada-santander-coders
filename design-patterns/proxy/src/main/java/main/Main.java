package main;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        PersonService personService = new PersonService(new PersonRepositoryProxy());

        Person person = new Person.builder()
                .withName("John")
                .withLastName("Doe")
                .withEmail("john.doe@live.com")
                .withBirthDate(LocalDate.of(1998, 4, 27))
                .withDocument("12121212121")
                .withNickname("jdoe")
                .build();

        personService.save(person);

        Person foundPerson = personService.findById(1L);

        System.out.println(foundPerson);

        Person foundPersonFromCache = personService.findById(1L);

        System.out.println(foundPersonFromCache);
    }
}