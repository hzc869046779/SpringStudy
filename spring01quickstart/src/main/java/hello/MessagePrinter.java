package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @ClassName MessagePrinter
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/20 17:39
 * @Version 1.0
 */

@Component
public class MessagePrinter {

    public MessagePrinter(){
        super();
        System.out.println("Messageprinter");
    }

    @Autowired  //实现自动调用
    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}

