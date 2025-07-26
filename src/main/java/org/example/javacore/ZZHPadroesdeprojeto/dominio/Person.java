package org.example.javacore.ZZHPadroesdeprojeto.dominio;

public class Person {

    private String firstName;
    private String lastName;
    private String username;
    private String email;

    private Person(String firstName, String lastName, String username, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.username = username;
        this.email = email;
    }

    public static class PersonBuilder{
        private String firstName;
        private String lastName;
        private String username;
        private String email;

        public PersonBuilder firstName(String firstName){
            this.firstName = firstName;
            return this;
        }

        public PersonBuilder lastName(String lastName){
            this.lastName = lastName;
            return this;
        }

        public PersonBuilder username(String username){
            this.username = username;
            return this;
        }

        public PersonBuilder email(String email){
            this.email = email;
            return this;
        }

    }




}
