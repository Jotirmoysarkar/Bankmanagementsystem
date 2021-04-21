package OOCDBankManagementSystem;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AccountHolder ah = new AccountHolder();
        ah.inputAllInformation();
        ah.setDeposit();
        ah.setInterest();
        double currentBalanceJony = ah.getCurrentBalance();

        AccountHolder islam = new AccountHolder();
        islam.inputAllInformation();
        islam.setWithdraw();
        islam.inputLoan(5000.0);
        double currentBalanceIslam = islam.getCurrentBalance();

        double balanceOfAllAccountHolder = currentBalanceJony+currentBalanceIslam;

        Manager m = new Manager();
        m.inputManagerInfo(balanceOfAllAccountHolder);
        m.display();
    }
}
