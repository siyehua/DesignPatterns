package com.siyehua.chapter9.iterator;

import java.util.Iterator;

/**
 * Created by huangxk on 2017/2/11.
 */
public class DinerMenu implements Iterable<MenuItem> {
    private MenuItem[] menuItems = new MenuItem[9];
    private int index = 0;

    @Override
    public Iterator<MenuItem> iterator() {
        return null;
    }

    public void addItem(MenuItem item) {
        menuItems[index++] = item;
    }

    private class MenuIterator implements Iterator<MenuItem> {
        private int current = 0;

        @Override
        public boolean hasNext() {
            return current <= index;
        }

        @Override
        public MenuItem next() {
            return menuItems[current++];
        }

        @Override
        public void remove() {
            throw new UnsupportedOperationException("un support");
        }
    }

}
