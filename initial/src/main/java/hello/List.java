package hello;

public class List {
    
    private List items;


    public List() {
        
    }

    public List getItems() {
        return items;
    }

    public void addItem (Task item) {
        items.addItem(item);
    }

}