package org.array;
public class Test2 {
public static void main(String[] args)
{   
 
       int[] a = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
       //calculate sum of all array elements
       int sum = 0;
       for(int i=0; i <a.length ; i++) 
        sum = sum + a[i];
       //average 
        double average = sum / a.length;
        System.out.println("Average: " + average); 
   
}   
}
