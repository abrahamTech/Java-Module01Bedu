package org.abrahamtech.session06b;

public class BinarySearch {
    //[100, 200, 300, ... , 800]

    public static int search(int[] array, int number) {
        if(array.length == 0) {
            return -1;
        }

        if(array.length == 1 && array[0] == number) {
            return 0;
        }

        int index = (int)(Math.floor(array.length / 2));

        if(array.length % 2 == 1 && array[index] == number) {
            return index;
        }

        if (array.length % 2 == 0 && array[index - 1] == number){
            return index - 1;
        }
 
        return -1;
    }
}