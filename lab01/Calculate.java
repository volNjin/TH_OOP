package lab01;

import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class Calculate {
    public static void main(String[] args) {
        String strNum1,strNum2,tmp;
        Double num1, num2;
        int choice=0;
        strNum1 = JOptionPane.showInputDialog(null,"Input first number: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
        strNum2 = JOptionPane.showInputDialog(null,"Input second number: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
        num1 = Double.parseDouble(strNum1);
        num2 = Double.parseDouble(strNum2);
        while(choice!=5){
            tmp = JOptionPane.showInputDialog(null,
                "1. Add\n"+
                "2. Subtract\n"+
                "3. Multiply\n"+
                "4. Devide\n"+
                "5. Exit", 
                "Choose program to : ",JOptionPane.INFORMATION_MESSAGE);
            choice = parseInt(tmp);
            if(choice==1)
                JOptionPane.showMessageDialog(null, num1+" + "+num2+" = " + (num1+num2), "Sum",JOptionPane.INFORMATION_MESSAGE );
            else if(choice==2)
                JOptionPane.showMessageDialog(null, num1+" - "+num2+" = " + (num1-num2), "Different",JOptionPane.INFORMATION_MESSAGE ); 
            else if(choice==3)
                JOptionPane.showMessageDialog(null, num1+" * "+num2+" = " + (num1*num2), "Product",JOptionPane.INFORMATION_MESSAGE );
            else if(choice==4)
                if(num2!=0)
                    JOptionPane.showMessageDialog(null, num1+" / "+num2+" = " + (num1/num2), "Quotient",JOptionPane.INFORMATION_MESSAGE );
                else
                    JOptionPane.showMessageDialog(null, "Can not calculate because the second number is 0", "Warning!",JOptionPane.INFORMATION_MESSAGE );
        }
    }
}
