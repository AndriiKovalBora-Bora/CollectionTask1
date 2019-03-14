package com.company.part2;

public class Main1 {
    public static void main(String[] args) {
        SimpleArray<String> arrayList = new SimpleArray<>();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");

        System.out.println("\nArray List : ");
        arrayList.forEach(x -> System.out.println(x + " "));

        System.out.println("\nSize : " + arrayList.size());

        System.out.println("\nElement 2 : " + arrayList.get(2));

        arrayList.update(2,"four");
        System.out.println("\nArray List after update : ");
        arrayList.forEach(x -> System.out.println(x + " "));
    }
}
