package lab02;
import java.util.Scanner;
public class InputFromKeyboard {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("What's ur name?");
        String strName=sc.nextLine();
        System.out.println("How old r u?");
        int age=sc.nextInt();
        System.out.println("How tall r u?");
        double height=sc.nextDouble();
        System.out.print("Ur in4: ");
        System.out.println("Mr. "+strName+", "+age+" years old. Height: "+height+" m.");
        sc.close();
    }
}
