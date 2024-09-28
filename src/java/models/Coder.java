/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class Coder extends Person{
    //quan hệ Has - A
    //object Student : name - age - sdt
    
    //object Class : 
    private String Programming_Language;
    
    
    //private ArrayList<Person> listStudent;//Aggregation: một đối tượng
    //sẽ chứa 1 hoặc nhiều đối tượng khác 
    // Khi đối tuojwgn chứa bị hủy, thì đối tượng nằm trong không bị làm sao
    // -> Aggregation không phải là 1 quan hệ chặt chẽ 
    
    //private Person student;//Composition: một đối tượng chứa
    // 1 đối tượng khác 
    //Khi đối tương chứa bị hủy, thì đối tượng nằm trong như nó
    //như 1 thuộc tính cũng sẽ bị hủy theo -> là 1 quan hệ rất chặt chẽ

    public Coder() {
    }

    public Coder(String Programming_Language, String name, int age, String phone) {
        super(name, age, phone);
        this.Programming_Language = Programming_Language;
    }

    public String getProgramming_Language() {
        return Programming_Language;
    }

    public void setProgramming_Language(String Programming_Language) {
        this.Programming_Language = Programming_Language;
    }
    
    
}
