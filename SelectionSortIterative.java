package com.baljinder;

public class SelectionSortIterative {
    public static void main(String[] args) {
        int[] numberToSort = {4,11,2,5,1,7,2};

        for(int i: selectionSort(numberToSort)){
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] array){
        for(int i=0; i<array.length-1;i++){
            int minIndex = i;
            for(int j=i+1;j<array.length;j++){
                if(array[minIndex] > array[j]){
                    int temp = array[minIndex];
                    array[minIndex] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

}
