import java.util.Random;
/**
 * A class to put a bunch of entries in the phonebook.
 */
public class TestClass  {
    Random rand;
    public static final char[] ALPHABET = { 'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p', 'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l', 'z', 'x', 'c', 'v', 'b', 'n', 'm' };
    PhoneBook phoneBook;
    public TestClass()  {
        rand = new Random();
    }
    
    public String sampleNumber()  {
        String phoneNumber = "01";
        for (int i = 0; i < 9; i++)  {
            phoneNumber += rand.nextInt(9);
        }
        return phoneNumber;
    }
    
    public String sampleName()  {
        String name = "";
        int nameSplit = rand.nextInt(3)+4;
        for (int i = 0; i < (rand.nextInt(8)+10); i++)  {
            name += ALPHABET[rand.nextInt(26)];
            if (i == nameSplit)  {
                name += " ";
            }
        }
        return name;
    }
}