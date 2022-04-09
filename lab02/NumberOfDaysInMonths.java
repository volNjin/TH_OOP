package lab02;
import java.util.Scanner;
public class NumberOfDaysInMonths {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean input=false;
        int daysinMonth=0;
        int year=0;
        String MonthName = "Invalid";
        do{
            System.out.print("Enter the month: ");
            String month = sc.nextLine();

            System.out.print("Enter the Year: ");
            year = sc.nextInt();

            if(month.equals("January")||month.equals("Jan.")||month.equals("Jan")||month.equals("1")){
                MonthName = "January";
                daysinMonth = 31;
                input=true;
            }
            else if (month.equals("February")||month.equals("Feb.")||month.equals("Feb")||month.equals("2")){
                MonthName = "February";
                if((year%400==0) || ((year%100!=0) && (year%4==0))){
                    daysinMonth = 29;
                }
                else {
                    daysinMonth = 28;
                }
                input=true;
            }
            else if(month.equals("March")||month.equals("Mar.")||month.equals("Mar")||month.equals("3")){
                MonthName = "March";
                daysinMonth = 31;
                input=true;
            }
            else if(month.equals("April")||month.equals("Apr.")||month.equals("Apr")||month.equals("4")){
                MonthName = "April";
                daysinMonth = 30;
                input=true;
            }
            else if(month.equals("May")||month.equals("5")){
                MonthName = "May";
                daysinMonth = 31;
                input=true;
            }
            else if(month.equals("June")||month.equals("Jun")||month.equals("6")){
                MonthName = "June";
                daysinMonth = 30;
                input=true;
            }
            else if(month.equals("July")||month.equals("Jul")||month.equals("7")){
                MonthName = "July";
                daysinMonth = 31;
                input=true;
            }
            else if(month.equals("August")||month.equals("Aug.")||month.equals("Aug")||month.equals("8")){
                MonthName = "August";
                daysinMonth = 31;
                input=true;
            }
            else if(month.equals("September")||month.equals("Sept.")||month.equals("Seb")||month.equals("9")){
                MonthName = "September";
                daysinMonth = 30;
                input=true;
            }
            else if(month.equals("October")||month.equals("Oct.")||month.equals("Oct")||month.equals("10")){
                MonthName = "October";
                daysinMonth = 31;
                input=true;
            }
            else if(month.equals("November")||month.equals("Nov.")||month.equals("Nov")||month.equals("11")){
                MonthName = "November";
                daysinMonth = 30;
                input=true;
            }
            else if(month.equals("December")||month.equals("Dec.")||month.equals("Dec")||month.equals("12")){
                MonthName = "December";
                daysinMonth = 31;
                input=true;
            }
        }while(input==false);
        System.out.println(MonthName +" "+ year +" has "+ daysinMonth +" days\n");
        sc.close();
    }
}
