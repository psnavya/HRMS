package com.hrms.testautomation.stepDefinitions.leaves;

public class Test {
     /*7,2,6,1,..*/
    public static void main(String[] args)
    {
        int[] arr={7,2,6,1,4,7,4,5,4,7,7,3,1};
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr);
            }
        }
        /*for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println("Duplicate value: " + arr[i]);
                    System.out.println("Iterator: " + arr[i] + " " + count);
                }
            }
            count=0;
        }*/
    }
}
