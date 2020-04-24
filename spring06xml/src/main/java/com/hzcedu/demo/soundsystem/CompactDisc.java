package com.hzcedu.demo.soundsystem;

import java.util.List;

/**
 * @ClassName CompactDisc
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/23 21:39
 * @Version 1.0
 */
public class CompactDisc {

    private String title;
    private String artist;
    private List<Music> tracks;

    public CompactDisc() {
        super();
        System.out.println("compactdisc构造函数" + this.toString());
    }

    public CompactDisc(String title, String artist) {
        this.title = title;
        this.artist = artist;
        System.out.println("compactdisc构造函数有参构造");
    }

    public CompactDisc(String title, String artist, List<Music> tracks) {
        this.title = title;
        this.artist = artist;
        this.tracks = tracks;
        System.out.println("compactdisc三个参数构造");
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public void setTracks(List<Music> tracks) {
        this.tracks = tracks;
    }

    public void play(){
        System.out.println("播放音乐" + this.toString() + " " + this.title + " by" + this.artist);

        for(Music track:this.tracks){
            System.out.println("音乐："+track.getTitle() + ",时长: "+track.getDuration());
        }
    }
}
