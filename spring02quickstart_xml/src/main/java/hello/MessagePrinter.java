package hello;


/**
 * @ClassName MessagePrinter
 * @Description TODO
 * @Author hzc
 * @Date 2020/4/20 17:39
 * @Version 1.0
 */


public class MessagePrinter {

    public MessagePrinter(){
        super();
        System.out.println("Messageprinter");
    }


    private MessageService service;

    public void setService(MessageService service) {
        this.service = service;
    }

    public void printMessage(){
        System.out.println(this.service.getMessage());
    }
}

