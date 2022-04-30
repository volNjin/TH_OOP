package lab03.MyDate;

public class DateTest {
    public static void main(String[] args){
        MyDate  date1 = new MyDate();
        MyDate  date2 = new MyDate(10,12,2001);
        MyDate  date3 = new MyDate("August 3 2001");
        date1.print();
        date2.print();
        date3.print();
    }
}
