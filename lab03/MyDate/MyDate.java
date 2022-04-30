package lab03.MyDate;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class MyDate {
    private int day;
    private int month;
    private int year;
    public MyDate(){
        Calendar calendar = Calendar.getInstance(TimeZone.getDefault());
        this.day = calendar.get(Calendar.DATE);
        this.month = calendar.get(Calendar.MONTH) + 1;
        this.year = calendar.get(Calendar.YEAR);
    }
    public MyDate(int day, int month, int year){
        if(checkDay(day, month, year)){
            setDay(day);
            setMonth(month);
            setYear(year);
        }
        else System.out.println("Invalid date!");
    }
    public MyDate(String date){
        getDatefromStringdate(date);
    }
    public void accept(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Input date: ");
        String date = sc.nextLine();
        getDatefromStringdate(date);
        sc.close();
    }
    public void getDatefromStringdate(String date){
        int day,month,year;
        String[] splitted_date=date.split(" ",-2);
        day=covertStrdaytoIntday(splitted_date[1]);
        month=convertStrmonthtoIntmonth(splitted_date[0]);
        year=parseInt(splitted_date[2]);
        if(checkDay(day, month, year)){
            setDay(day);
            setMonth(month);
            setYear(year);
        }
        else System.out.println("Invalid date!");
    }
    private static Boolean checkYear(int year){
        return (((year % 4 == 0) && (year % 100 != 0)) ||
             (year % 400 == 0));
    }
    private static Boolean checkDay(int day, int month, int year){
        switch(month){
            case 1: return 0<day && day<=31;
            case 2: 
                if(checkYear(year)) return 0< day && day<=29;
                else return 0< day && day<=28;
            case 3: return 0< day && day<=31;
            case 4: return 0< day && day<=30;
            case 5: return 0< day && day<=31;
            case 6: return 0< day && day<=30;
            case 7: return 0< day && day<=31;
            case 8: return 0< day && day<=31;
            case 9: return 0< day && day<=30;
            case 10: return 0< day && day<=31;
            case 11: return 0< day && day<=30;
            case 12: return 0< day && day<=31;
        }
        return false;
    }
    public int covertStrdaytoIntday(String day){
        if(day.length()<=2)
            return parseInt(day);
        if(day.length()<=4){
            String sp_day_tail = day.substring(1, day.length());
            String day_tail = day.substring(2, day.length());
                if(sp_day_tail.compareTo("1st")==0 || 
                    sp_day_tail.compareTo("2nd")==0 || 
                    sp_day_tail.compareTo("3rd")==0 ||
                    day_tail.compareTo("th") ==0)
                return parseInt(day.substring(0, day.length()-2));
        }
        return 0;
    }
    public int convertStrmonthtoIntmonth(String month){
        if( month.compareTo("January") == 0 || 
            month.compareTo("Jan") == 0 ||
            month.compareTo("Jan.") == 0 ){
            return 1;
        }
        if( month.compareTo("February") == 0 || 
            month.compareTo("Feb") == 0 ||
            month.compareTo("Feb.") == 0 ){
            return 2;
        }
        if( month.compareTo("March") == 0 || 
            month.compareTo("Mar") == 0 ||
            month.compareTo("Mar.") == 0 ){
            return 3;
        }
        if( month.compareTo("April") == 0 || 
            month.compareTo("Apr") == 0 ||
            month.compareTo("Apr.") == 0 ){
            return 4;
        }
        if( month.compareTo("May") == 0 ){
            return 5;
        }
        if( month.compareTo("June") == 0 || 
            month.compareTo("Jun") == 0 ){
            return 6;
        }
        if( month.compareTo("July") == 0 || 
            month.compareTo("Jul") == 0){
            return 7;
        }
        if( month.compareTo("August") == 0 || 
            month.compareTo("Aug") == 0 ||
            month.compareTo("Aug.") == 0 ){
            return 8;
        }
        if( month.compareTo("September") == 0 || 
            month.compareTo("Sep") == 0 ||
            month.compareTo("Sep.") == 0 ){
            return 9;
        }
        if( month.compareTo("October") == 0 || 
            month.compareTo("Oct") == 0 ||
            month.compareTo("Oct.") == 0 ){
            return 10;
        }
        if( month.compareTo("November") == 0 || 
            month.compareTo("Nov") == 0 ||
            month.compareTo("Nov.") == 0 ){
            return 11;
        }
        if( month.compareTo("December") == 0 || 
            month.compareTo("Dec") == 0 ||
            month.compareTo("Dec.") == 0 ){
            return 12;
        }
        return 0;
    }
    public void print(){
        String date="";
        switch(month){
            case 1: date += "January "; break;
            case 2: date += "February "; break;
            case 3: date += "March "; break;
            case 4: date += "April "; break;
            case 5: date += "May "; break;
            case 6: date += "June "; break;
            case 7: date += "July "; break;
            case 8: date += "August "; break;
            case 9: date += "September "; break;
            case 10: date += "October "; break;
            case 11: date += "November "; break;
            case 12: date += "December "; break;
        }
        switch(day){
            case 1: 
            case 11:
            case 21:
            case 31: date+=day+"st "; break;
            case 2:
            case 12:
            case 22: date+=day+"nd "; break;
            case 3:
            case 13:
            case 23: date+=day+"rd "; break;
            default : date+=day+"th "; break;
        }
        date+=year;
        System.out.println(date);
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
