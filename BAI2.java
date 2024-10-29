import java.util.Scanner;
public class BAI2{
    public static void main(String[] args) {
        String hoten,lop,MSSV;
        Scanner sc=new Scanner(System.in);
        System.out.println("Nhap ho va ten sinh vien: ");hoten=sc.nextLine();
        System.out.println("Nhap lop cho sinh vien: ");lop=sc.nextLine();
        System.out.println("Nhap ma so sinh vien cho sinh vien: ");MSSV=sc.nextLine();
        System.out.println("Thong tin sinh vien tren la: ");
        System.out.println("Ho va ten sinh vien do la: "+ hoten);
        System.out.println("Lop cua sinh vien do la: "+ lop);
        System.out.println("Ma so sinh vien do la: "+ MSSV);
        sc.close();
    }
}