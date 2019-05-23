/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

// Modifications done by Dabura78
package pruebagitnetbeans;

/**
 *
 * @author j_a_m
 */
public class Prueba2 extends Prueba{
    private int id;
    private int tel;
    private int salary;

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the tel
     */
    public int getTel() {
        return tel;
    }

    /**
     * @param tel the tel to set
     */
    public void setTel(int tel) {
        this.tel = tel;
    }

    /**
     * @return the salary
     */
    public int getSalary() {
        return salary;
    }

    /**
     * @param salary the salary to set
     */
    public void setSalary(int salary) {
        this.salary = salary;
    }
    
    public Prueba2(String firstName, String lastName, int id, int tel, int salary){
        super(firstName, lastName);
        this.id = id;
        this.tel = tel;
        this.salary = salary;   
    }
    
    public Prueba2(int id, int tel, int salary){
        super();
        this.id = id;
        this.tel = tel;
        this.salary = salary;   
    } 
    
    
    @Override
    public String toString() {
        return "First Name: "+this.getFirstName() + "\nLast Name: " + this.getLastName() + "\nID: " + this.id+"\ntel: "+this.tel+"\nSalary: "+this.salary;
    }
    
}
