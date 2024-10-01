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

/**
 *
 * @author Admin
 */
public class Cau_truc_du_lieu_giai_thuat {

    public static void main(String[] args) {
        //ArrayList gồm các phần tử kiểu String
        ArrayList<String> alist = new ArrayList();
        alist.add("Quoc Dung");
        alist.add("Thanh Hang");
        
        alist.remove(0);
        //System.out.println(alist.get(0));
        
        LinkedList<String> llist = new LinkedList();
        llist.add("Quoc Dung");
        llist.add("Thanh Hang");
        llist.addFirst("Minh");
        llist.addLast("AnhMinh");
        
        
        //Stack
        Stack<String> slist = new Stack();
        slist.push("Quoc Dung");
        slist.push("Thanh Hang");
        
        String a = slist.pop();
        //System.out.println(a);
        
        //Queue
        Queue<String> qlist = new LinkedList();
        qlist.add("Quoc Dung");
        qlist.add("Thanh Hang");
        //ystem.out.println(qlist.poll());
        
        //HashMap
        HashMap<Integer, String> hlist = new HashMap<>();
        hlist.put(1, "Quoc Dung");
        hlist.put(2, "Thanh Hang");
        hlist.put(3, "Anh Minh");
        //System.out.println(hlist.get(2));
        
        //HashSet
        HashSet<String> setlist = new HashSet<>();
        setlist.add("Quoc Dung");
        setlist.add("Thanh Hang");
        System.out.println(setlist);
        
        //add(): Thêm phần tử vào bộ sưu tập
        //remove(): Xóa phần tử trong bộ st
        //contains(): Kiểm tra xem bộ sưu tập có chứa 1 phần tử cụ thể hay không
        //size(): Số lượng phần tử trong bst
        //clear(): xóa tất cả ptu trong bst
        //isEmpty(): kiểm tra xem bst có rỗng không 
        
        
    }
}
