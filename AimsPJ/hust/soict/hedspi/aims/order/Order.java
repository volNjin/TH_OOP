package AimsPJ.hust.soict.hedspi.aims.order;

import java.util.Random;

import AimsPJ.hust.soict.hedspi.aims.disc.DigitalVideoDisc;
import AimsPJ.hust.soict.hedspi.aims.utils.*;
public class Order {
    //Khai bao mot hang so: so luong san pham toi da
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITTED_ORDER = 5;
    private static int nbOrders = 0;
    //Khai bao mot mang cac doi tuong DVD
    private DigitalVideoDisc itemsOrdered[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private MyDate dateOrdered;
    //Khai bao thuoc tinh chua so luong phan tu hien co trong don hang
    private int qtyOrdered = 0;

    //Xay dung cac phuong thuc get/set
    public int getQtyOrdered(){
        return this.qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered){
        this.qtyOrdered = qtyOrdered;
    }
    public Order(){
        dateOrdered= new MyDate();
        nbOrders++;
        if(nbOrders > MAX_LIMITTED_ORDER) System.out.println("Over limit order!");
    }
    //Xay dung phuong thuc them 1 doi tuong dvd vao do hang
    //Noi dung: them 1 doi tuong vao mang itemsOrdered
    //->Phai kiem tra xem mang da day chua
    public void addDVD(DigitalVideoDisc dvd){
        if(this.qtyOrdered==MAX_NUMBERS_ORDERED)
            System.out.println("The order is almost full");
        else {
            this.itemsOrdered[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Total disc: "+this.qtyOrdered);
        }
    }
    public void addDVD(DigitalVideoDisc dvdList[]){
        if(this.qtyOrdered==MAX_NUMBERS_ORDERED || this.qtyOrdered+dvdList.length>MAX_NUMBERS_ORDERED)
            System.out.println("The order is almost full");
        else {
            for(int i=0;i<dvdList.length;i++){  
                this.addDVD(dvdList[i]);
            }
            /*for(DigitalVideoDisc dvd: dvdList)
                this.addDVD(dvd);*/
            System.out.println("The list of disc has been added");
            System.out.println("Total disc: "+this.qtyOrdered);
        }
    }

    public void addDVD(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2){
        this.addDVD(dvd1);
        this.addDVD(dvd2);
    }
    //Xoa 1 doi tuong dvd khoi don hang
    //Luu y kiem tra mang rong
    public void removeDVD(DigitalVideoDisc dvd){
        if(this.qtyOrdered==0)
            System.out.println("There are no order at all");
        else {
            for(int i=0;i<this.qtyOrdered;i++)
                if(this.itemsOrdered[i]==dvd){
                    for(int j=i;j<this.qtyOrdered;j++)
                        this.itemsOrdered[j]=this.itemsOrdered[j+1];
                    this.qtyOrdered--;
                }
                System.out.println("The disc has been removed");
                System.out.println("Total disc: "+this.qtyOrdered);
        }
    }

    //Tinh tong gia tri don hang
    public float totalCost(){
        float total = 0.0f;
        for(int i=0; i<this.qtyOrdered; i++)
            total+= itemsOrdered[i].getCost();
        return total;
    }
    public void showListOrdered(){
        System.out.println("***********************Order***********************");
        System.out.print("Date: ");
        dateOrdered.printByFormat(5);
        System.out.println("Ordered Items:");
        for(int i = 0; i < qtyOrdered; i++){
            System.out.println((i+1)+". DVD - "+this.itemsOrdered[i].getTitle()+" - "
                    +this.itemsOrdered[i].getCategory()+" - "
                    +this.itemsOrdered[i].getDirector()+" - "
                    +this.itemsOrdered[i].getLength()+" minutes : "
                    +this.itemsOrdered[i].getCost()+"$");
        } 
        System.out.println("Total cost: "+totalCost()+"$");
        System.out.println("***************************************************");
    }
    public DigitalVideoDisc getALuckyItem(){
        Random rd = new Random();
        int luckynumber = rd.nextInt(this.qtyOrdered);
        this.itemsOrdered[luckynumber].setCost(0);
        return this.itemsOrdered[luckynumber];
    }
}
