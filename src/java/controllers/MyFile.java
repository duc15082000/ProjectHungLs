/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class MyFile {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        System.out.println("Nhap ten File de tao moi: ");
        String fileName = sc.nextLine();

        File file1 = taoFile(fileName);

        String message = docFile(file1);
        System.out.println(message);

        LinkedList<String> list = new LinkedList();

        ArrayList<String> alist = new ArrayList();
//        if(checkFile(file1)){
//            vietFile(file1, mgs);
//        }else{
//            System.out.println("File đã tồn tại, thêm nội dung vào cuối File");
//            vietFile(file1, mgs);
//        }

    }

    public static String docFile(File file) {
        StringBuilder msg = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(file))) { // Sử dụng BufferedReader
            String line;
            while ((line = br.readLine()) != null) {
                msg.append(line).append("\n"); // Thêm từng dòng vào StringBuilder
            }
        } catch (Exception e) {
            System.out.println("Loi doc File: " + e.getMessage());
        }
        return msg.toString(); // Trả về nội dung file dưới dạng chuỗi
    }

    public static void vietFile(File file, String message) {
        try {
            FileWriter fw = new FileWriter(file, true);
            fw.write(message + "\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Loi ghi file");
        }
    }

    public static String inMenu() {
        String a = "Hello";
        try {

        } catch (Exception e) {
        }
        return a;
    }

    public static File taoFile(String fileName) throws IOException {
        File myFile = new File(fileName + ".txt");
        if (checkFile(myFile)) {
            System.out.println("File da duoc tao moi");
            return myFile;
        } else {
            System.out.println("File da ton tai");
            return myFile;
        }
    }

    public static boolean checkFile(File myFile) throws IOException {
        if (myFile.createNewFile()) {
            return true;
        } else {
            return false;
        }
    }

}
