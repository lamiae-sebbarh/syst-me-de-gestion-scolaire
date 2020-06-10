/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mng.sys.ecole;

public class Teacher {

    private int id;
    private String name;
    private int salary;
    private int salaryEarned;

    
    public Teacher(int id, String name, int salary){
        this.id=id;
        this.name=name;
        this.salary=salary;
        this.salaryEarned=0;
    }

   
    public int getId(){
        return id;
    }

  
    public String getName(){
        return name;
    }


   
    public int getSalary(){
        return  salary;
    }

   
    public void setSalary(int salary){
        this.salary=salary;
    }

    
    public void receiveSalary(int salary){
        salaryEarned+=salary;
        School.updateTotalMoneySpent(salary);
    }


    @Override
    public String toString() {
        return "Name of the Teacher: " + name
                +" Total salary earned so far $"
                + salaryEarned;
    }
}
