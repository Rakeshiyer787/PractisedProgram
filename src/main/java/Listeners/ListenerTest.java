package Listeners;

import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(CustomListenersTest.class)
public class ListenerTest {
@Test
    public void test1() {
        System.out.println("This my first test");
        Assert.assertEquals("A","A");
    }
    @Test
    public void test2() {
        System.out.println("This my second test");
        Assert.assertEquals("A","B");
    }
    @Test
    public void test3() {
        System.out.println("This my third test");
        throw new SkipException("This is skip expection");
    }
}

