package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @ClassName CompactDisc
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 0:00
 * @Version 1.0
 */

//@Component
public class CompactDisc {
    public CompactDisc() {
        super();
        System.out.println("CompactDisc无参构造");
    }

    public void play(){
        System.out.println("正在播放音乐");
    }
}
