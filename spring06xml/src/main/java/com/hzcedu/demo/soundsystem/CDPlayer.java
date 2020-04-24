package com.hzcedu.demo.soundsystem;

/**
 * @ClassName CDPlayer
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/24 10:12
 * @Version 1.0
 */
public class CDPlayer  {

    private CompactDisc compactDisc;

    public CDPlayer() {
        super();
        System.out.println("CDPlayer的无参构造方法");
    }

    public CDPlayer(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
        System.out.println("CDPlayer的有参构造方法");
    }

    public void setCompactDisc(CompactDisc compactDisc) {
        this.compactDisc = compactDisc;
    }

    public void play(){
        compactDisc.play();
        System.out.println("CDPlayer:"+this.toString());
    }
}
