import java.util.*;

class atm {


    double bankBalance = 0.0;

    void clientBankBal(double balance) {

        this.bankBalance = bankBalance+balance;
    }

    void currentBalance(){
        System.out.println("Your balance is "+bankBalance);
    }
  

}

class atmMachine extends atm {

    Scanner sc = new Scanner(System.in);

    void withdrawAmount() {

        System.out.println("Enter the amount for withdraw");
        int amt = sc.nextInt();
        if(amt>=100){

            if(amt>bankBalance){
                System.out.println("Insufficient Balance");

            }
            else{
                bankBalance = bankBalance-amt;
                System.out.println("Withdraw Successfully..");
            }

        }
        else{
            System.out.println("Enter the amount above 100 Rs.");
        }

    }

    void depositeAmount() {

        System.out.println("Enter the amount for deposite");
        double depAmt = sc.nextInt();

        if(depAmt<100){
            System.out.println("Enter upto 100 Rupees");
            depositeAmount();
        }
        else{

            System.out.println("Amount Deposite Successfully....");
            clientBankBal(depAmt);    
        }

    }

    void checkBankBalance() {
        currentBalance();
    }

}

class Main {

    public static void main(String []args){

        Scanner sc = new Scanner(System.in);
        atmMachine am = new atmMachine();

        char ch;
        do{
            System.out.println("Enter the following options:-");
            System.out.println("1 :- Withdraw Amount");
            System.out.println("2 :- Deposite Amount");
            System.out.println("3 :- Check Balance");
            System.out.println();
            System.out.println("Enter a Option");

            int num = sc.nextInt();

            switch (num) {
                case 1: 
                    System.out.println("Withdraw Amount");
                    am.withdrawAmount();
                break;
                case 2:
                    am.depositeAmount();
                
                break;
        
                case 3: 
                    System.out.println("Check Balance");
                    am.checkBankBalance();
                break;
                default:
                    System.out.println("Please Enter Valid Option");
                break;
             
            }
            System.out.println();
            System.out.println("Do you want to continue transaction");
            ch = sc.next().charAt(0);
        
        }while(ch == 'Y' || ch == 'y');

    }
}