package com.siyehua.chapter9.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by huangxk on 2017/2/11.
 */
public class Waitress {
    private ArrayList<Iterator<MenuItem>> menuIterators = new ArrayList<>();

    public void addMenuIterator(Iterator<MenuItem> iterator) {
        menuIterators.add(iterator);
    }

    public void print() {
        for (Iterator<MenuItem> item : menuIterators) {
            while (item.hasNext()) {
                System.out.println(item.next());
            }
        }
    }
}
