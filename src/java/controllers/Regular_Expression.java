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
public class Regular_Expression {
    public static void main(String[] args) {
        //Tao bieu thuc chinh quy cho email
        String emailRegex = "^[A-Za-z0-9_]+@gmail\\.com$";
        
        //Mail cần kiểm tra
        String email = "duca2k52ls@gmail.com";
        
        //Tạo Parttern từ biểu thức chính quy
        Pattern pt = Pattern.compile(emailRegex);
        
        //Khớp mẫu với chuỗi email
        Matcher mt = pt.matcher(email);
        
        if(mt.matches()){
            System.out.println("Biểu thức hợp lệ");
        }else{
            System.out.println("Biểu thức k hợp lệ");
        }
        
    }
}
