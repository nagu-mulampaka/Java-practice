// program: demonstrates how to take input from the user using Input and Output (I/O) streams.
import java.io.*;
class KeyboardInputExample {
    public static void main(String args[]) throws IOException {

        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);
        System.out.println("Please Enter Your Name");
        String name = br.readLine();
        System.out.println("Hello "+name+" Welcome to my Website");
    }
}