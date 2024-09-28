/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package models;

/**
 *
 * @author Admin
 */
public class Person {

    //access modifiers: Từ khóa chỉ mức độ truy cập của một class, phương thức, biến
    //public: không bị giới hạn truy cập, truy cập từ bất cứ đâu
    //private: chỉ được sử dụng trong class chứa biến, chứa phương thức đó
    //protected: chỉ được sử dụng trong package hoặc class con của nó
    //default: chỉ được sử dụng trong package
    //OOP có 4 thuộc tính: 
    //kế thừa
    //đóng gói
    //đa hình
    //trừu tượng
    //non-access modifiers: 
    
    private String name;
    private int age;
    private String phone;

    public Person() {
    }

    public Person(String name, int age, String phone) {
        this.name = name;
        this.age = age;
        this.phone = phone;
    }

    public String getName() {//dùng để gọi dữ liệu thuộc tính
        return name;
    }

    public void setName(String name) {//thêm mới - sửa đổi dữ liệu thuộc tính
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 18) {
            System.out.println("Nhap tuoi tren 18");
        } else {
            this.age = age;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

}
