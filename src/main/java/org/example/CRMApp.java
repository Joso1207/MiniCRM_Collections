package org.example;


import java.util.*;

public class CRMApp {
    private final Map<String,Customer> Storage;
    private final Scanner scanner = new Scanner(System.in);


    public CRMApp(Map<String, Customer> storage) {
        Storage = storage;
    }
}
