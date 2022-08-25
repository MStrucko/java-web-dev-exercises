package org.launchcode.java.demos.lsn2controlflowandcollections;

public class Chapter3Exercise {
    public static void main(String[] args) {
        int[] myArray = {1, 1, 2, 3, 5, 8};

        for (int integer: myArray){
            System.out.println(integer);
        }

        for(int i = 0; i < myArray.length; i++){
            if(myArray[i]%2 == 0){
                System.out.println("not odd condition: " + myArray[i]);
                continue;
            }
            System.out.println(myArray[i]);
        }
    }

}
