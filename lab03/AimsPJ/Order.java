package lab03.AimsPJ;

public class Order {
    //Khai bao mot hang so: so luong san pham toi da
    public static final int MAX_NUMBERS_ORDERED = 10;
    //Khai bao mot mang cac doi tuong DVD
    private DigitalVideoDisc itemsOrders[] = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    //Khai bao thuoc tinh chua so luong phan tu hien co trong don hang
    private int qtyOrdered = 0;

    //Xay dung cac phuong thuc get/set
    public int getQtyOrdered(){
        return this.qtyOrdered;
    }
    public void setQtyOrdered(int qtyOrdered){
        this.qtyOrdered = qtyOrdered;
    }

    //Xay dung phuong thuc them 1 doi tuong dvd vao do hang
    //Noi dung: them 1 doi tuong vao mang itemsOrdered
    //->Phai kiem tra xem mang da day chua
    public void addDVD(DigitalVideoDisc dvd){
        if(this.qtyOrdered==MAX_NUMBERS_ORDERED)
            System.out.println("The order is almost full");
        else {
            this.itemsOrders[qtyOrdered] = dvd;
            qtyOrdered++;
            System.out.println("The disc has been added");
            System.out.println("Total disc: "+this.qtyOrdered);
        }
    }

    //Xoa 1 doi tuong dvd khoi don hang
    //Luu y kiem tra mang rong
    public void removeDVD(DigitalVideoDisc dvd){
        if(this.qtyOrdered==0)
            System.out.println("There are no order at all");
        else {
            for(int i=0;i<this.qtyOrdered;i++)
                if(this.itemsOrders[i]==dvd){
                    for(int j=i;j<this.qtyOrdered;j++)
                        this.itemsOrders[j]=this.itemsOrders[j+1];
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
            total+= itemsOrders[i].getCost();
        return total;
    }
}
