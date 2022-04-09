package lab02;
import java.util.Scanner;
public class TriangleOfStars {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        int height = sc.nextInt();
        for (int i=0;i<height;i++){
            for (int j=0;j<height-i;j++)
                System.out.print(" ");
            for (int k=0;k<2*i+1;k++)
                System.out.print("*");
            System.out.println();
        }
        sc.close();
    }
}
