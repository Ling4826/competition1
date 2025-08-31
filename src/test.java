import java.util.*;

class test {
    public static void main(String[] args) {
        StringBuffer sbf = new StringBuffer("GeeksforGeeks");
        System.out.println("String buffer before deletion = " + sbf);

        // Deleting the character at indexpoint 5
        sbf.deleteCharAt(5);
        System.out.println("After deletion new StringBuffer = " + sbf);
    }

}