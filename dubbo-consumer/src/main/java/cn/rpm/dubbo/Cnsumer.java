package cn.rpm.dubbo;


import cn.rpm.dubbo.service.DemoService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by renpiming on 2017/11/3.
 */
public class Cnsumer {

    public static void main(String[] args) {

        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                new String[] {"consumer.xml"});
        context.start();

        DemoService demoService = (DemoService) context.getBean("demoService"); // obtain proxy object for remote invocation
        String hello = demoService.sayHello("world"); // execute remote invocation
        System.out.println(hello); // show the result
    }
}
