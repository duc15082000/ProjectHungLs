/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers;

/**
 *
 * @author Admin
 */
public class String_Work {
    public static void main(String[] args) {
        String c = "Giang,Hang,Duoc,Duc";
        String[] a = c.split(",");
        for (String string : a) {
            System.out.println(string);
        }
        
    }
}
