import java.util.Random;
/**
 * A class to put a bunch of entries in the phonebook.
 */
public class TestClass  {
    Random rand;
    public static final char[] ALPHABET = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
    PhoneBook phoneBook;
    public TestClass(int quant)  {
        rand = new Random();
        phoneBook = new PhoneBook();
        for (int i = 0; i < quant; i++)  {
            phoneBook.addEntry(addNewNumber(), addNewName());
        }
    }
    
    private String addNewNumber()  {
        rand = new Random();
        String phoneNumber = "01";
        for (int i = 0; i < 9; i++)  {
            phoneNumber += rand.nextInt(9);
        
        }
        return phoneNumber;
    }
    
    private String addNewName()  {
        rand = new Random();
        String name = "";
        for (int i = 0; i < (rand.nextInt(8)+10); i++)  {
            name += ALPHABET[rand.nextInt(26)];
            if (i == 4)  {
                name += " ";
            }
        }
        return name;
    }
}