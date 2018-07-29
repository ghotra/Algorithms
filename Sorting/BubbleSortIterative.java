package com.baljinder;

public class BubbleSortIterative {

    public static void main(String[] args) {
	    int[] numberToSort = {4,11,2,5,1,7,2};

	    for(int i : bubbleSort(numberToSort)){
            System.out.println(i);
        }

    }

    private static int[] bubbleSort(int[] array){
        for(int i=0; i<array.length-1;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        return array;
    }
}
