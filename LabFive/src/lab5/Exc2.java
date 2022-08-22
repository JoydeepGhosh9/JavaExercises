package lab5;

import java.util.*;

class mexception extends Exception{
    
    @Override
    public String toString(){
        
        return "First name and last name should not be empty";
    }
}

public class Exc2 {
    
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        String fname = sc.nextLine();
        String lname = sc.nextLine();
        
        try{
            if(fname.equals("") && lname.equals("")){
                throw new mexception();
            }
            else
                System.err.println("Validated");
        }
        catch(mexception e){
            System.err.println(e);
        }
    }
}
