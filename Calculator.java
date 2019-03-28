import java.util.Arrays;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] vals = s.split(" "); //split by space
      //System.out.println(Arrays.toString(vals));
      MyDeque<Double> deque = new MyDeque<Double>();
      for (int i = 0; i < vals.length; i++) { //loop through array
        Double two = deque.removeLast();
        Double one = deque.removeLast();
        if(vals[i].equals("+")){
                  deque.addLast(one + two);
                }
                else if(vals[i].equals("-")){
                  deque.addLast(one - two);
                }
                else if(vals[i].equals("*")){
                  deque.addLast(one * two);
                }
                else if(vals[i].equals("/")){
                  deque.addLast(one / two);
                }
                else if(vals[i].equals("%")){
                  deque.addLast(one % two);
                }
                else{
                  //if the value is not an operation
                  deque.addLast(Double.parseDouble(vals[i]));
                }
              }
      return deque.getLast();

    }


}
