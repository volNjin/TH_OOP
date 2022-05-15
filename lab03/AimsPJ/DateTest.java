package lab03.AimsPJ;

public class DateTest {
    public static void main(String[] args){
        MyDate  date1 = new MyDate();
        MyDate  date2 = new MyDate(10,12,2001);
        MyDate  date3 = new MyDate("August 3 2001");
        MyDate  date4 = new MyDate("third", "August", "2001");
        MyDate  date5 = new MyDate("twenty first", "November", "1993");
        MyDate  date6 = new MyDate("tenth", "Dec", "2001");
        date1.print();
        date2.printByFormat(1);
        date3.printByFormat(2);
        date4.printByFormat(3);
        date5.printByFormat(4);
        date6.printByFormat(5);
        if(DateUtils.compareTwoDates(date2, date3)==1){
            date1.print();
            System.out.print("is after ");
            date2.print();
        } else if(DateUtils.compareTwoDates(date2, date3)==-1){
            date1.print();
            System.out.print("is before ");
            date2.print();
        } else {
            System.out.println("They are the same date");
        }
    }
}
