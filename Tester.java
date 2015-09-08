/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bt
 */
public class Tester {
    /*
    The function find the multiplication table of the parameters entrered 
    @ param n is a parameter that the user enters to find its multiplication table
    
    */
    public void table(int n){
        for(int i=1;i<15;i++){
            System.out.println(n +" * " +i+ "=" +n*i);
        }
    }
    
    
    public static void main(String[] args){
        
        Tester tester1 = new Tester();
        tester1.table(4);
        
    }
    
}
