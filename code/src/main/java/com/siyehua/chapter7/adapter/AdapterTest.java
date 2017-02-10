package com.siyehua.chapter7.adapter;

/**
 * Created by huangxk on 2017/2/8.
 */
public class AdapterTest {
    public static void main(String[] args) {
        Turkey turkey = new HotTurkey();
        TurkeyAdapter adapter = new TurkeyAdapter(turkey);

        adapter.quack();
        adapter.fly();
    }
}
