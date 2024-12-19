package org.example.javacore.ZZAClassesInternas.test;

public class OuterClassesTest03 {

    private String name = "David";

    static class Nested{

        private String lastName = "Oliveira";
        void print(){
            OuterClassesTest03 outerClassesTest03 = new OuterClassesTest03();
            System.out.println(outerClassesTest03.name + lastName);
        }
    }

    public static void main(String[] args) {
        Nested nested = new Nested();
        nested.print();
    }
}
