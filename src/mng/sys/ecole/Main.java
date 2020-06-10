/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mng.sys.ecole;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Rakshith on 4/3/2017.
 */
public class Main {
    public static void main(String[] args) {
        Teacher Ilham = new Teacher(1,"Ilham",500);
        Teacher Nora = new Teacher(2,"Nora",700);
        Teacher Badr = new Teacher(3,"Badr",600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(Ilham);
        teacherList.add(Nora);
        teacherList.add(Badr);


        Student Anouar = new Student(1,"Anouar",4);
        Student Rita = new Student(2,"Rita",12);
        Student Rabbie = new Student(3,"Rabbie",5);
        List<Student> studentList = new ArrayList<>();

        studentList.add(Anouar);
        studentList.add(Rabbie);
        studentList.add(Rita);




        School WIFAK = new School(teacherList,studentList);

        Teacher Marouan = new Teacher(6,"Marouan", 900);

        WIFAK.addTeacher(Marouan);


        Anouar.payFees(5000);
        Rita.payFees(6000);
        System.out.println("WIFAK has earned $"+ WIFAK.getTotalMoneyEarned());

        System.out.println("------Making SCHOOL PAY SALARY----");
        Ilham.receiveSalary(Ilham.getSalary());
        System.out.println("WIFAK has spent for salary to " + Ilham.getName()
        +" and now has $" + WIFAK.getTotalMoneyEarned());

        Badr.receiveSalary(Badr.getSalary());
        System.out.println("WIFAK has spent for salary to " + Badr.getName()
                +" and now has $" + WIFAK.getTotalMoneyEarned());


        System.out.println(Rita);

        Nora.receiveSalary(Nora.getSalary());

        System.out.println(Nora);


    }
}
