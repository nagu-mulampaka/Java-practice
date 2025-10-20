// Program: Demonstrating StringBuilder and Its Methods
public class StringBuilderExample {
    public static void main(String[] args) {

        // Create StringBuilder
        StringBuilder name = new StringBuilder("My name is Nagu Mulampaka");
        
        // append() – add text at the end
        name.append(" from Visakhapatnam");
        System.out.println("append(): " + name);

        // insert() – insert text at a specific position
        name.insert(0, "Hello, Everyone ");
        System.out.println("insert(): " + name);

        // replace() – replace a part of the string
        name.replace(0, 5, "Hi ");
        System.out.println("replace(): " + name);

        // delete() – delete part of the string
        name.delete(11, 15);
        System.out.println("delete(): " + name);

        // reverse() – reverse the entire string
        name.reverse();
        System.out.println("reverse(): " + name);

        // length() – find total number of characters
        System.out.println("length(): " + name.length());

        // capacity() – check current capacity
        System.out.println("capacity(): " + name.capacity());

        // ensureCapacity() – increase capacity
        name.ensureCapacity(60);
        System.out.println("ensureCapacity(60): " + name.capacity());

        // charAt() – get character at specific index
        System.out.println("charAt(11): " + name.charAt(11));

        // substring() – extract part of string
        System.out.println("substring(11, 23): " + name.substring(11, 23));

        // indexOf() – find position of word
        System.out.println("indexOf :" + name.indexOf("Nagu"));

        // deleteCharAt() – delete a single character
        name.deleteCharAt(0);
        System.out.println("deleteCharAt(): " + name);

        // toString() – convert StringBuilder to String
        String str = name.toString();
        System.out.println("toString(): " + str);
    }
}
