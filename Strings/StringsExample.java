// Program: Demonstrating Strings and Their Built-in Methods in Java
class StringsExample{
    public static void main(String args[])
    {
        // String initilazation by using Direct declaration and Printing
        String aboutMe = "Hello everyone, my name is Mulampaka Nagu.";
        System.out.println(aboutMe);

        // Concat two Strings 
        String education = aboutMe.concat(" and I completed my Master's in Computer Applications.");
        System.out.println(education);

        // returning character at specified index
        String collage = "Dr Lankapalli Bullaya PG Collage";
        char c = collage.charAt(3);
        System.out.println("Chat at specified Index is: "+c);
        
        // printing length of the string
        String address = "Lawsons Bay Colony, Visakhapatnam, Andhra Pradesh.";
        int length = address.length();
        System.out.println("length of Address: "+length);
        
        // compare two Strings 
        // Note: Compares two strings and returns 0 if equal; otherwise, a negative value.
        String course = "Java Full Stack Developer";
        String course1 = "Java Full Stack Developer";
        int res = course.compareTo(course1);
        System.out.println("Compare Results is: "+res);

        // compareToIgnoreCase
        // Note: Compares two strings ignoring case; returns 0 if equal, otherwise a negative value.
        String project = "my diary management system";
        String project1 = "MY DIARY MANAGEMENT SYSTEM";
        System.out.println("compare to ignore care results: "+project.compareToIgnoreCase(project1));

        // equals: Returns true if the two strings are equal; otherwise, returns false.
        System.out.println("Two String equal result: "+course.equals(course1));

        // equalsIgnoreCase: Returns true if the two strings are equal; otherwise, returns false.
        System.out.println("Two String equalsIgnoreCase res: "+project.equalsIgnoreCase(project1));
        
        // toLowerCase: converts all characters in the given string to lowercase
        String project2 = "TODO APP USING REACTJS";
        System.out.println("lowercase results is: "+project2.toLowerCase());

        // toUpperCase: converts all characters in the given String to uppercase
        String project3 = "Un-Titled Project";
        System.out.println("upperCase results is: "+project3.toUpperCase());
        
        // startsWith: Tests if the String starts with specified prefix
        // Returns true if string starts with given suffix; else false. (Note: Case-Sensitive)
        String role = "Java Backend Developer";
        System.out.println("startsWith Results is: "+role.startsWith("Java"));

        // endsWith: Tests if the String ends with specified prefix
        // Returns true if string ends with given suffix; else false. (Note: Case-Sensitive)
        String role2 = "Java Backend Developer";
        System.out.println("endsWith Results is: "+role2.endsWith("Developer"));
        
        // indexOf: Returns the index of the first occurrence of the given substring.
        // If the character or substring is not found, returns -1.
        String hobbies = "Playing Cricket";
        System.out.println("index of n in hobbies is: "+hobbies.indexOf("n"));
        
        // Returns the index of the last occurrence of the specified substring.
        // If the character or substring is not found, returns -1.
        System.out.println("index of c search form the ending of the is: "+hobbies.lastIndexOf("c"));

        System.out.println("String Trim Results is: "+hobbies.trim());

        // Replacing all occurrences of oldChar in this String with newChar.
        String name = "Mulampaka Nagu";
        String name1 = name.replace("a","A");
        System.out.println("Old Name is "+name+" Replace Results is: "+name1);

    }
}