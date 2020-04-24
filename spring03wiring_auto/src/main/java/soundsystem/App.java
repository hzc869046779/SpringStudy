package soundsystem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;

/**
 * @ClassName App
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/22 0:04
 * @Version 1.0
 */


public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        CDPlayer cdPlayer = context.getBean(CDPlayer.class);
        cdPlayer.play();
    }
}
