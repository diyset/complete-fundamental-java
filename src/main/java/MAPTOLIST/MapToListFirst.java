package MAPTOLIST;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapToListFirst {

    public static void main(String[] args){
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(10,"Apel");
        map.put(20,"Durian");
        map.put(30,"Mangga");
        map.put(40,"Jambu");
        map.put(50,"Manggisan");
        System.out.println("\n1. Export Map Key to List");
        List<Integer> resultKey = new ArrayList(map.keySet());

        for (Integer items:resultKey) {
            System.out.println(items);
        }

        System.out.println("\n2. Export Map Value to List");
        List<String> resultValues = new ArrayList(map.values());

        for (String items:resultValues) {
            System.out.println(items);
        }
    }
}
