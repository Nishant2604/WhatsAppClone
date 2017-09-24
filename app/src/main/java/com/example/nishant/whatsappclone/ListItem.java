package com.example.nishant.whatsappclone;


public class ListItem {

    private String name;
    private String message_overview;
    private String time;

    public ListItem(String name, String message_overview, String time) {
        this.name = name;
        this.message_overview = message_overview;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getTime() {
        return time;
    }

    public String getMessage_overview() {
        return message_overview;
    }
}
