import java.util.ArrayList;
import java.util.Collections;
import simpleIO.*;
/**
 * The PhoneBook class uses an ArrayList to collect together
 * instances of the Entry class. The phonebook class is able
 * to manage and process the Entry objects.  For example, by adding
 * new entries to the phonebook, finding specific entires, listing
 * all the entries, etc.
 * 
 * @author Philip Hale
 * @version p2
 */
public class PhoneBook  {
    private ArrayList<Entry> entries;
    private UserDialog ud;
    
    public PhoneBook()  {
        entries = new ArrayList();
        ud = new UserDialog();
        
    }
    
    public void phoneInterface()  {
    }
    
    public boolean addEntry(String name, String number)  {
        if (!entries.add(new Entry(name, number)))  {
            return false;
        }
        return true;
    }
    
    public Entry findEntry(String n)  {
        for (Entry entry : entries)  {
            if (entry.getName().equals(n) || entry.getNumber().equals(n))  {
                return entry;
            }
        }
        return null;
    }
         
    public boolean removeEntry(Entry entry)  {
        return entries.remove(entry);
    }
    
    public void changeName(Entry entry, String name)  {
        entry.changeName(name);
    }
    
    private void changeNumber(Entry entry, String number)  {
        entry.changeNumber(number);
    }
    
    public void listAll()  {
        for (Entry entry : entries)  {
            System.out.println(entry);
        }
    }
    
    public void listAllSorted()  {
        Collections.sort(entries);
    }

}