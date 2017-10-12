package data.ribbon;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.ribbon.proxy.annotation.Hystrix;
/**
 * 
 * @author dongtl
 *
 */
@RestController
@RequestMapping("/test")
public class testRibbon {

    @RequestMapping("/test")  
    public String testRibbon() {
        return "testRibbon1";  
    }  
}
