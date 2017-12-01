package cn.rpm.dubbo.service;

/**
 * Created by renpiming on 2017/11/3.
 */
public class DemoServiceImpl2 implements DemoService {

    public String  sayHello(String msg) {
        return "provider method result :" +msg +" come DemoServiceImpl2! " ;
    }
}
