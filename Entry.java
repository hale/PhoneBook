/**
 * The Entry class models an address book entry. 
 * An entry consists of a name, stored as a string, 
 * and a number, also stored as a string.  This implementation
 * allows for a greater level of complexity should the class
 * be expanded to store more data.
 */
public class Entry implements Comparable {
    private String name;
    private String number;
    
    public Entry(String name, String number)  {
        this.name = name;
        this.number = number;
    }
    
    public String getName()  {
        return name;
    }
    
    public String getNumber()  {
        return number;
    }
    
    public void changeName(String name)  {
        this.name = name;        
    }
    
    public void changeNumber(String number)  {
        this.number = number;
    }
    
    public String toString()  {
        return name + ": " + number;
    }
    
    public int compareTo(Object ob)  {
        return ((Entry) ob).name.compareTo(this.name);
    }
        
    
}