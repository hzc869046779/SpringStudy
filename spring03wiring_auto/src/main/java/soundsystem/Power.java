package soundsystem;

import org.springframework.stereotype.Component;

/**
 * @ClassName Power
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 14:15
 * @Version 1.0
 */

@Component
public class Power {
    public Power() {
        super();
    }

    public void supply(){
        System.out.println("宫殿中");
    }
}
