// Program: Demonstrating StringBuffer and Its Methods
class StringBufferExample {
    public static void main(String args[])
    {
        // Creating StringBuffer object
        // initial role name: Java
        StringBuffer role = new StringBuffer("Java");
        System.out.println("initial role name: "+role);
        // Initial hashCode: 798154996
        System.out.println("Initial hashCode: "+role.hashCode());
        
        // append() – adds text at the end
        role.append(" Developer");
        //After append role name is: Java Developer
        System.out.println("After append role name is: "+role);
        // After append hashCode: 798154996
        System.out.println("After append hashCode: "+role.hashCode());
        
        // insert() – inserts text at a specific index
        role.insert(5, "full stack ");
        // after insert: Java full stack Developer
        System.out.println("after insert: "+role);
        // After insert hashCode: 798154996
        System.out.println("After insert hashCode: "+role.hashCode());

        // replace() – Replaces a specific portion of string.
        role.replace(0,4, "Spring");
        // after replace the specific portion of text: Spring full stack Developer
        System.out.println("after replace the specific portion of text: "+role);
        
        // delete() – deletes a specific portion of string
        role.delete(0,6);
        // after delete the specfic portion of text:  full stack Developer
        System.out.println("after delete the specfic portion of text: "+role);

        // reverse() – reverses the entire string
        role.reverse();
        // After reverse: repoleveD kcats lluf
        System.out.println("After reverse: "+role);

        // length() - find the length of the string
        // the length of the string is: 21
        System.out.println("the length of the string is: "+role.length());

        // capacity() – returns the current capacity - Capacity: 42
        System.out.println("Capacity: " + role.capacity());

        // ensureCapacity() – increases capacity - New Capacity: 86
        role.ensureCapacity(50);
        System.out.println("New Capacity (after ensureCapacity): " + role.capacity());

        // charAt() – returns character at specific index
        System.out.println("Character at index 2: " + role.charAt(2));

        // setCharAt() – changes character at specific index
        role.setCharAt(2, 'X');
        // After setCharAt: reXoleveD kcats lluf
        System.out.println("After setCharAt: " + role);

        // substring() – returns part of the string
        String sub = role.substring(2, 7);
        // Substring (2 to 7): Xolev
        System.out.println("Substring (2 to 7): " + sub);

    }
}