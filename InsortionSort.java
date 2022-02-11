package com.assignment;

public class InsortionSort {

	public static void main(String[] args) {
		int[] arr = {9,12,3,2,8};
		System.out.println("Given Array");
		for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }
		System.out.println();
		System.out.println("Sorted Array");
        insertionSort(arr);
        for(int i=0;i<arr.length;i++){

            System.out.print(arr[i]+" ");

        }
     }
    public static void insertionSort(int[] arr){

    int len = arr.length;
    for(int j=1;j<len;j++){
    int key = arr[j];
    int i=j-1;
    while ((i>-1) && (arr[i]>key)){

        arr[i+1]=arr[i];
        i--;
    }
    arr[i+1]=key;
         }

   }

}
