package com.baljinder;

public class SelectionSortRecursive {
    public static void main(String[] args) {
        int[] numberToSort = {4,11,2,5,1,7,2};

        for(int i: selectionSort(numberToSort,0)){
            System.out.println(i);
        }
    }

    private static int[] selectionSort(int[] array,int minIndex){
        if(minIndex == array.length-1){
            return array;
        }

        for(int i=minIndex+1; i<array.length;i++){
            if(array[minIndex] > array[i]){
                    int temp = array[minIndex];
                    array[minIndex] = array[i];
                    array[i] = temp;
                }
            }
        return selectionSort(array,minIndex+1);
    }
}
