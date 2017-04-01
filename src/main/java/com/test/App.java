package com.test;

import java.util.List;

public class App
{
    private FastScanner sc = new FastScanner(System.in);
    private Dictionary dictionary = new Dictionary();

    public static void main(String[] args) {
        App app = new App();
        while (true) {
            app.showData();
            try {
                int n = app.getIntegerInput();
                if (n < 1 || n > 3) {
                    System.out.println("Invalid option selected");
                    continue;
                }
                app.doOperation(n);
            } catch (NumberFormatException e) {
                System.out.println("Input is not a valid integer");
            } catch (Exception e) {
                System.out.println("Exception occurred: " + e.getMessage());
            }

        }
    }

    private void showData() {
        System.out.println("1) Add Contact 2) Search 3) Exit");
    }

    private int getIntegerInput() throws NumberFormatException {
        String in = sc.nextLine();
        return Integer.parseInt(in);
    }

    private void doOperation(int n) {
        switch (n) {
            case 3:
                System.out.println("Happy Searching");
                System.exit(0);
            case 2:
                System.out.print("Enter Name: ");
                String name = sc.nextLine();
                List<Contact> contacts = dictionary.searchName(name);
                StringBuilder sb = new StringBuilder();
                for (Contact contact: contacts) {
                    sb.setLength(0);
                    if(contact.getFirstName() != null) sb.append(contact.getFirstName());
                    if(contact.getLastName() != null) sb.append(" " + contact.getLastName());
                    System.out.println(sb.toString());
                }
                break;
            case 1:
                System.out.print("Enter Name: ");
                name = sc.nextLine();
                Contact contact = getContact(name);
                dictionary.addContact(contact);
                break;
            default:

        }
    }

    private Contact getContact(String name) {
        String []words = name.split("[^\\w']+");
        Contact contact = new Contact();
        contact.setFirstName(words[0]);
        if(words.length > 1)
            contact.setLastName(words[1]);
        return contact;
    }
}
