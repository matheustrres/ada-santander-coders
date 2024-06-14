package main;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Person person = new Person.builder()
                .withName("Adam")
                .withLastName("Smith")
                .withBirthDate(LocalDate.of(1994, 10, 28))
                .withEmail("adamsmith@gmail.com")
                .withDocument("22222222")
                .withNickname("adamsmith")
                .build();

        System.out.println(person); // same as person.toString()
    }
}