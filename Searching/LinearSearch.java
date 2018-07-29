package com.baljinder;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arrayToSearch = {4,11,3,5,1,7,2};

        int indexNumber = linearSearch(arrayToSearch,5);

        if(indexNumber >= 0) {
            System.out.println("Number found at index " + indexNumber);
        }else{
            System.out.println("Number not found");
        }
    }

    private static int linearSearch(int[] array, int numberToFind){
        for(int i=0; i<array.length; i++){
            if(array[i] == numberToFind){
                return i;
            }
        }
        return -1;
    }
}
