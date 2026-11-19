package sef.module8.activity;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapActivity {

    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("1", "John");
        map.put("2", "Harry");
        map.put("3", "Daniel");
        map.put("4", "Sarah");

        MapActivity obj = new MapActivity();
        obj.print(map);
    }

    void print(Map map) {
        Set keySet = map.keySet();
        System.out.println("Key\tValue");
        for (Object key : keySet) {
            System.out.println(key + "\t" + map.get(key));
        }
    }
}
