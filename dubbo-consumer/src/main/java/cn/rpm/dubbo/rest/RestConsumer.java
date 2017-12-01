package cn.rpm.dubbo.rest;

import cn.rpm.dubbo.service.DemoService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
/**
 * Created by renpiming on 2017/11/4.
 */

@Service(protocol="rest")
@Path("/restService")
@Consumes({ MediaType.APPLICATION_JSON })
@Produces({ MediaType.APPLICATION_JSON })
public class RestConsumer {

    @Autowired
    private DemoService providerService;

    @Path("/getMsg")
    @GET
    public String rest() {
        String str = providerService.sayHello("resthello");
        System.out.println(str);
        return str;
    }


}
