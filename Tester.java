/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bt
 */
import java.io.*; 
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
    /*
    the function find the factorial value of the given number in the parameter
    @param n is the parameter of the number entered to find the given factorial value
    */
    
    public void fact(int n){
       int result=1;
       for(int i=n;n>0;n--){
           result=result *i;
       }
       
       System.out.println("The factorial value is : "+result);
    }
    
    /*
    the function max() finds the maximum value in a given array of numbers
    @param numbers is an array of int
    */
    public void max(int [] numbers){
        int max = numbers[0];
        for(int i=0;i<numbers.length;i++){
            if(max<numbers[i]){
                max=numbers[i];
            }
        }
        System.out.println("Maximum value is: "+ max);
    }
    
    
    public static void main(String[] args){
        Tester tester1 =new Tester();
        if(args[0].equals("table")){
            tester1.table(Integer.parseInt(args[1]));
        }
        
        else if(args[0].equals("fact")){
            tester1.fact(Integer.parseInt(args[1]));
        }
        else if(args[0].equals("max")){
            int []arrayInt=new int[args.length-1];
                for(int i=1;i<args.length;i++){
                    arrayInt[i-1] = Integer.parseInt(args[i]);
                }
                tester1.max(arrayInt);
        }
 
        
    }
    
}
