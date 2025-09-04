import java.util.Scanner;
import java.util.Vector;

public class StringSort {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Vector<String> string = new Vector<>();

        String st = "";
        while(!st.equals("quit")){
            System.out.print("Enter string (quit to end): ");
            st = input.next();
            string.add(st);
        }
        
        string.remove(string.size()-1);
        System.out.println("Number of lines: " + string.size());
        System.out.println("First line: " + string.get(0));
        System.out.println("Lines in reverse order: ");
        for (int i = string.size() - 1; i >= 0; i--) {
            System.out.println(string.get(i));
        }
    } 
}
