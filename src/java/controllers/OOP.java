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
    public static void inMenu(){
        System.out.println("Nhap ngon ngu lap trinh:");
        System.out.println("1.Java");
        System.out.println("2.C#");
        System.out.println("3.C");
        System.out.println("4.Python");
    }
    
    public static void chonLanguage(Coder coder){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap lua chon: ");
        int option = sc.nextInt();
        switch (option) {
            case 1:
                coder.setProgramming_Language("Java");
                break;
            case 2:
                coder.setProgramming_Language("C#");
                break;
            case 3:
                coder.setProgramming_Language("C");
                break;
            case 4:
                coder.setProgramming_Language("Python");
                break;
        }
    }
    
    public static void main(String[] args) {   
        Scanner sc = new Scanner(System.in);//Dùng để gọi lớp Scanner
        
        //tên Class + biến = new + Constructor();
        Coder coder = new Coder();//Khởi tạo object Coder, đã truyền vào giá trị mặc định
        
        System.out.println("Nhap ten");
        String name = sc.next();//Để người dùng nhập vào
        
        coder.setName(name);//chỉnh sửa giá trị thành cái ng dùng nhập vào
        
        
        System.out.println("Nhap tuoi");
        int tuoi = sc.nextInt();
        coder.setAge(tuoi);
        while (coder.getAge() == 0) {   
            tuoi = sc.nextInt();
            coder.setAge(tuoi);
        }
        
        System.out.println("Nhap sdt");
        String sdt = sc.next();
        coder.setPhone(sdt);
        
        inMenu();
        chonLanguage(coder);
        coder.inThongTin();
        
        //thực hành về toán tử instanceof
        //System.out.println(coder1 instanceof Person);
        //System.out.println(ps1 instanceof Coder);
        
        //test git
    }
}
