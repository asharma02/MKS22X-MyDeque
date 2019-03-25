import java.util.Arrays;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] vals = s.split(" ");
      System.out.println(Arrays.toString(vals));
      return 0.0;
    }

public static void main(String[] args) {
  System.out.println(eval("8 2 + 99 9 - * 2 + 9 -"));
}

}
