/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebagitnetbeans;

import java.util.Scanner;

/**
 *
 * @author j_a_m
 */
public class PruebaGitNetBeans {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Please enter first name: ");
        String firstName = input.nextLine();
        
        System.out.print("Please enter last name: ");
        String lastName = input.nextLine();
        
        
        Prueba prueba1 = new Prueba(firstName,lastName);
        
        System.out.println(prueba1);
                
    }
    
}
