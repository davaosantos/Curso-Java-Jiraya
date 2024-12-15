package org.example.javacore.ZZAClassesInternas.test;

public class OuterClassesTest02 {
    //Dentro do bloco de inicialização também é possivel
//    {
//        class test{}
//    }

    private String name = "Midorya";

    void print( final String param){
        final String lastName = "Izuku";
        class LocalClass{
            public void printLocal(){
                System.out.println(name + " " + lastName);
            }
        }
        new LocalClass().printLocal();
    }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("teste");
    }
}
