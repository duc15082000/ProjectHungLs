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
import java.util.Stack;
import java.util.Calendar;
import models.Coder;

/**
 *
 * @author Admin
 */
public class Cau_truc_du_lieu {

    public static void main(String[] args) {
        //ArrayList đây là một cấu trúc dữ liệu lưu trữ các phần tử có cùng kiểu dữ liệu
        //và có kích thước cố định. Các pt cũng đánh số theo index (0).
        ArrayList<Coder> alist = new ArrayList();
        Coder coder1 = new Coder("Java", "Duc", 32, "0384927384");
        Coder coder2 = new Coder("C", "Tien", 22, "083482783");
        alist.add(coder1);
        alist.add(coder2);
        //System.out.println(alist.get(0));

        //LinkedList đây là một danh sách liên kế, trong đó mỗi phần tử chứa một liên kết
        //đến phần tử tiếp theo
        //head-pt1-pt2-pt3-tail
        LinkedList<String> llist = new LinkedList();
        llist.addFirst("");
        llist.addLast("");

        //Stack: là cấu trúc dữ liệu hoạt động theo nguyên tắc LIFO(last in - first out)
        //push() thêm phần tử - pop() lấy phần tử
        Stack<String> slist = new Stack();
        slist.push("Duc Tien");
        slist.push("Thu Hoai");
        String s = slist.pop();
        //System.out.println(s);

        //Queue cấu trúc dữ liệu hoạt động theo nguyên tắc FIFO(First in - First out)
        //Queue thường sẽ được triển khai bằng LinkedList
        Queue<String> qlist = new LinkedList();
        qlist.add("Duc Tien");
        qlist.poll();

        //HashMap một cấu trúc dữ liệu lưu trữ theo dạng key-value
        //key thì là duy nhất - value thì không
        HashMap<Integer, String> hlist = new HashMap<>();
        hlist.put(1, "Duc Tien");
        hlist.put(2, "Thu Hoai");
        hlist.put(3, "Vu Duc");
        System.out.println(hlist.get(2));

        //HashSet là cấu trúc dữ liệu chỉ lưu trữ giá trị duy nhất - k được trùng lặp
        HashSet<String> setlist = new HashSet<>();
        setlist.add("Đức Tiến");
        setlist.add("Thu Hoài");
        setlist.add("Đức Tiến");

        System.out.println(setlist);

        //Collection Framework
        //Thư viện cung cấp cấu trúc dữ liệu và thuật toán được tích hợp sẵn
        //nhằm mục đích hỗ trợ ltv dễ dàng xử lí dữ liệu hơn 
        //Một số phương thức phổ biển: 
        //add(): Thêm phần tử 
        //remove(): Xóa phần tử 
        //contains(): Kiểm tra xem bộ sưu tập có chứa phần tử cụ thể hay không - Boolean
        //size(): Trả về số lượng phần tử trong bộ sưu tập
        //clear(): Xóa toàn bộ phần tử trong bộ sưu tập
        //isEmpty(): Kiểm tra xem bộ sưu tập có rỗng hay không - boolean
        Calendar cal = Calendar.getInstance();

        int month = cal.get(Calendar.MONTH) + 1;

        //System.out.println(month);
        String str1 = "hello";
        String str2 = "ello";
        String str3 = "holle";
        int result = str1.indexOf(str2);
        
        String c = str1.concat(str2).concat(str3);
        System.out.println(c);

    }
}
