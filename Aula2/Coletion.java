package Aula2;

import java.util.Arrays;

public class Coletion {
    private int intArray[] = {1,2,3,4,5,6};
    private double doubleArray[] = {8.4, 9.3, 0.2, 7.9, 3.4}
    private int filledIntArray[], intArrayCopy;

    public Coletion() {
        filledIntArray = new int [10];
        intArrayCopy = new int [intArray.length];

        Arrays.fill(filledIntArray, 7);
        Arrays.sort(doubleArray);

        System.arraycopy(intArray, 0, intArrayCopy, 0, intArray.length);
    }

    public void printArrays() {
        System.out.print("double Array: ");
        for (double doubleValue:doubleArray)
            System.out.printf("%.1f", doubleValue);
        System.out.println("int array: ");
        for (int intValue:intArray)
            System.out.printf("%d", intValue);
        System.out.println("filled array: ");
        for (int filledValue:filledIntArray)
            System.out.printf("%df", filledValue);
        System.out.println("int copy array: ");
        for (int intValue:intArray)
            System.out.printf("%df", intValue);
    }

    public int searchForInt(int value){
        return Arrays.binarySearch(intArray, value);
    }

    public void printEquals(){
        Boolean b = Arrays.equals(intArray, intArrayCopy);
        System.out.printf("\n intArray %s intArrayCopy", )

        b = Arrays.equals(intArray, filledIntArray);
        System.out.printf("\n intArray %s filledIntArray")
    }
}
