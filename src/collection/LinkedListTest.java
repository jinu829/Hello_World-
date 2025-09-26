package collection;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] aStrings)
    {
        LinkedList<String> myList = new LinkedList<String>();

        myList.add("a");
        myList.add("b");
        myList.add("c");

        System.out.println(myList);

        myList.add(1, "D");
        System.out.println(myList);

        myList.addFirst("O");
        System.out.println(myList);

        System.out.println(myList.removeLast());
        System.out.println(myList);
    }
}
