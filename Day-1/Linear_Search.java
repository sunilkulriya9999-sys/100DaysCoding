package com.asdfgh;

public class LinearSearch1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  int[] arr = {10, 25, 30, 45, 50};
	        int key = 30;
	        boolean found = false;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] == key) {
	                System.out.println("Element " + key + " found at index " + i);
	                found = true;
	                break;
	            }
	        }

	        if (!found) {
	            System.out.println("Element " + key + " not found in the array.");
	}

}
}
