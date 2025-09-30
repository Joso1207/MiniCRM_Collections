package org.example;

import java.util.*;

public class Customer {

    private final String id;
    private static Integer lastId = 0;

    private final String name;
    private final Set<String> emails = new LinkedHashSet<>();
    private final Set<String> tags = new LinkedHashSet<>();
    private final List<String> notes = new ArrayList<>();


    public Customer(String name) {

        if (name.isBlank()){
            throw new IllegalArgumentException("Name cannot be blank");
        }

        this.name = name;
        lastId++;
        this.id = lastId.toString();
    }

    public void addEmail(String email){
        emails.add(email);
    }
    public void listEmail(){
        for(String s : emails){
            System.out.println(s);
        }
    }

    public void removeEmail(String email){
        emails.remove(email);
    }

    public void addTag(String tag){
        tags.add(tag);
    }

    public void listTags(){
        for(String s : tags){
            System.out.println(s);
        }
    }

    public void removeTag(String tag){
        tags.remove(tag);
    }

    public void addNote(String note){
        notes.add(note);
    }

    public String getNote(int index){
        return notes.get(index);
    }

    public void listNotes(){
        for (String s : notes){
            System.out.println(s);
        }
    }

    public void removeNote(int index){
        notes.remove(index);
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public Set<String> getEmails() {
        return emails;
    }

    public Set<String> getTags() {
        return tags;
    }

    public List<String> getNotes() {
        return notes;
    }

    @Override
    public String toString() {
        return "Customer{id='"+ id + "', name='"+name+ "',tags='"+tags+
                "',emails='"+emails+"',notes='"+notes+"'}";
    }
}
