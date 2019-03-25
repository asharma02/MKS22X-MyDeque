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
    String printingarray = "[";
    for (int i = 0; i < size(); i++){
      if(i == 0 || i == size()){
        printingarray += data[i];
        }
      else{
        printingarray += ", " + data[i];
      }
    }
    printingarray += "]";
    return printingarray;
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
