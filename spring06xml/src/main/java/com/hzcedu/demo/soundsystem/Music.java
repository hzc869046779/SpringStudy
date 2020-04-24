package com.hzcedu.demo.soundsystem;

/**
 * @ClassName Music
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 10:48
 * @Version 1.0
 */
public class Music {
    private String title;
    private Integer duration;

    public String getTitle() {
        return title;
    }

    public Integer getDuration() {
        return duration;
    }

    public void setTitle(String title) {
        this.title = title;
        System.out.println("一在" + this.toString() + "注入title");
    }

    public void setDuration(Integer duration) {
        this.duration = duration;
        System.out.println("一在" + this.toString() + "注入duration");
    }

    public Music() {
        super();
        System.out.println("无参构造");
    }

    public Music(String title, Integer duration) {
        this.title = title;
        this.duration = duration;
        System.out.println("有参构造");
    }
}
