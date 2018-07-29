package com.baljinder;

public class SelectionSortIterative1 {
    public static void main(String[] args) {
        int[] numberToSort = {4,11,2,5,1,7,2};

        for(int i: selectionSort(numberToSort)){
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] array){
        for(int i=0; i<array.length-1;i++){
            for(int j=i+1;j<array.length;j++){
                if(array[i] > array[j]){
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
