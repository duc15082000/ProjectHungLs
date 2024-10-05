/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class String_J2 {
    public static void main(String[] args) {
//        String a = "Quoc Dung";
//        
//        String b = new String("Hello");
        
        char[] c = {'V','u','D','u','c'};
        String d = new String(c);
        
        //Các phương thức làm việc với String
        d.length();//trả về độ dài của chuỗi(int)
        d.charAt(0);//trả về ký tự tại vị trí index
        String e = d.substring(1);//trả về chuỗi con
        //số thứ nhất sẽ là beginIndex - sth sẽ là endIndex
        //System.out.println(e);
        //Lưu ý: subString sẽ từ beginIndex -> endIndex - 1
        //concat(): nối chuỗi, cách dùng như (+): chuỗi không biến thiên
        //StringBuilder: sử dụng để nối chuỗi
        //String f = d+e;
        String f = d.concat(e);
        
        String thu_nhat = "thich Hoai";
        String thu_hai = "Dung";
        
        String result = thu_hai.concat(thu_nhat);
        //System.out.println(result);
        
        d.indexOf(thu_hai);//Tìm vị trí đầu tiên của chuỗi con
        d.lastIndexOf(thu_hai);//Tìm vị trí cuối cùng của chuỗi con
        
        d.equals(thu_hai);//so sánh hai chuỗi
        d.equalsIgnoreCase(thu_hai);//so sánh hai chuỗi không viết hoa
        String a = "Vuduc";
        String b = "vuduc";
//        System.out.println(a.equals(b));
//        System.out.println(a.equalsIgnoreCase(b));
        
        d.compareTo(a);//so sánh chuỗi theo thứ tự từ điển
        
        d.trim();//bỏ toàn bộ khoảng trắng
        d.toLowerCase();//sử dụng để biến chuỗi thành chữ thường
        d.toUpperCase();//sử dụng đẻ biến chuỗi thành chữ in hoa
        
        d.replace('A', 'b');//thay thế ký tự (char old, char new)
        
        d.startsWith(a);//Chuỗi có bắt đầu bằng chuỗi con không - boolean
        d.endsWith(a);//Chuỗi có kết thúc bằng chuỗi con không
        //Split: Tách chuỗi thành mảng dựa trên biểu thức chính quy
        String chuoi = "Dung-hai;Huong,Huy";
        String[] mang = chuoi.split("\\W");
        for (String str : mang) {
            System.out.println(str);
        }
        
        //StringBuilder(hoặc StringBuffer): 
        //đây là các lớp cho phép tạo các chuỗi có thể thay đổi được
        //các chuỗi có thể thay đổi được -> chuỗi biến thiên
        //Lưu ý: Đối với Concat(+): nó sẽ tạo ra nhiều String trong quá
        //trình nối chuỗi -> tạo ra bấy nhiêu String. có thể lấy ra chuỗi 
        //khi chưa nối hết
        //StringBuilder: thì chỉ có 1 bản gốc, và bản gốc đó sẽ thay
        //đổi trong quá trình nối chuỗi.
        
        //{a,b,c,d}
        //ĐỐi với concat abcd -> String a(1 bé) = "a", String a( 2 bé) = "ab", String a (3 bé)= "abc"...
        //đối với StringBuilder: String sb = "a" -> sb = "ab" -> sb ="abc"
        
        StringBuilder sb = new StringBuilder();
        
        sb.append(b).append(c).append(d);
        System.out.println(sb);
        
        String result1 = sb.toString();
        System.out.println(result1);
        
        d.isEmpty();//Ktra xem chuỗi có rỗng hay không - boolean
        String.valueOf(sb);//Chuyển đổi giá trị bất kỳ thành chuỗi
        d.contains(sb);//Tìm xem chuỗi có giá trị này không
        
        d = "Vuduc";
        boolean t = d.contains("ui");
        System.out.println(t);
        
        //Tạo lớp Student có các thuộc tính:int id,Str name,int age,Str major
        //->id phải là duy nhất
        //private static int count; -> biến tĩnh
        //Trong Constructor khi khởi tạo id = count++
        //Tạo lớp StudentManager bao gồm các Student
        //Tạo Menu Switch/Case gồm các tác vụ:
        //1.Xem danh sách học sinh
        //2.Thêm học sinh
        //3.Xóa học sinh
        //4.Sửa học sinh -> ng dùng nhập id: rồi sửa thuộc tính k sửa id
        //5.Tìm theo tên
        //6.Thoát
    }
    
    public static StringBuilder noiChuoi(String b, String c, String d){
        StringBuilder sb = new StringBuilder();
        
        sb.append(b).append(c).append(d);
        System.out.println(sb);
        
        String result1 = sb.toString();
        System.out.println(result1);
        
        return sb;
    }
}
