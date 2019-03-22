import org.testng.Assert;
import org.testng.annotations.Test;

public class HelloServiceTest {

    HelloService helloService = new HelloService();

    @Test
    void testSayHello(){
        Assert.assertEquals(helloService.sayHello(),"hello world!");
    }
}
