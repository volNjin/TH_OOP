package lab03.AimsPJ;

public class Aims {
    public static void main(String[] args){
        DigitalVideoDisc dvd0 = new DigitalVideoDisc();
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        dvd1.setCost(19.95f);

        DigitalVideoDisc dvd2 = new DigitalVideoDisc(
            "Star Wars", "Science fiction", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(
            "Aladdin", "Animation", "John Musker", 90, 18.95f);
        dvd0.printInfo();
        dvd1.printInfo();
        dvd2.printInfo();
        dvd3.printInfo();

        //Tao mot don hang moi
        Order anOrder = new Order();
        //Them dvd vao don hang
        anOrder.addDVD(dvd1);
        anOrder.addDVD(dvd2);
        anOrder.addDVD(dvd3);
        
        anOrder.removeDVD(dvd1);
        System.out.println("Total cost is: "+anOrder.totalCost());
    }
}