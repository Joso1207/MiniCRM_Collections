package org.example;


import java.util.*;

public class CRMApp {
    private static final Map<String,Customer> storage = new HashMap<>();
    private static final Scanner scanner = new Scanner(System.in);


    public CRMApp() {

    }

    public static void main(String[] args){
        CRMApp.run();
    }

    private static void run(){
        while(true){

            printMenu();

            switch (scanner.nextLine()){
                case "1" -> addNewCustomer();
                case "2" -> addEmailToCustomer();
                case "3" -> removeEmailFromCustomer();
                case "4" -> addTagToCustomer();
                case "5" -> removeTagToCustomer();
                case "6" -> addNoteToCustomer();
                case "7" -> removeNoteFromCustomer();
                case "8" -> printCustomerInformation();
                case "9" -> listAll();
                case "10" -> {
                    return;
                }
                default -> System.err.println("No such command");

            }


        }
    }

    private static void addNewCustomer(){
        System.out.println("Insert name of customer");
        String name = scanner.nextLine();

        if (name.isBlank()){
            System.err.println("Name cannot be blank");
        }


        Customer newCustomer = new Customer(name);
        storage.put(newCustomer.getId(), newCustomer);

    }

    private static void addEmailToCustomer(){

        String id,email;
        System.out.println("Customer ID?");
        id = scanner.nextLine();
        System.out.println("insert email body");
        email = scanner.nextLine();

        if(id.isBlank()||email.isBlank()){
            System.err.println("No Blank inputs");
            return;

        }

        if(!id.matches("[0-9]+")){
            System.err.println("Only numerals for ID");
            return;
        }

        Customer c = storage.get(id);
        c.addEmail(email);

    }

    private static void removeEmailFromCustomer(){

        String id,email;
        System.out.println("Customer ID");
        id = scanner.nextLine();
        System.out.println("Email to remove");
        email = scanner.nextLine();

        if(id.isBlank()||email.isBlank()){
            System.err.println("No Blank inputs");
            return;

        }

        if(!id.matches("[0-9]+")){
            System.err.println("Only numerals for ID");
            return;
        }

        Customer c = storage.get(id);
        c.removeEmail(email);
    }

    private static void addTagToCustomer(){

        String id,tag;
        System.out.println("Customer ID?");
        id = scanner.nextLine();
        System.out.println("What tag do you want to add");
        tag = scanner.nextLine();

        if(id.isBlank()||tag.isBlank()){
            System.err.println("No Blank inputs");
            return;

        }

        if(!id.matches("[0-9]+")){
            System.err.println("Only numerals for ID");
            return;
        }

        Customer c = storage.get(id);
        c.addTag(tag);
    }

    private static void removeTagToCustomer(){
        String id,tag;
        System.out.println("Customer ID?");
        id = scanner.nextLine();
        System.out.println("What tag to remove?");
        tag = scanner.nextLine();

        if(id.isBlank()||tag.isBlank()){
            System.err.println("No Blank inputs");
            return;

        }

        if(!id.matches("[0-9]+")){
            System.err.println("Only numerals for ID");
            return;
        }


        Customer c = storage.get(id);
        c.removeTag(tag);
    }

    private static void addNoteToCustomer() {
        String id,note;
        System.out.println("Customer ID?");
        id = scanner.nextLine();
        System.out.println("What note do you want to add?");
        note = scanner.nextLine();

        if(id.isBlank()||note.isBlank()){
            System.err.println("No Blank inputs");
            return;

        }

        if(!id.matches("[0-9]+")){
            System.err.println("Only numerals for ID");
            return;
        }


        Customer c = storage.get(id);
        c.addNote(note);
    }

    private static void removeNoteFromCustomer(){

        String id,noteIndex;
        System.out.println("Customer ID?");
        id = scanner.nextLine();
        System.out.println("what note do you want removed");
        noteIndex = scanner.nextLine();

        if(id.isBlank()||noteIndex.isBlank()){
            System.err.println("No Blank inputs");
            return;

        }

        if(!id.matches("[0-9]+")){
            System.err.println("Only numerals for ID");
            return;
        }

        if(!noteIndex.matches("[0-9]+")){
            System.err.println("Only numerals for noteIndex");
            return;
        }


        Customer c = storage.get(id);
        c.removeNote(Integer.parseInt(noteIndex));
    }

    private static void printCustomerInformation(){
        System.out.println("Customer ID?");
        String id = scanner.nextLine();

        if(!id.matches("[0-9]+")||id.isBlank()){
            System.err.println("invalid id");
            return;
        }

        System.out.println(storage.get(id).toString());

        System.out.println("press enter to continue");
        scanner.nextLine();
    }

    private static void listAll(){
        for (Customer c : storage.values()){
            System.out.println("Customer(id:"+c.getId()+
                    ", Name: "+c.getName()+" Notes:"+c.getNotes().size()+
                    " Tags:"+c.getTags().size()+")");

        }
        System.out.println("press enter to continue");
        scanner.nextLine();

    }

    private static void printMenu(){
        System.out.println("\nWelcome to Customer Relations Management app");
        System.out.println("Select a command");
        System.out.println("1. add a customer");
        System.out.println("2. add email to customer");
        System.out.println("3. remove email from customer");
        System.out.println("4. add tag to Customer");
        System.out.println("5. remove tag from customer");
        System.out.println("6. add note to customer");
        System.out.println("7. remove note1 from customer");
        System.out.println("8. print customer information");
        System.out.println("9. print all customer information");
        System.out.println("10. quit");
    }



}
