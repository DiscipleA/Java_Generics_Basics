import java.util.ArrayList;

public class Library_P3 {
    // instance variables
    private ArrayList <Object> items = new ArrayList<>();   // instantiated directly here
    private Object item; // current single item, used by constructor/setter

    // Default constructor
    public Library_P3(Object item) {
        setItems(item);       
    }

    // setter for items
    public void setItems(Object item) {
        if (item == null)
            throw new IllegalArgumentException("Items cannot be null"); 
        this.item = item;
    }

    // Accessor for current item name
    public Object getItemName(Object item) {
        return item;
    }
    // Method to add an item to the library

    public void addItem(Object item) {
        setItems(item);
        items.add(item);
    }

    // Method to remove an item from the library
    public boolean removeItem(Object item) {
        return items.remove(item);
    }

    // Method to find an item by name
    public String findItemByName(String item) {
        if (item == null || item.isEmpty())
            throw new IllegalArgumentException("Name cannot be null"); 
        
        String book = "";
        for (Object it : items) {
            if (it.toString().equals(item) || item.equalsIgnoreCase(getItemName(it).toString())) {
                book += it.toString() + "\n";
                return book;
            }
        }
        return "Not Found";
    }
    // toString method to list all items
    public String toString() {
        String books = "";
        for (Object it : items) {
            books += it + "\n"; 
        }
        return books;
    }    
}