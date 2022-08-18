import java.util.*;  
class Task3
{  
    public static void main(String args[] )  
    { 
        int balance = 100000, withdraw, deposit, TranferAmount;  
        Scanner sc = new Scanner(System.in);  
        System.out.println("Enter the Account User Id: ");
        String AccountHolder = sc.nextLine();
        String TranferAccount;
        int pin= 7860;
        System.out.println("Enter your pin number: ");
        int pin_No=sc.nextInt();
        if(pin_No!=7860)
        {
            System.out.println("Wrong pin Number!! ");
            System.exit(0);
        }
        if(pin_No==7860)
        { 
            while(true)  
            {  
                System.out.println("------------------------------------------------");
                System.out.println("*** WELCOME ****");  
                System.out.println("Choose 1 for Withdraw");  
                System.out.println("Choose 2 for Deposit");  
                System.out.println("Choose 3 for Check Balance");  
                System.out.println("Choose 4 to transfer money");
                System.out.println("Choose 5 to Quit");
                System.out.print("Choose the operation you want to perform: "); 
                int choice = sc.nextInt();  
                System.out.println("------------------------------------------------");
                switch(choice)  
                {  
                    case 1:  
                        System.out.println("Account Holder Name: "+AccountHolder);
                        System.out.print("Enter money to be withdrawn: ");  
                        withdraw = sc.nextInt();  
                        if(balance >= withdraw)  
                        {  
                            balance = balance - withdraw;  
                            System.out.println("Please collect your money");
                            System.out.println("Your Balance is " +balance);  
                        }   
                        else  
                        {  
                            System.out.println("Insufficient Balance");  
                        }  
                        System.out.println("");  
                        break;  
   
                    case 2:  
                        System.out.println("Account Holder Name: "+AccountHolder);
                        System.out.print("Enter money to be deposited: ");  
                        deposit = sc.nextInt();  
                        balance = balance + deposit;  
                        System.out.println("Your Money has been successfully deposited");  
                        System.out.println("Your Balance is " +balance);
                        System.out.println("");  

                        break;  
   
                    case 3: 
                        System.out.println("Account Holder Name: "+AccountHolder);
                        System.out.println("Balance : "+balance);  
                        System.out.println("");  
                        break;
                    
                    case 4:
                        System.out.println("Account Holder Name: "+AccountHolder);
                        System.out.print("Enter the amount to transfer: ");
                        TranferAmount = sc.nextInt();
                        balance-=TranferAmount;
                        System.out.println("Transfer is done Successfully ");
                        System.out.println("Available balance: "+balance);
                    
   
                    case 5: