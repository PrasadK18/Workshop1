/*Prasad Write a prog to find sum of negative array given no is array like [-1,-2,-4, 5 , 8, 9]
        find sum like [-1,-2,-4] sum should be -7*/


package com.bridgelabz;

public class SumNegArr {
    public static void main(String[] args) {
        int [] arr = {-1,-2,-4, 5 , 8, 9};
        int sum = 0;

        for (int i=0; i<arr.length;i++){
          //  System.out.println(arr[i]);
            //if(arr[i]<0){
                sum+=arr[i];
        }//
        System.out.println("negative number sum :=" + sum);
    }
}
