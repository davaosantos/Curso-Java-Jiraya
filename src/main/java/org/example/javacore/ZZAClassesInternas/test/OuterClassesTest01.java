package org.example.javacore.ZZAClassesInternas.test;

public class OuterClassesTest01 {
    private String name = "Goku";

    class Inner{
        public void printOuterClassAttribute(){
            System.out.println(name);
            System.out.println(this);
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        OuterClassesTest01.Inner inner1 = outerClass.new Inner();
        inner1.printOuterClassAttribute();
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner2.printOuterClassAttribute();

    }
}
