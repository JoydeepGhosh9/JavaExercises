package labFour;

import java.util.Random;
import java.util.Scanner;

class Person{
    String name;
    float age;
}

class Account extends Person{
    private long accno;
    double balance;
    
    
    public void accholder(String nam, float ag){
        name = nam;
        age = ag;
    }
   
    public double deposit(double dep){
        balance = balance + dep;
        return balance;
        }
    
    public double withdraw(double widraw){
        
        balance = balance - widraw;
        return balance;
    }
    
    public double getBalance(){
        return balance;
    }
    
    public void setaccno(long acc){
        accno = acc;
    
    }
    public long getaccno(){
        return accno;
    }
    
    
}

class SavingsAccount extends Account {
    
    final double minBalance = 500;
    
    @Override
    public double withdraw(double widraw){
        
        if(balance>minBalance){
            balance = balance - widraw;
        }
        return balance;
        
    }

class CurrentAccount extends Account{
    
    double overdraftLimit = 10000;
    @Override
    public double withdraw(double widraw){
        if(widraw>1000){
            return -1;
        }
        else
            return 1;
        
    }
}
    
}

public class Exc1 {
    static public String random(){
        Random rand = new Random();
        String accnumber = "";
        
        for( int i = 0; i<11; i++){
            accnumber = accnumber + rand.nextInt(10);
        }
        return accnumber;
        }
    
    public static void main(String agrs[])
        
    {
        double bal2 = 0;
        Scanner sc = new Scanner(System.in);
        
        Account smith = new SavingsAccount();
        smith.accholder("smith", 40);
        smith.setaccno(Long.parseLong(random()));
        smith.balance = 2000;
        double bal = smith.deposit(2000);
//        System.out.println("Your account number is " + smith.getaccno());
//        System.out.println("You must deposut a sum greter than 500 to start your account /n Enter the money you want to deposit");
//        smith.deposit(sc.nextDouble());

        System.out.println("your updated balance is " + bal);
        
        Account kathy = new SavingsAccount();
        kathy.accholder("Kathy", 20);
        kathy.setaccno(Long.parseLong(random()));
        kathy.balance = 3000;
        
        bal2 = kathy.withdraw(2000);
        System.out.println("your updated balance is " + bal2);
}
}
