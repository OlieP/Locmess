package pt.ulisboa.tecnico.cmov.locmess;

/**
 * Created by Pedro on 29/03/2017.
 */

import java.util.ArrayList;

public class Message {
    public String name;
    public String hometown;

    public Message(String name, String hometown) {
        this.name = name;
        this.hometown = hometown;
    }

    public static ArrayList<Message> getUsers() {
        ArrayList<Message> users = new ArrayList<Message>();
        users.add(new Message("Harry", "San Diego"));
        users.add(new Message("Marla", "San Francisco"));
        users.add(new Message("Sarah", "San Marco"));
        return users;
    }
}