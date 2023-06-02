import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseArrayList {

    public static void main(String[] args) {
        List<String> data = new ArrayList<>();

        // Adding elements to the ArrayList
        data.add("Apple");
        data.add("Banana");
        data.add("Orange");

        // Peeking an element (accessing without removing)
        String firstElement = data.get(0);
        System.out.println("First element: " + firstElement);

        // Removing an element
        boolean removed = data.remove("Banana");
        System.out.println("Element removed: " + removed);

        // Retrieving data using a for-each loop
        System.out.println("Data retrieved using for-each loop:");
        for (String element : data) {
            System.out.println(element);
        }


        System.out.println("Data retrieved using while loop and Iterator:");
        Iterator<String> iterator = data.iterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            System.out.println(element);
        }
    }
}
