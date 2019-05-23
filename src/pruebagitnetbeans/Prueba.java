/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagitnetbeans;

/**
 *
 * @author j_a_m
 */
public class Prueba {

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    private String firstName;
    private String lastName;
    
    public Prueba(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public Prueba() {
        this.firstName = "Noname";
        this.lastName = "Noname";
    }
    
    @Override
    public String toString() {
        return "First Name: "+this.firstName +"\nLast Name: "+this.lastName;
    }
    
}
