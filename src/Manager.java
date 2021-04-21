package OOCDBankManagementSystem;
import java.util.Scanner;
public class Manager {
    String Name;
    int age;
    double salary;
    Scanner sc = new Scanner(System.in);

    public void inputManagerInfo(double balanceOfAllAccountHolder){
        System.out.println("Manager Name: ");
        Name = sc.nextLine();
        System.out.println("Age: ");
        age = sc.nextByte();
        salary = 8000+ (balanceOfAllAccountHolder*.07);
    }

    public void display(){
        System.out.println("Manager Name: "+Name);
        System.out.println("Age: "+age);
        System.out.println("Salary: "+salary);
    }
}
