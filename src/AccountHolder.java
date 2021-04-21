package OOCDBankManagementSystem;
import java.util.Scanner;
public class AccountHolder {
    private String accountHolderName;
    private double currentBalance;
    private double deposit=0.0;
    private double withdraw;
    final double interest = .1;
    private double loan;
    Scanner sc = new Scanner(System.in);

    public void inputAllInformation(){
        System.out.println("Account holder's name: ");
        accountHolderName = sc.nextLine();
        System.out.println("Current Balance: ");
        currentBalance = sc.nextDouble();
        withdraw = 0.0;
        loan = 0.0;
    }

    public boolean checkLoan(){
        return currentBalance>500;
    }

    public void inputLoan(double l){
        if(checkLoan()){
            System.out.println("Current Balance: "+currentBalance);
            currentBalance += l;
            System.out.println("Current Balance after taking a loan: "+currentBalance);
        }
        else{
            System.out.println("You are not eligible for taking loan....");
        }
    }

    public void setInterest(){
        currentBalance = currentBalance + (currentBalance*interest);
        System.out.println("Balance after getting interest: "+currentBalance);
    }

    public void setWithdraw(){
        System.out.println("Withdraw amount: ");
        withdraw = sc.nextDouble();
        if(currentBalance>withdraw){
            currentBalance = currentBalance-withdraw;
            System.out.println("You have successfully withdraw "+withdraw+" BDT");
            System.out.println("Current Balance: "+currentBalance);
        }
        else {
            System.out.println("You don't have sufficient balance.......");
        }
    }

    public void setDeposit(){
        System.out.println("deposit Amount: ");
        deposit = sc.nextDouble();
        currentBalance = currentBalance+deposit;
        System.out.println("Current Balance: "+currentBalance);
    }

    public double getCurrentBalance(){
        return currentBalance;
    }
}
