package hello;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Task> items;
    private String name;

    public Board() {
        this.items = new ArrayList<Task>();
        this.name = "";
    }

    public Board(String name) {
        this.name = name;
        this.items = new ArrayList<Task>();
    }

    public void addItem() {
        
    }
    
}