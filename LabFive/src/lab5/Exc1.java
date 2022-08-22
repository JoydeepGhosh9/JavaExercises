package lab5;

import java.util.Scanner;

class myexception extends Exception{
    
    public String toString(){
        return "Your age should be above 15";
    }
}


public class Exc1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int num = sc.nextInt();
        
        try{
            if(num>15)
                System.err.println("Validated");
            else
                throw new myexception();
            
        }
        catch(myexception e){
            System.err.println(e);
        } 
}
}


