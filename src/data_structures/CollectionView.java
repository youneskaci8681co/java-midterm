package data_structures;

import java.util.Collection;
import java.util.HashMap;

public class CollectionView {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        map.put(2, "LA");
        map.put(4, "Boston");
        map.put(1, "NYC");
        map.put(3, "Denver");

        // Retrieve the collection view of the values present in the map
        Collection<String> values = map.values();

        // Print the values
        for (String value : values) {
            System.out.println(value);
        }
    }

}
