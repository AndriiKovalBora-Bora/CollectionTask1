package com.company.part2;

public interface Simple<E> extends Iterable<E>{
    boolean add(E e);
    E get(int index);
    int size();
    void update(int index, E e);
}
