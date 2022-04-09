package lab02;

import java.util.Scanner;

public class Add2matrices {
    public static void main(String[] args) {
        int r1,c1,r2,c2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of M[r1][c1]: ");
        System.out.print("r1: ");
        r1 = sc.nextInt();
        System.out.print("c1: ");
        c1 = sc.nextInt();
        System.out.println("Size of N[r2][c2]: ");
        System.out.print("r2: ");
        r2 = sc.nextInt();
        System.out.print("c2: ");
        c2 = sc.nextInt();
        if(r1!=r2 || c1!=c2) 
        { 
            System.out.println("Cannot add two matrices that are not the same size!"); 
            System.exit(0);
        } 
        System.out.println("Values of M: ");
        int a[][] = new int[r1][c1];
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("Value of N: ");
        int b[][] = new int[r2][c2];
        for(int i=0;i<r2;i++)
        {
            for(int j=0;j<c2;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }
        
        int c[][] = new int[r1][c1];
        System.out.println("Sum of two matrices:");
        for(int i=0;i<r1;i++)
        {
            for(int j=0;j<c1;j++)
            {
                c[i][j]=a[i][j]+b[i][j];
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
        sc.close();
    }  
}
