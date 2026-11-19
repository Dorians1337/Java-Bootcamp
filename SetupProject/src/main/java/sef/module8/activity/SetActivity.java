package sef.module8.activity;

import java.util.HashSet;
import java.util.Set;

public class SetActivity {

    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        names.add("John");
        names.add("John");
        names.add("Harry");
        names.add("Daniel");
        names.add("Harry");
        names.add("Sarah");

        print(names);
    }

    static void print(Set set) {
        for (Object name : set) {
            System.out.println(name);
        }
    }
}
