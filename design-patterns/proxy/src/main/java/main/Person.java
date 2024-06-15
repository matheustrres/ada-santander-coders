package main;

import java.time.LocalDate;

public class Person {
    private String name;
    private String lastName;
    private String document;
    private String email;
    private String nickname;
    private LocalDate birthDate;

    private Person(String name, String lastName, String document, String email, String nickname, LocalDate birthDate) {
        this.name = name;
        this.lastName = lastName;
        this.document = document;
        this.email = email;
        this.nickname = nickname;
        this.birthDate = birthDate;
    }

    public static class builder {
        private String name;
        private String lastName;
        private String document;
        private String email;
        private String nickname;
        private LocalDate birthDate;

        public builder withName(String name) {
            this.name = name;
            return this;
        }

        public builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public builder withNickname(String nickname) {
            this.nickname = nickname;
            return this;
        }

        public builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public builder withDocument(String document) {
            this.document = document;
            return this;
        }

        public builder withBirthDate(LocalDate birthDate) {
            this.birthDate = birthDate;
            return this;
        }

        public Person build() {
            return new Person(name, lastName, document, email, nickname, birthDate);
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name: '" + name + '\'' +
                ", lastName: '" + lastName + '\'' +
                ", document: '" + document + '\'' +
                ", email: '" + email + '\'' +
                ", nickname: '" + nickname + '\'' +
                ", birthDate: '" + birthDate + '\'' +
                "}";
    }
}