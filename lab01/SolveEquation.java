package lab01;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class SolveEquation {
    
    public static void FirstDegreeEquation(){
        String strNum1,strNum2;
        Double a, b;
        String message = "Solve the first-degree equation with one variable";
        strNum1 = JOptionPane.showInputDialog(null,"Input a: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Input b: ",message,JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        if(a==0 && b==0){
            JOptionPane.showMessageDialog(null,
                a+"x+"+b+"=0\n"+
                "The equation has infinitely many solutions!",
            message,JOptionPane.INFORMATION_MESSAGE);
        }else if (a==0 && b!=0){
            JOptionPane.showMessageDialog(null,
                a+"x+"+b+"=0\n"+
                "The equation has no solution!",
            message,JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null,a+"x+"+b+"=0\nThe equation has a unique solution x = "+ String.format("%.2f",(-b/a)), 
            message,JOptionPane.INFORMATION_MESSAGE);
    }
    public static void SystemOfFirstDegreeEquation(){
        String strNum1,strNum2,strNum3,strNum4,strNum5,strNum6;
        Double a11,a12,a21,a22,b1,b2;
        Double D,D1,D2;
        String message = "Solve the system of first-degree equation with two variables";
        strNum1 = JOptionPane.showInputDialog(null,"Input a11: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Input a12: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null,"Input a21: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum4 = JOptionPane.showInputDialog(null,"Input a22: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum5 = JOptionPane.showInputDialog(null,"Input b1: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum6 = JOptionPane.showInputDialog(null,"Input a2: ",message,JOptionPane.INFORMATION_MESSAGE);
        a11 = Double.parseDouble(strNum1);
        a12 = Double.parseDouble(strNum2);
        a21 = Double.parseDouble(strNum3);
        a22 = Double.parseDouble(strNum4);
        b1 = Double.parseDouble(strNum5);
        b2 = Double.parseDouble(strNum6);
        D = a11*a22 - a21*a12;
        D1 = b1*a22 - b2*a12;
        D2 = a11*b2 - a21*b1;
        if(D!=0)
            JOptionPane.showMessageDialog(null,
                a11+"x1+"+a12+"x2="+b1+"\n"+
                a21+"x1+"+a22+"x2="+b2+"\n"+
                "The system has a unique solution (x1,x2)="+"("+String.format("%.2f",D1/D)+","+String.format("%.2f",D2/D)+")",
                message,JOptionPane.INFORMATION_MESSAGE);
        else if(D==0 && D1==0 && D2==0)
            JOptionPane.showMessageDialog(null,
                a11+"x1+"+a12+"x2="+b1+"\n"+
                a21+"x1+"+a22+"x2="+b2+"\n"+
                "The system has infinitely many solutions!",
                message,JOptionPane.INFORMATION_MESSAGE); 
        else
            JOptionPane.showMessageDialog(null,
                a11+"x1+"+a12+"x2="+b1+"\n"+
                a21+"x1+"+a22+"x2="+b2+"\n"+
                "The system has no solution!",
                message,JOptionPane.INFORMATION_MESSAGE);
    }
    public static void SecondDegreeEquation(){
        String strNum1,strNum2,strNum3;
        Double a,b,c,delta;
        String message = "Solve the second-degreeequation with one variable";
        strNum1 = JOptionPane.showInputDialog(null,"Please input a: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Please input b: ",message,JOptionPane.INFORMATION_MESSAGE);
        strNum3 = JOptionPane.showInputDialog(null,"Please input c: ",message,JOptionPane.INFORMATION_MESSAGE);
        a = Double.parseDouble(strNum1);
        b = Double.parseDouble(strNum2);
        c = Double.parseDouble(strNum3);
        if(a == 0){
            if(b==0 && c==0){
                JOptionPane.showMessageDialog(null,
                    a+"x^2+"+b+"x+"+c+"=0\n"+
                    "The equation has infinitely many solutions!",
                    message,JOptionPane.INFORMATION_MESSAGE);
            }else if (b==0 && c!=0){
                JOptionPane.showMessageDialog(null,
                    a+"x^2+"+b+"x+"+c+"=0\n"+
                    "The equation has no solution!",
                    message,JOptionPane.INFORMATION_MESSAGE);
            }
            else
                JOptionPane.showMessageDialog(null,
                    a+"x^2+"+b+"x+"+c+"=0\n"+
                    "The equation has a unique solution x = "+String.format("%.2f",-c/b),
                    message,JOptionPane.INFORMATION_MESSAGE);
        }
        if(a!=0){
            delta = b*b-4*a*c;
            if(delta<0){
                JOptionPane.showMessageDialog(null,
                    a+"x^2+"+b+"x+"+c+"=0\n"+
                    "The equation has no solution!",
                    message,JOptionPane.INFORMATION_MESSAGE);
            }else if(delta == 0){
                JOptionPane.showMessageDialog(null,
                    a+"x^2+"+b+"x+"+c+"=0\n"+
                    "The equation has a unique solution x = "+(-b/2*a),
                    message,JOptionPane.INFORMATION_MESSAGE);
            }else 
                JOptionPane.showMessageDialog(null,
                    a+"x^2+"+b+"x+"+c+"=0"+
                    "\nThe equation has two experiences:\n"+
                    "x1 = "+((-b+Math.sqrt(delta))/2*a)+"\n"+
                    "x2 = "+((-b-Math.sqrt(delta))/2*a),
                    message,JOptionPane.INFORMATION_MESSAGE);
        }
    }
    public static void main(String[] args) {
        String tmp;
        int choice = 0;
        while(choice!=4){
            tmp = JOptionPane.showInputDialog(null,
                "1. The first-degree equation with 1 variable\n"+
                "2. The system of first-degree equation with 2 variables\n"+
                "3. The second-degree equation with 1 variable\n"+
                "4. Exit\n", 
                "Choose program to solve: ",JOptionPane.INFORMATION_MESSAGE);
            choice = parseInt(tmp);
            if(choice==1)FirstDegreeEquation();
            else if(choice==2)SystemOfFirstDegreeEquation(); 
            else if(choice==3)SecondDegreeEquation();
            /*else if(input==4);
            else {
                JOptionPane.showMessageDialog(null,
                    "Wrong intput!\nPlease choose 1 of 4 options.",
                    "Warning!",JOptionPane.INFORMATION_MESSAGE);
                continue;
            }*/
        }
    }    
}
