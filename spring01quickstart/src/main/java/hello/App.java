package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @ClassName App
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/20 17:40
 * @Version 1.0
 */

@ComponentScan
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("app");
//        MessagePrinter printer = new MessagePrinter();
//        MessageService service  = new MessageService();
//
//        printer.setService(service);
//        printer.printMessage();

        // 初始化Spring容器
        ApplicationContext context = new AnnotationConfigApplicationContext(App.class);

        // 从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // 从容器中获取MessageService对象
        //MessageService service = context.getBean(MessageService.class);

        System.out.println(printer);
        //System.out.println(service);

        printer.printMessage();

    }
}
