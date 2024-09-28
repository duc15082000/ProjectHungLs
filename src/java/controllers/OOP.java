 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Scanner;
import models.Coder;
import models.Person;

/**
 *
 * @author Admin
 */
public class OOP {
    public static void main(String[] args) {
        
        //Parameter: phương thức thongBao(String baocao)
        //Argument: Ở hàm main hay phương khác
        //thongBao("hom nay nghi hoc som hon 30p")
        
        //từ khóa this: phân biệt biến instance với 
        //biến cục bộ - parameter có cùng tên. 
        
        //instanceof() -> trả về true false
        //Toán tử instanceof()sẽ được sử dụng để kiểm tra xem 1 
        //đối tượng có thuộc về 1 kiểu dữ liệu cụ thể nào đó hay 
        //không(có thể là lớp hoặc interface)
        
        
        
        
        Coder coder = new Coder();
        Coder coder1 = new Coder();
        Person ps1 = new Person();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Nhap ten");
        String name = sc.next();
        coder.setName(name);
        
        
        System.out.println("Nhap tuoi");
        int tuoi = sc.nextInt();
        coder.setAge(tuoi);
        while (coder.getAge() == 0) {   
            tuoi = sc.nextInt();
            coder.setAge(tuoi);
        }
        
        System.out.println("Nhap tuoi");
        int tuoi1 = sc.nextInt();
        coder1.setAge(tuoi);
        while (coder1.getAge() == 0) {   
            tuoi = sc.nextInt();
            coder1.setAge(tuoi);
        }
        
        System.out.println("Nhap sdt");
        String sdt = sc.next();
        coder.setPhone(sdt);
        
        System.out.println("Nhap nn:");
        String nn = sc.next();
        coder.setProgramming_Language(nn);
        
        System.out.println("Ngon ngu:" + coder.getProgramming_Language());
        System.out.println("Ten: "+ coder.getName());
        System.out.println("Tuoi: "+ coder.getAge());
        System.out.println("SDT: "+ coder.getPhone());
        
        //thực hành về toán tử instanceof
        System.out.println(coder1 instanceof Person);
        System.out.println(ps1 instanceof Coder);
    }
}
