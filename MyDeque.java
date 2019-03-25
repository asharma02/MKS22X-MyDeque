import java.util.*;
@SuppressWarnings("unchecked")


public class MyDeque<E>{
  private E[] data;
  private int size, start, end;

//constructors
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

   public void resize() { //made resize, kiran reccomended ty, very helpful to save time
     //resizes and places eveeyrhing in order, less confuion, reset
     E[] newdata = (E[]) new Object[data.length * 2 + 1];
     int x = 0;
     for (int i = start; i < data.length && (start > end || (start <= end && i <= end)); i++) { //inbounds?
       newdata[x] = data[i];//add
       x += 1;
     }
     if (start > end) { //pick up rest
       for (int i = 0; i <= end; i++) {
        newdata[x] = data[i];//add
        x += 1;
        }
      }
      data = newdata;
      start = 0 ; //start is index -
      end = size() - 1; //set end to last element
    }

  public void addFirst(E element){ //adding to start of queue, find start
    if (element == null) {
      throw new NullPointerException(); //check for exception
    }
    if(data.length == size) {
      resize(); //if its the size is at max of array, resize
    }
    if (size != 0) { //if stuff in array, find where to put it
      if(start == 0) {//if start the first one
        start = data.length - 1; //set start to the end, loop around
        }
      else {
        start -= 1; //if its not the first one, new start becomes the one in front
      }
    }
    data[start] = element; //put it at the found start
    size += 1;//add to size cause you added one more
   }

  public void addLast(E element){
    if (element == null) {
      throw new NullPointerException();//exception
    }
    if (size == data.length) { //check if needs resziing
      resize();
    }
    if (size() != 0) { //if there is stuff
      if (end == data.length - 1) {//same as addfirst, but you look for end instead of start
        end = 0; //if end is the last one, loop around make end 0
      }
      else { // if not last one
        end += 1; //make it the one after
      }
    }
    data[end] = element; //insert it at found end
    size += 1;
   }

  public E removeFirst(){
    if (size == 0) {
      throw new NoSuchElementException(); //for excpetion
    }
    if (size == 1) { //if only one
      size = 0; //set size 0 and return
      return data[start];
    }
    E first = data[start]; //set at start
    start += 1; //move start up
    if(start == data.length) { //if start is at the end
      start = 0; //set start at 0; loop around
    }
    size -= 1; //remove 1 from size and return
    return first;
   }

  public E removeLast(){
    if (size == 0) {
      throw new NoSuchElementException(); //for excpetion
    }
    if (size == 1) { //if only one
      size = 0; //set size 0 and return
      return data[start];
    }
    int last = end; //set at end
    end -= 1;//make end one before
    if (end == -1) { //if end is past
      end = data.length; //end is the last one, data.length
    }
    size -= 1; //remove from size and return
    return data[last];
  }

  public E getFirst(){ //just excpetion, return start
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return data[start];
  }

  public E getLast(){ //just excpetion,
    if (size == 0) {
      throw new NoSuchElementException();
    }
    return data[end];
  }

}
