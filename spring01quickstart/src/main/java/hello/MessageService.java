package hello;

import org.springframework.stereotype.Component;

/**
 * @ClassName MessageService
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/20 17:35
 * @Version 1.0
 */

@Component
public class MessageService {

    public MessageService(){
        super();
        System.out.println("MessageService");
    }
    public String getMessage(){
        return "hello world";
    }


}
