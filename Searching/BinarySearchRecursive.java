package com.baljinder;

public class BinarySearchRecursive {
    public static void main(String[] args) {
        int[] arrayToSearch = {1,2,3,5,7,9,12,15};

        int indexNumber = binarySearch(arrayToSearch, 0,arrayToSearch.length-1,5);
        if(indexNumber >=0){
            System.out.println("Number found at " + indexNumber);
        }else{
            System.out.println("Number not found");
        }
    }

    private static int binarySearch(int[] array, int startIndex, int endIndex, int numberToSearch){
        int middle = (startIndex+endIndex)/2;

        if(array[middle] == numberToSearch){
            return middle;
        }else if(array[middle] > numberToSearch){
            return binarySearch(array,startIndex,middle-1,numberToSearch);
        }else if(array[middle] < numberToSearch){
            return binarySearch(array,middle+1,endIndex,numberToSearch);
        }
        return -1;
    }
}
