package server.controllers;

public class Item {
    private long id;
    private String name;
    private String type;

    public Item(long id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
    }

    public Item(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
