package com.company.day4;

import com.company.day3.Address;

import java.util.Arrays;

public class FunWithArrays {
    public static void main(String[] args) {
        //fixed length, length always need to be known upon array creation
        int[] arrayInt = new int[7];
        arrayInt[0] = 8;
        arrayInt[1] = 3;
        arrayInt[2] = 2;
        arrayInt[3] = 23;
        arrayInt[4] = 3232;
        arrayInt[5] = 7;
        arrayInt[6] = 1;
        arrayInt[2] = 6555555;
        System.out.println(arrayInt[2]);

        //different way of writing, it does a count to get the fixed length
        int[] arrayInt2 = {6,1,232323,32,73,1,3,4,7,8,9};
        arrayInt2[4] = 23;

        //array of anything
        Address[] addresses = new Address[3];
        System.out.println(addresses[0]);
        addresses[0] = new Address();
        addresses[1] = new Address();
        addresses[2] = new Address();
        addresses[0].setClean(true);
        addresses[0].setCity("Utrecht");
        System.out.println(addresses.length);
        System.out.println(addresses[0].getCity());

        //looping though an array
        for(int i = 0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

        Arrays.sort(arrayInt);
        for(int i = 0; i < arrayInt.length; i++){
            System.out.println(arrayInt[i]);
        }

        int[][] multiInt = new int[2][];
        multiInt[0] = new int[5];
        multiInt[0][0] = 2;
        multiInt[0][1] = 3;
        multiInt[0][2] = 4;
        multiInt[1] = new int[3];
        multiInt[1][0] = 4;
        multiInt[1][1] = 56;
        multiInt[1][2] = 34;

        for(int i = 0; i < multiInt.length; i++){
            System.out.println(multiInt[i]);
            for(int j = 0; j < multiInt[i].length; j++){
                System.out.println(multiInt[i][j]);
            }
        }
    }
}
