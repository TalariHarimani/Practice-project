package com.assignment;

public class BubbleSort {

	public static void main(String[] args) {
		int[] arr= {15,4,12,5,10};
	     System.out.println("Given Array");
	     for(int i=0;i<arr.length;i++){

	        System.out.print(arr[i]+" ");
	        }
	     bubbleSort(arr);
	     System.out.println();
	     System.out.println("Sorted Array");
	     for(int i=0;i<arr.length;i++){

		        System.out.print(arr[i]+" ");
		        }
	    }
      public static void bubbleSort(int[] arr){
	        int len = arr.length;
	        int temp = 0;
	        for(int i=0;i<len;i++){
	            for (int j=1;j<(len);j++){
	                if(arr[j-1]>arr[j]){
	                temp = arr[j-1];
	                arr[j-1]= arr[j];
	                arr[j]= temp;

	                }
                }
	        }
	    }
	 }