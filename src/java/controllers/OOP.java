 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
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
        Coder coder2 = new Coder();
        Coder coder3 = new Coder();
        System.out.println("Nhap ten");
        String name = sc.next();//Để người dùng nhập vào
        
        coder.setName(name);//chỉnh sửa giá trị thành cái ng dùng nhập vào
        coder2.setName(name);
        
        System.out.println("Nhap tuoi");
        int tuoi = sc.nextInt();
        coder.setAge(tuoi);
        coder2.setAge(tuoi);
        while (coder.getAge() == 0) {   
            tuoi = sc.nextInt();
            coder.setAge(tuoi);
            coder2.setAge(tuoi);
        }
        
        System.out.println("Nhap sdt");
        String sdt = sc.next();
        coder.setPhone(sdt);
        coder2.setPhone(sdt);
        inMenu();
        chonLanguage(coder);
        inMenu();
        chonLanguage(coder2);
        ArrayList<Coder> listcoder = new ArrayList();
        listcoder.add(coder);
        listcoder.add(coder2);
        for (Coder coder1 : listcoder) {
            System.out.println(coder1.toString());
        }
        
        
        //thực hành về toán tử instanceof
        //System.out.println(coder1 instanceof Person);
        //System.out.println(ps1 instanceof Coder);
        
        //test git
        
        //Cau truc du lieu
        //Array: Mảng - chứa các phần tử có cùng kiểu dữ liệu
        //ArrayList: danh sách các phần tử có cùng kiểu dữ liệu và kích thước
        //cố định
        ArrayList<Coder> listCoder = new ArrayList();
        listCoder.add(coder);
        listCoder.add(coder2);
        listCoder.add(coder3);
        
        listCoder.get(0);
        
        //LinkedList: danh sách liên kết - các phần tử có liên kết với nhau
        //head-pt1-pt2-pt3-tail
        LinkedList<Coder> llist = new LinkedList();
        llist.add(coder);
        llist.add(coder2);
        llist.addFirst(coder3);
        llist.addLast(coder);
        llist.get(0);
        
        //Stack: Cấu trúc dữ liệu hoạt động theo nguyên tắc LIFO(last in - first out)
        //bình chứa có đáy chỉ có 1 đầu ra: thêm phần tử vào thì sẽ xuống cuối danh sách
        Stack<Coder> slist = new Stack();
        //Thao tác chính là push()-thêm vào và pop()-lấy ra;
        slist.push(coder);
        slist.pop();
        
        //Queue: cấu trúc dữ liệu hoạt động theo nguyên tắc FIFO(first in - first out)
        //thường sẽ được khởi tạo dựa trên LinkedList
        Queue<Coder> qlist = new LinkedList();
        qlist.add(coder); // thêm vào
        qlist.poll(); // lấy ra
        
        //HashMap: cấu trúc dữ liệu lưu trữ theo dạng key-value
        //key phải là duy nhất - value thì không cần
        HashMap<Integer, Coder> hlist = new HashMap<>();
        //thêm phần tử
        hlist.put(1, coder);
        hlist.put(2, coder2);
        
        //lấy dữ liệu
        //lấy ra value của key = 1
        hlist.get(1);
        
        //HashSet: cấu trúc dữ liệu chỉ lưu trữ các giá trị duy nhất - k cho phép ptu trùng lặp
        HashSet<Coder> setList = new HashSet<>();
        setList.add(coder);
        setList.add(coder2);
        setList.add(coder);
        
        System.out.println(setList);
        
        //Collection FrameWork
        //đây là thư viện cung cấp các phương thức để làm việc với dữ liệu trong bộ sưu tập
        //một số phương thức phổ biến:
        //add(): thêm vào phần tử
        //remove(): xóa phần tử
        //clear(): xóa toàn bộ phần tử trong bộ sưu tập
        //size(): trả về số lượng phần tử trong bst
        //contains(): kiểm tra xem trong bst có chứa 1 phần tử cụ thể không - boolean
        //isEmpty(): kiểm tra xem bộ sưu tập có rỗng hay không
    }
}
