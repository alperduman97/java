package day21_arrays_multiDimensionalArrays;

import java.util.Arrays;

public class c08_MDA_SartliUpdate {
    public static void main(String[] args) {



        //verilen 2katli mutli dimensional array'de
        //elementleri icinde bulundugu inner arraydeki indexi kadar arttırın


        int[][] arr = {{4,-1,-5}, {6,-9,2},{1,5,-8,-4,3,6}};

        for (int i = 0; i <arr.length; i++) {//  i --> inner array kontrol noktası

            for (int j = 0; j <arr[i].length; j++) {// j --> inner array'deki elementlerin indexi kontrol noktası

                arr[i][j] +=j;
            }

        }


        System.out.println(Arrays.deepToString(arr)); // [[4, 0, -3], [6, -8, 4], [1, 6, -6, -1, 7, 11]]




    }
}
