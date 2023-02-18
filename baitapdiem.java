
package javaapplication2;
import java.util.Scanner;
public class baitapdiem {
    
    public static void main(String[] args) {
        Scanner diemtrungbinh = new Scanner(System.in);
        
        System.out.print("Nhap diem trung binh:");
        float diem = diemtrungbinh.nextFloat();
        
        if(diem < 5)
            System.out.println("Hoc sinh kem");
        
        if(diem < 7)
            System.out.println("Hoc sinh Trung Binh");
        
        if(diem < 8)
            System.out.println("Hoc sinh Kha");
        else 
            System.out.println("Hoc sinh Gioi");
    }
    
}
   
