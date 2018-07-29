package com.baljinder;

public class InsertionSortRecursive {
    public static void main(String[] args) {
        int[] numberToSort = {4,11,2,5,1,7,2};

        for(int i : insertionSort(numberToSort,0)){
            System.out.println(i);
        }
    }

    private static int[] insertionSort(int[] array, int indexValue){

        if(indexValue == array.length){
            return array;
        }
        int keyValue = array[indexValue];
        int j = indexValue-1;

        while(j>=0 && keyValue<array[j]){
            array[j+1] = array[j];
            j--;
        }
        array[j+1] = keyValue;

        return insertionSort(array,indexValue+1);
    }
}
