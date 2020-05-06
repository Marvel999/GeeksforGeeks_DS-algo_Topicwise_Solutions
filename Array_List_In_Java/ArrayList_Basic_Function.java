package Array_List_In_Java;

import java.util.ArrayList;

/**
 * In this Program We will cover Some Basic Function Of ArrayList.
 * 1. How To make Instance Of ArrayList.
 * 2. How To Add Element In ArrayList by add(element).
 * 3. How To add whole collection to other collection addAll(CollectionName).
 * 4.
 */
public class ArrayList_Basic_Function {
public static void main(String args[]){
    ArrayList<String> frute=new ArrayList<>();
    ArrayList<String> vage=new ArrayList<>();

    frute.add("Mango");//add element to ArrayList.
    frute.add("Banana");
    frute.add("Orenge");
    System.out.println(frute);
    vage.add("onion");
    vage.add("LadyFinger");
    vage.add("Tamato");
    frute.addAll(vage);
    System.out.println(frute);
    frute.set(1,"Hii");
    System.out.println(frute);
    frute.remove(1);
    System.out.println(frute);
//    frute.removeAll(vage);
//    System.out.println(frute);
//    frute.clear();
//    System.out.println(frute);
    System.out.println(frute.size());
    System.out.println(frute.contains("Tamato"));
    System.out.println(frute.isEmpty());
    System.out.println(frute.toArray());


}
}
