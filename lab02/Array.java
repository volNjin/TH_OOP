package lab02;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[100];
        Scanner sc=new Scanner(System.in);
        System.out.print("Size of the array: ");
        int size=sc.nextInt();
        for(int i=0;i<size;i++){
            System.out.print("Value " +(i+1)+ ": ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Original arr[] : ");
        printArray(arr,size);
        Arrays.sort(arr,0,size);
        int sum = 0;
        double average;
        for(int i=0; i< size; i++){
            sum += arr[i] ;
        }
        average = ((double) sum)/size;
        System.out.println("Modified arr[] : ");
        printArray(arr,size);
        System.out.println("Sum of all elements : "+sum);
        System.out.println("Average of elements : "+average);
        sc.close();
    }
    public static void printArray(int[] arr, int size){
        for(int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");         
        System.out.println();
    }
}
