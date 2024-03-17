package org.example.aulas;

public class Aula08ArraysMultiDimensionais02 {

    //1,2,3,4,5 meses
    // 31, 28, 31, 30
    public static void main(String[] args) {

        int[] arrayNascimento = {21, 2, 98};

        int[][] arrayInt = new int[4][];
        arrayInt[0] = new int[]{0, 1, 2};
        arrayInt[1] = new int[2];
        arrayInt[2] = new int[4];
        arrayInt[3] = arrayNascimento;

        int[][] arrayInt2 = {{0, 1}, {2, 3, 4}, {5, 6, 7, 8}};

        int indexArray = 0;
        for (int[] intArray : arrayInt) {
            int indexInt = 0;
            for (int intNum : intArray) {
                System.out.println("Index do array base: " + indexArray + " valor do index do array filho : " + indexInt + " valor :" + intNum);
                indexInt++;
            }
            indexArray++;
        }

        int indexArray2 = 0;
        for (int[] intArray : arrayInt2) {
            int indexInt = 0;
            for (int intNum : intArray) {
                System.out.println("Index do array base 2: " + indexArray2 + " valor do index do array filho : " + indexInt + " valor :" + intNum);
            }
            indexArray2++;
        }

    }

}
