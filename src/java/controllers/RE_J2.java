/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Admin
 */
public class RE_J2 {
    //Regular Exspression - biểu thức chính quy 
    //Làm việc với String
    //Date Time trong Java
    public static void main(String[] args) {
        //RE
        //Được sử dụng để tìm kiếm - thao tác - kiểm tra chuỗi văn bản
        //java.util.regex
        //Matcher và Pattern
        //.: Bất kỳ kí tự nào
        //*: 0 hoặc nhiều lần lặp
        //+: 1 hoặc nhiều lần lặp
        //?: 0 hoặc 1 lần lặp
        //^: Bắt đầu một RE
        //$: Kết thúc một RE
        // \d: ký tự số(0-9)
        // \D: không phải ký tự số
        // \w: ký tự số hoặc chữ
        // \W: không phải ký tự chữ hay số
        // \s: khoảng trắng
        // \S: không phải khoảng trắng
        // [...]: bất kì ký tự nào nằm trong ngoặc vuông
        // [^...]: không phải các ký tự trong ngoặc vuông
        // (): nhóm
        // `: ` 
        
        //String chuan_email = "^[A-Za-z0-9-.+_]+@[A-Za-z0-9.-]+$";
        //^ mở đầu RE
        //A-Za-z0-9-.+_ : cho người dùng sử dụng dấu cộng
        //+ thứ 2: 1 hoặc nhiều lần lặp [duc123-4_567]@[gmail.edu.com]
        //$: kết thúc RE
        
        //String email = "^\\w\\-\\.\\+\\_+@\\w\\.\\-+$";
        
        String emailRegex = "^[A-Za-z0-9-.+_]+@(gmail.com)$";
        
        String email = "duca2k52ls@gmail.com";
        
        //Tạo đối tượng Pattern từ biểu thức chính quy
        
        Pattern pt = Pattern.compile(emailRegex);
        
        //Khớp biểu thức chính quy với chuỗi email
        
        Matcher mt = pt.matcher(email);
        
        //kiểm tra xem có khớp hay không 
        if(mt.matches()){
            System.out.println("Email hợp lệ");
        }else{
            System.out.println("Email không hợp lệ");
        }
        
        
    }
}
