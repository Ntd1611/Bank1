package client;

import bus.*;
import data.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Tester {

    Scanner userInput = new Scanner(System.in);
    Bank bank = new Bank();
    boolean exit;

    private int getInput() {
        int choice = 1;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(userInput.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid selection. Please choose a number");
            }
            if (choice < 0 || choice > 5) {
                System.out.println("Please choose from 1 to 5.");
            }
        } while(choice < 0 || choice > 5);
        return choice;
    }

    private void printMenu() {
        System.out.println("Make your selection");
        System.out.println("1. Create a new account");
        System.out.println("2. Make a deposit");
        System.out.println("3. Make a withdraw");
        System.out.println("4. Show account balance");
        System.out.println("5. Exit");
    }

    private void printHeader() {
        System.out.println("**********************");
        System.out.println("Welcome to Fortis Bank");
        System.out.println("**********************");

    }

    private void performAction(int choice) {
        switch(choice) {
            case 1: // Create an account
                break;
            case 2: // Make a deposit

                break;
            case 3: // Make a withdraw
                break;
            case 4: // Show account balance
                break;
            case 5:
                System.out.println("Thank you for using Fortis Bank");
                System.exit(0);
                break;
            default:
                System.out.println("We have an unknown errors");
        }
    }

    public void runMenu() {
        printHeader();
        while(!exit) {
            printMenu();
            int choice = getInput();
            performAction(choice);
        }
    }

    public static Customer createNewCustomer(Customer customer, Scanner userInput, List<Customer> customers, Cheque cheque, List<Account> accounts) throws  ValidatePhoneNumber, ValidatePostalCode, ValidateEmail, ValidateNumbers, ValidateSIN, ValidateLetters {

        System.out.println("Enter Customer ID: ");
        customer.setId(userInput.nextInt());

        System.out.println("Enter Customer First Name: ");
        customer.setFirstName(userInput.nextLine());

        System.out.println("Enter Customer Last Name: ");
        customer.setLastname(userInput.nextLine());

        System.out.println("Enter Customer SIN number: ");
        customer.setSin(userInput.nextLine());

        System.out.println("Enter Customer Birth Date: ");
        //customer.setBirthDate(userInput.nextInt());

        System.out.println("Enter Customer Poster Code: ");
        customer.setPostalCode(userInput.nextLine());

        System.out.println("Enter Customer Email: ");
        customer.setEmail(userInput.nextLine());

        System.out.println("Enter Customer Address: ");
        customer.setAddress(userInput.nextLine());

        System.out.println("Enter Customer Phone Number: ");
        customer.setPhoneNumber(userInput.nextInt());

        System.out.println("Enter amount to first deposit: ");
        cheque.setBalance(userInput.nextDouble());

        System.out.println("Enter Customer PIN Number: ");
        cheque.setPIN(userInput.nextInt());

        cheque.setDateOpen(new Date(java.time.LocalDate.now().getDayOfMonth(), java.time.LocalDate.now().getMonthValue(), java.time.LocalDate.now().getYear()));
        cheque.setCustomer(customer);


        cheque.setType(AccountType.Cheque);
        cheque.setTransactionList(new ArrayList<>());
        accounts.add(cheque);

        customer.setAccountList(accounts);

        return customer;
    }

    public static void Display(List<Customer> customers) {
        for(Customer customer : customers) {
            System.out.println(customer);
        }
    }

    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        List<Customer> customers = new ArrayList<>();
        List<Account> accounts;
        Customer cutomer = new Customer();

        Tester tester = new Tester();

    }
}
