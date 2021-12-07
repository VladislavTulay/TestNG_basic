package multythread;

import org.testng.annotations.Test;

public class ParallelTest {

        @Test(threadPoolSize = 6, invocationCount = 6, timeOut = 1000)
        public void testMethod()
        {
            Long id = Thread.currentThread().getId();
            System.out.println("Test method executing on thread with id: " + id);
        }


}
