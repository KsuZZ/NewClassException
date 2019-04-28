import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolutionException {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
          try {
            for (int i = 0; i < S.length(); i++) {
               if (!Character.isDigit(S.charAt(i))) throw new NewException(S);
               else System.out.print(S.charAt(i));
            }
        }
        catch (NewException e) {
            e.NewStrException();
        }
    }
}
class NewException extends Exception{
    private String someString;
    public NewException(String string){
        this.someString = string;
    }

    public void NewStrException(){
        System.out.println("Bad String");
    }
}
