import java.util.StringTokenizer;

public class StringTokenizerExample {
    public static void main(String[] args) {

         // Creating a string
        String sentence = "Java is a powerful programming language";
        
        // Creating StringTokenizer object
        StringTokenizer tokenizer = new StringTokenizer(sentence);
        
        System.out.println("Tokens from the sentence:");
        
        // hasMoreTokens() → checks if more tokens are available
        // nextToken() → returns the next token
        while (tokenizer.hasMoreTokens()) {
            System.out.println(tokenizer.nextToken());
        }
        
        // Creating a String
        String languages = "Java,Spring,React,MySQL,HTML";
        
        // Create StringTokenizer with delimiter ','
        StringTokenizer st = new StringTokenizer(languages, ",");
        
        // countTokens() → Returns total tokens left
        System.out.println("\nTotal tokens in languages: " + st.countTokens());
        
        // hasMoreTokens() → Checks if more tokens are available
        System.out.println("\nTokens from the languages:");
        while (st.hasMoreTokens()) {
            // nextToken() → Returns next token
            System.out.println(st.nextToken());
        }

        // Using multiple delimiters
        String tech = "Java-Spring|React,MySQL.HTML";
        StringTokenizer st2 = new StringTokenizer(tech, "-|,.");
        
        System.out.println("\nMultiple delimiters example:");
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        //  Using returnDelims = true
        String data = "A,B,C";
        StringTokenizer st3 = new StringTokenizer(data, ",", true);
        
        System.out.println("\nIncluding delimiters in output:");
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }
    }
}
/* 
OUTPUT:
---------------------------
Tokens from the sentence:
Java
is
a
powerful
programming
language

Total tokens in languages: 5

Tokens from the languages:
Java
Spring
React
MySQL
HTML

Multiple delimiters example:
Java
Spring
React
MySQL
HTML

Including delimiters in output:
A
,
B
,
C

*/