import java.util.*;
@SuppressWarnings("unchecked")


public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

  public MyDeque(){
    size = 0;
    start = 0;
    end = 0;
    data =(E[])new Object[10];
  }

  public MyDeque(int initialCapacity){
    size = 0;
    start = 0;
    end = 0;
    data =(E[])new Object[initialCapacity];
  }

  public int size(){
    return size;
  }

  public String toString(){
    if (size() == 0) return "{}"; //if nothing in array
    String output = "{";
    for (int i = start; i < data.length && (start > end || (start <= end && i <= end)); i++){ //make sure u are inbound of start and end
      output += data[i]; //add it
      if (i != end) {  //if not at end, add space
        output += " ";
      }
      else {
        output += "}"; //if at end, add end bracket
      }
    }
    if (start > end){ //start was greater then end, pick up left overs
      for (int i = 0; i <= end; i++){
        output += data[i];
        if (i != end) {
          output += " ";
        }
        else {
          output += "}";
        }
      }
    }
    return output;//return
   }

  public void addFirst(E element){

   }
  public void addLast(E element){

   }
  public E removeFirst(E element){

   }
  public E removeLast(E element){

  }
  public E getFirst(E element){

  }
  public E getLast(E element){

  }

}
