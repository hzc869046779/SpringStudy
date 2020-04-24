import com.hzcedu.demo.soundsystem.CompactDisc;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName ApplicationSpring
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/23 21:42
 * @Version 1.0
 */
public class ApplicationSpring {



    public static void main(String[] args) {

        System.out.println("app is running");

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext-constructor.xml");
        CompactDisc cd = context.getBean(CompactDisc.class);
        cd.play();




    }

}
