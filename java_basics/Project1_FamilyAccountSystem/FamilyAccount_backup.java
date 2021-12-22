
import java.util.Scanner;
import java.io.*;
public class FamilyAccount {

    private static Scanner scanner = new Scanner(System.in);
    public int base_Money = 10000;
    public String details_menu = "income/outcome" + '\t' + "Account Money" + '\t' + "Money" + '\t' + "statement"+'\n';

    //main function
    public static void main(String[] args) {
        // base money
        FamilyAccount familyAccount = new FamilyAccount();
        while(true){
            familyAccount.printMenu();
            char choice = Utility.readMenuSelection();
            if (choice=='1'){
                familyAccount.detailsInAndOut();
            }
            else if (choice == '2') {
                familyAccount.registeredIncome();
            }
            else if (choice == '3') {
                familyAccount.registeredExpenditure();
            }
            else{
                familyAccount.quitMenu();
            }
        }





    }
    //print the menu
    public  void printMenu(){
        System.out.println("-------------------------------------------------------------------------- ");
        System.out.println("---------Family income and expenditure accounting software---------------- ");
        System.out.println("            1.Income and expenditure details ");
        System.out.println("            2.Registered income ");
        System.out.println("            3.Registered expenditure ");
        System.out.println("            4.Quit ");
        System.out.print("---------Please choose your choice(1-4):   ");
        // System.out.println("-------------------------------------------------------------------------- ");

    }
    // Income and expenditure details
    public void detailsInAndOut(){
        // String income_detail = registeredIncome();
        // String outcome_detail = registeredOutcome();
        System.out.println(details_menu);
        // System.out.println(income_detail);
        // System.out.println(outcome_detail);

    }
    // Registered income
    public  void registeredIncome(){
        System.out.println("Amount of income this time:   ");
        int income = Utility.readNumber();
        System.out.println("This income statement:   ");
        String statement = Utility.readString();
        base_Money += income;
        String string_line = "income"+"\t\t\t"+base_Money+ '\t'+income+ '\t'+statement+'\n';
        details_menu = details_menu+string_line;
        System.out.println("***************** ");
        System.out.println("Record success!");
        System.out.println("***************** ");
    }
    
    // Registered expenditure
    public  void registeredExpenditure() {
        System.out.println("Amount of outcome this time:   ");
        int outcome = Utility.readNumber();
        System.out.println("This outcome statement:   ");
        String statement = Utility.readString();
        base_Money -= outcome;
        String string_line = "outcome" + "\t\t\t" + base_Money + '\t' + outcome + '\t' + statement+'\n';
        details_menu = details_menu + string_line;
        System.out.println("***************** ");
        System.out.println("Record success!");
        System.out.println("***************** ");

    }

    // quit
    public void quitMenu() {
        System.out.println("Determine whether to exit(Y/N):   ");
        char c = Utility.readConfirmSelection();
        if (c=='Y'){
            System.exit(0);
        }
        else{
            printMenu();
        }
    }



}
