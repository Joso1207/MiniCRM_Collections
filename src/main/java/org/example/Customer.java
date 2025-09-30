package org.example;

import java.util.*;

public class Customer {

    private final String id;
    private String name;
    private final Set<String> emails = new LinkedHashSet<>();
    private final Set<String> tags = new LinkedHashSet<>();
    private final List<String> notes = new ArrayList<>();


}
