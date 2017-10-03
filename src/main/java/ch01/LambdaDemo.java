package ch01;

import org.junit.Test;

/**
 * 功能描述
 *
 * @author OyJim
 * @date 2017/10/2 11:29
 * @since V1.0
 */
public class LambdaDemo {

    @Test
    public void test1() {
        Runnable runnable = () -> System.out.println("hello");
        runnable.run();
    }
}
