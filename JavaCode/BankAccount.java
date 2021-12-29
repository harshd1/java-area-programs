import java.util.Scanner;
class Account
   {
      long account_no;              
      String name;             
      int amount=10000;    

      void insert()
      {
          Scanner ob = new Scanner(System.in);
          System.out.println("Enter your account number:");
          account_no=ob.nextInt();
          System.out.println("Enter your name:");
          name=ob.next();

      }

      void display()
      {
        System.out.println("Account Number:"+account_no);
        System.out.println("Name:"+name);
        System.out.println("Total Amount:"+amount);
 
 

      }
      
      void deposit (int depositAmount)
      {
          if (depositAmount > 0)
          {
          
              this.amount += depositAmount;
          }
        System.out.println("Amount after deposition:"+amount);
      }
    
      void withdraw ( int balance )
      {
         if ( amount >= balance )
        { 
   	    this.amount -= balance;
        }   
         System.out.println("Amount after widthrawl:"+amount);
      }

      void check_balance()
      {
          System.out.println("Amount after transactions:"+amount);
      }

   }
   public class BankAccount
   {
       public static void main ( String args[] )
       {
           Account A1 =new Account();
           A1.insert();
           A1.display();
           A1.deposit(2000);
           A1.withdraw(1000);
           A1.check_balance();
       }
   }