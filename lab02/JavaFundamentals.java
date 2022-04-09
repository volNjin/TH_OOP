package lab02;

public class JavaFundamentals {
    public static void main(String[] args){
        System.out.println((int)(char)(byte)-1); //kiểu char không có dấu
        System.out.println('h'+'a'); //phép cộng char->acsii
        System.out.println(1+2+"3"); 
        System.out.println("1"+2+3); //gặp kiểu string-> tất cả số hạng sau đó thành kiểu string

        char a='\u0061';
        System.out.println(a); //ký tự kiểu char trong java là unicode
        ch\u0061r b='b';
        System.out.println(b);
    }
}
