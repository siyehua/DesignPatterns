package com.siyehua.chapter7.facade;

/**
 * Created by huangxk on 2017/2/8.
 */
public class PlayFacadeTest {
    public static void main(String[] args) {
        PlayVideoFacade facade = new PlayVideoFacade(new PlayVideo());
        facade.watchVideo();
    }
}
