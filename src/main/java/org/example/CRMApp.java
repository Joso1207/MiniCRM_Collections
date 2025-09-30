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
                case "6" -> printCustomerInformation();
                case "7" -> listAll();
                case "8" -> {
                    return;
                }

            }


        }
    }

    private static void addNewCustomer(){

        String name = scanner.nextLine();

        Customer newCustomer = new Customer(name);
        storage.put(newCustomer.getId(), newCustomer);

    }

    private static void addEmailToCustomer(){

        String id,email;
        id = scanner.nextLine();
        email = scanner.nextLine();

        Customer c = storage.get(id);
        c.addEmail(email);

    }

    private static void removeEmailFromCustomer(){

        String id,email;
        id = scanner.nextLine();
        email = scanner.nextLine();

        Customer c = storage.get(id);
        c.removeEmail(email);
    }

    private static void addTagToCustomer(){

        String id,tag;
        id = scanner.nextLine();
        tag = scanner.nextLine();

        Customer c = storage.get(id);
        c.addTag(tag);
    }

    private static void removeTagToCustomer(){
        String id,tag;
        id = scanner.nextLine();
        tag = scanner.nextLine();


        Customer c = storage.get(id);
        c.removeTag(tag);
    }

    private static void addNoteToCustomer() {
        String id,note;
        id = scanner.nextLine();
        note = scanner.nextLine();


        Customer c = storage.get(id);
        c.addNote(note);
    }

    private static void removeNoteFromCustomer(){

        String id,noteIndex;
        id = scanner.nextLine();
        noteIndex = scanner.nextLine();


        Customer c = storage.get(id);
        c.removeNote(Integer.parseInt(noteIndex));
    }

    private static void printCustomerInformation(){
        String id = scanner.nextLine();
        System.out.println(storage.get(id).toString());
    }

    private static void listAll(){
        for (Customer c : storage.values()){

            System.out.println("Customer(id="+c.getId()+
                    ", Name="+c.getName()+" Notes:"+c.getNotes().size()+
                    " Tags:"+c.getTags().size());

        }
    }

    private static void printMenu(){
        System.out.println("\nWelcome to Customer Relations Management app");
        System.out.println("Select a command");
        System.out.println("1. add a customer");
        System.out.println("2. add email to customer");
        System.out.println("3. remove email from customer");
        System.out.println("4. add tag to Customer");
        System.out.println("5. remove tag from customer");
        System.out.println("6. print customer information");
        System.out.println("7. print all customer information");
        System.out.println("8. quit");
    }



}
