package com.siyehua.chapter7.facade;

/**
 * Created by huangxk on 2017/2/8.
 */
public class PlayVideoFacade {
    private PlayVideo playVideo;

    public PlayVideoFacade(PlayVideo playVideo) {
        this.playVideo = playVideo;
    }

    public void watchVideo() {
        playVideo.openMi();
        playVideo.startMi();
        playVideo.closeLight();
        playVideo.downScreen();
        playVideo.openVideo();
        playVideo.playCD();
    }
}
