package com.baljinder;

public class InsertionSortIterative {
    public static void main(String[] args) {
        int[] numberToSort = {4,11,2,5,1,7,2};

        for(int i : insertionSort(numberToSort)){
            System.out.println(i);
        }
    }

    private static int[] insertionSort(int[] array){
        for(int i=1; i<array.length;i++){
            int keyValue = array[i];
            int j = i-1;

            while(j>=0 && keyValue<array[j]){
                array[j+1] = array[j];
                j--;
            }
            array[j+1] = keyValue;
        }
        return array;
    }
}
