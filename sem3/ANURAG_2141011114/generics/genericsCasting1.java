package generics;

import java.util.ArrayList;
import java.util.List;
public class genericsCasting1 {
public static void main(String args[]){
List<String> mylist = new ArrayList<String>();
mylist.add("I love Arraylist");
String mystring = mylist.get(0);
System.out.println(mystring);
}
}