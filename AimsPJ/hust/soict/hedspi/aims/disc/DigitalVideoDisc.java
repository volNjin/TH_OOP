package AimsPJ.hust.soict.hedspi.aims.disc;

public class DigitalVideoDisc {
    
// Khai bao cac thuoc tinh

    private String title;
    private String category;
    private String director;
    private int length;
    private float cost;

// Xay dung cac phuong thuc
// 1. Cac phuong thuc get/set

    public String getTitle (){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getCategory(){
        return this.category;
    }
    public void setCategory(String category){
        this.category = category;
    }
    public String getDirector(){
        return this.director;
    }
    public void setDirector(String director){
        this.director = director;
    }
    public int getLength(){
        return this.length;
    }
    public void setLength(int length){
        this.length = length;
    }
    public float getCost(){
        return this.cost;
    }
    public void setCost(float cost){
        if(cost >0)
            this.cost = cost;
        else 
            this.cost = 0.0f;
    }

//2. Cac phuong thuc khoi tao
//-Nhiem vu cua constructor: tao vung nho chua thong tin cua object va thiet lap/gan gia tri co cac thuoc tinh cua object
//-Dac diem cua constructor:
//+Ten cua constructor trung voi ten lop
//+Khong co kieu tra ve, khong dung tu khoa void
//-Co the xay dung nhieu constructor voi tham so khac nhau
//->Giup khoi tao doi tuong theo nhieu cach

//2.1 Constructor khong tham so
    public DigitalVideoDisc(){
        this.title = "";
        this.category = "";
        this.director = "";
        this.length = 0;
        this.cost = 0.0f;
    }
//2.2 Constructor voi 1 tham so
    public DigitalVideoDisc(String title){
        super();
        this.title = title;
    }
//2.3 Constructor voi 2 tham so
    public DigitalVideoDisc(String title, String category){
        super();
        this.title = title;
        this.category = category;
    }
//2.4 Constructor voi 3 tham so
    public DigitalVideoDisc(String title, String category, String director){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
    }
//2.5 Constructor voi tat ca tham so
    public DigitalVideoDisc(String title, String category, String director, int length, float cost){
        super();
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
//3. Cac phuong thuc khac
//Phuong thuc in thong tin cua doi tuong DVD
    public void printInfo(){
        System.out.println("-----DVD info-----");
        System.out.println("Title: "+this.title);
        System.out.println("Category: "+this.category);
        System.out.println("Director: "+this.director);
        System.out.println("Length: "+this.length);
        System.out.println("Cost: "+this.cost);
    }
    public boolean search(String title){
        String sTitle[] = title.split(" ");
        for (String s: sTitle){
            if(this.title.contains(s)==false) return false;
        }
        return true;
    }
}
