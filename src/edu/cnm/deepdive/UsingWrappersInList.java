package edu.cnm.deepdive;

import java.util.ArrayList;
import java.util.List;

public class UsingWrappersInList {

  public static void main(String[] args) {
    //List<double> doubleList = new ArrayList<>(); does not compile. Data type cannot be primitive.
    List<Double> doubleList = new ArrayList<>();//now we have the wrapper class as data type. Compiles.
    doubleList.add(10.5);//this double primitive is autoboxed into the Double class.
    doubleList.add(new Double(55.10));//warning from IntelliJ that we don't need to box manually but
    //still accepted.
    doubleList.remove(55.10);//autoboxed
    double first = doubleList.get(0);//unboxing to primitive because the get() will return a double.
    System.out.println(doubleList);//[10.5] shows that it is an ArrayList.
    System.out.println(first);//10.5 Is a primitive.

    List<Integer> numbers = new ArrayList<>();
    numbers.add(null);
    System.out.println(numbers);//prints null because null is linked to objects and Integer is an object.
//  int number = numbers.get(0);//runtime error because this is a NullPointerException and you are
//  unboxing and int cannot hold null.

    List<Integer> nums = new ArrayList<>();
    nums.add(1);//if not specified that this is added at index 0.
    nums.add(2);//added at the end of the list so in this case at index 1.

    nums.remove(1);//will remove on index 1!
    System.out.println("\n" + nums);
    //to remove Integer 1:
    nums.remove(new Integer(1));
    System.out.println(nums);
  }
}
