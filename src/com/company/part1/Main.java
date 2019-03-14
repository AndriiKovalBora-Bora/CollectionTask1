package com.company.part1;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private List<Integer> arrayList;
    private Map<Integer, Integer> hashMap;

    Main() {
        arrayList = new ArrayList<>();
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(-6);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(2);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(7);

        hashMap = new HashMap<>();
    }

    private void method() {
        Integer count;
        for (Integer i : arrayList) {
            count = hashMap.get(i);
            hashMap.put(i, count == null ? 1 : ++count);
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.method();
        m.hashMap.forEach((key, value) -> System.out.println(key + "-" + value));
    }
}
