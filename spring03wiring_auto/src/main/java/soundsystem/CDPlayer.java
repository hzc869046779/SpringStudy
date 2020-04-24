package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName CDPlayer
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 0:02
 * @Version 1.0
 */

@Component
public class CDPlayer {

    /**
     * 属性的依赖注入通过反射机制实现，效率不高
     */
    @Autowired(required = false)
    private CompactDisc cd;

    @Autowired
    private Power power;

    /*@Autowired
    public void setCd(CompactDisc cd) {
        this.cd = cd;
    }

    @Autowired
    public void setPower(Power power) {
        this.power = power;
    }

    public CDPlayer() {
        super();
    }*/

/*    @Autowired  //自动装配,自动满足bean之间的依赖
    public CDPlayer(CompactDisc cd) {
        this.cd = cd;
        System.out.println("CDPlayer有参构造");
    }*/

    /**
     * 构造函数的依赖注入是高效的
     */
   /* @Autowired
    public CDPlayer(CompactDisc cd, Power power) {
        this.cd = cd;
        this.power = power;
        System.out.println("多参数构造函数");
    }*/

 /*   @Autowired
    public void prepare(CompactDisc cd,Power power){
        this.cd = cd;
        this.power = power;
        System.out.println("调用prepare方法");
    }*/

    public void play(){
        power.supply();
        if (cd != null) {
            cd.play();
        }
    }
}
