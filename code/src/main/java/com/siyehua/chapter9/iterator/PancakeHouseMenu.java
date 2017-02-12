package com.siyehua.chapter9.iterator;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by huangxk on 2017/2/11.
 */
public class PancakeHouseMenu implements Iterable<MenuItem> {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();

    @Override
    public Iterator<MenuItem> iterator() {
        return new MenuIterator();
    }

    public void addItem(MenuItem item) {
        menuItems.add(item);
    }

    private class MenuIterator implements Iterator<MenuItem> {
        private int index = 0;

        @Override
        public void remove() {
            throw new UnsupportedOperationException("un support");
        }

        @Override
        public boolean hasNext() {
            return index != menuItems.size();
        }

        @Override
        public MenuItem next() {
            return menuItems.get(index++);
        }
    }
}
