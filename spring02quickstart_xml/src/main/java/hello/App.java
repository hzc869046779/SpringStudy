package hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName App
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/20 17:40
 * @Version 1.0
 */


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("app");
//        MessagePrinter printer = new MessagePrinter();
//        MessageService service  = new MessageService();
//
//        printer.setService(service);
//        printer.printMessage();

        // 初始化Spring容器  通过XML文件初始化
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // 从容器中获取MessagePrinter对象
        MessagePrinter printer = context.getBean(MessagePrinter.class);
        // 从容器中获取MessageService对象
        //MessageService service = context.getBean(MessageService.class);

        System.out.println(printer);
        //System.out.println(service);

        printer.printMessage();

    }
}
