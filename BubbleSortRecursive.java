package com.baljinder;

public class BubbleSortRecursive {
    public static void main(String[] args) {
        int[] numberToSort = {4,11,2,5,1,7,2};

        for(int i : bubbleSort(numberToSort,numberToSort.length)){
            System.out.println(i);
        }

    }

    public static int[] bubbleSort(int[] array, int arrayLength){
        if(arrayLength == 1){
            return array;
        }

        for(int i=0; i<arrayLength-1;i++){
            if(array[i] > array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        return bubbleSort(array,arrayLength-1);
    }
}
