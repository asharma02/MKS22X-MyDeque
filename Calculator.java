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
        if(vals[i].equals("+")){
                  Double firstval = expression.removeLast();
                  Double secval = expression.removeLast();
                  expression.addLast(secval + firstval);
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
                else{
                  //if the value is not an operation
                  Double x = Double.parseDouble(vals[i]);
                  expression.addLast(x);
                }
              }
      return expression.getLast();

    }


}
