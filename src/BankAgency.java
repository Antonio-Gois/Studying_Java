import java.util.ArrayList;
import java.util.Scanner;

public class BankAgency {
    static Scanner input = new Scanner(System.in);
    static ArrayList<BankAccount> numberAccounts;


    public static void main(String[] args){
        numberAccounts = new ArrayList<BankAccount>();
        operationsMenu();

    }
    public static void newAccount(){
        System.out.println("ENTER A PERSON NAME: ");
        System.out.println("");
        String personName = input.next();

        System.out.println("");
        System.out.println("ENTER A PERSON CPF: ");
        String personCpf = input.next();
        System.out.println("");

        System.out.println("");
        System.out.println("ENTER A PERSON EMAIL: ");
        String personEmail = input.next();
        System.out.println("");

        System.out.println("");
        System.out.println("ENTER THE PERSON'S YEAR OF BIRTH: ");
        int personYearBirth = input.nextInt();
        System.out.println("");

        BankAccount bankAccount = new BankAccount(personName, personCpf, personEmail, personYearBirth);
    }
    public static void operationsMenu(){
        System.out.println("####################################");
        System.out.println("--- WELCOME TO PAYDAY AGENCY ---");
        System.out.println("####################################");
        System.out.println("");
        System.out.println("WHAT DO YOU WANT TO DO?");
        System.out.println("");
        System.out.println("| 1 - CREATE ACCOUNT |");
        System.out.println("");
        System.out.println("| 2 - DEPOSIT |");
        System.out.println("");
        System.out.println("| 3 - WITHDRAW |");
        System.out.println("");
        System.out.println("| 4 - TRANSFER |");
        System.out.println("");
        System.out.println("| 5 - GO OUT |");

        System.out.println("");
        int operation = input.nextInt();

        switch (operation){
            case 1:
                newAccount();
                break;

            case 5:
                System.out.println("UNTIL LATER!");
                System.exit(0);
                break;

            default:
                System.out.println("Invalid Option!");
                System.out.println("Enter an Integer!");
                operationsMenu();
                break;
        }
    }
}