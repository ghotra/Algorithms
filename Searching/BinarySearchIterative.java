package com.baljinder;

public class BinarySearchIterative {
    public static void main(String[] args) {
        int[] arrayToSearch = {1,2,3,5,7,9,12,15};

        int indexNumber = binarySearch(arrayToSearch, 5);
        if(indexNumber >=0){
            System.out.println("Number found at " + indexNumber);
        }else{
            System.out.println("Number not found");
        }
    }

    private static int binarySearch(int[] array, int numberToSearch){
        int startIndex = 0;
        int endIndex = array.length-1;

        while(startIndex <= endIndex){
            int middle = (startIndex+endIndex)/2;

            if(array[middle] == numberToSearch){
                return middle;
            }else if(array[middle] > numberToSearch){
                endIndex = middle-1;
            }else if(array[middle] < numberToSearch){
                startIndex = middle+1;
            }
        }
        return -1;
    }
}
