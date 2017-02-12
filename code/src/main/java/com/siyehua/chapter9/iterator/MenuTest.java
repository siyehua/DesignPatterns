package com.siyehua.chapter9.iterator;

/**
 * Created by huangxk on 2017/2/11.
 */
public class MenuTest {
    public static void main(String[] args) {
        DinerMenu dinerMenu = new DinerMenu();
        dinerMenu.addItem(new MenuItem("A", "A desc", true, 2.99));
        dinerMenu.addItem(new MenuItem("B", "B desc", false, 1.99));
        dinerMenu.addItem(new MenuItem("C", "C desc", false, 0.99));
        dinerMenu.addItem(new MenuItem("D", "D desc", true, 5.99));


        PancakeHouseMenu pancakeHouseMenu = new PancakeHouseMenu();
        pancakeHouseMenu.addItem(new MenuItem("F", "t desc", true, 0.99));
        pancakeHouseMenu.addItem(new MenuItem("G", "v desc", false, 7.99));
        pancakeHouseMenu.addItem(new MenuItem("H", "a desc", true, 7.09));
        pancakeHouseMenu.addItem(new MenuItem("I", "s desc", true, 4.99));


        Waitress waitress = new Waitress();
        waitress.addMenuIterator(dinerMenu.iterator());
        waitress.addMenuIterator(pancakeHouseMenu.iterator());

        waitress.print();

    }
}
