package javacollections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapExample1 {

    public static void main(String[] args) {

        HashMap mapName = new HashMap();
        mapName.put("first", 1);
        mapName.put(10, "java");
        mapName.put(true, 20);
        mapName.put("ans" , false);
        mapName.put("av" , false);

        //Print Map
        System.out.println(mapName);
// Iterate value from map
        Set setOfKeys = mapName.keySet();
        Iterator itr = setOfKeys.iterator();
        while (itr.hasNext()) {
            Object key = itr.next();
            System.out.println("Key -- >" + key + ", Value -- >" + mapName.get(key));
    }
}
}