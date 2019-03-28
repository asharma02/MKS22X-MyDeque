import java.util.Arrays;

public class Calculator{
    /*Evaluate a postfix expression stored in s.
     *Assume valid postfix notation, separated by spaces.
     */
    public static double eval(String s){
      String[] vals = s.split(" "); //split by space
      //System.out.println(Arrays.toString(vals));
      MyDeque<Double> expression = new MyDeque<Double>();
      for (int i = 0; i < vals.length; i++) { //loop through array
        if(vals[i].equals("+")){ //check if equal to operator
          Double firstval = expression.removeLast(); //pop the last one (top)
          Double secval = expression.removeLast(); //pop the second to last one; so get the last two
          expression.addLast(secval + firstval); //do operation and add it back in
        }
        else if(vals[i].equals("-")){
          Double firstval = expression.removeLast();
          Double secval = expression.removeLast();
          expression.addLast(secval - firstval);
        }
        else if(vals[i].equals("*")){
          Double firstval = expression.removeLast();
          Double secval = expression.removeLast();
          expression.addLast(secval * firstval);
        }
        else if(vals[i].equals("/")){
          Double firstval = expression.removeLast();
          Double secval = expression.removeLast();
          expression.addLast(secval / firstval);
        }
        else if(vals[i].equals("%")){
          Double firstval = expression.removeLast();
          Double secval = expression.removeLast();
          expression.addLast(secval % firstval);
        }
        else{ //if it is a number and not an operator, turn into double and insert back in
          Double x = Double.parseDouble(vals[i]);
          expression.addLast(x);
        }
      }
      return expression.getLast();//return the last num

    }


}
