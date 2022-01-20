import java.util.Scanner
public class ATM
{  
public static void main(String args[] )  
    {  
        int balance = 100000, withdraw, deposit;  
          
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("Automated Teller Machine");  
            System.out.println("Press 1 for Withdraw");  
            System.out.println("Press 2 for Deposit");  
            System.out.println("Press 3 for Check Balance");  
            System.out.println("Press 4 for EXIT");  
            System.out.print("Press the operation you want to perform:");  
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
        System.out.print("Enter money to be withdrawn:");  
                      
        withdraw = sc.nextInt();  
                      
        if(balance >= withdraw)  
        {  
            balance = balance - withdraw;  
            System.out.println("Please collect your money");  
        }  
        else  
        {  
            System.out.println("Insufficient Balance");  
        }  
        break;  
   
                case 2:  
                      
        System.out.print("Enter money to be deposited:");  
                      
        deposit = sc.nextInt();  
                      
        balance = balance + deposit;  
        System.out.println("Your Money has been successfully depsited");  
        
        break;  
  case 3:  
        System.out.println("Balance : "+balance);  
        break;  
  case 4:  
        System.exit(0);  
            }  
        }  
    }  
}  
