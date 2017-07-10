package com.mosaic.async;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * Created by 刘亚飞 on 2017/7/6.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class AsyncTaskTest {

    private static final Logger logger = LoggerFactory.getLogger(AsyncTaskTest.class);

    @Autowired
    private AsyncTask asyncTask;

    @Test
    public void AsyncTaskTest() throws InterruptedException, ExecutionException {
        Future<String> task1 = asyncTask.doTask1();
        Future<String> task2 = asyncTask.doTask2();

        while (true) {
            if (task1.isDone() && task2.isDone()) {
                logger.info("Task result: {]", task1.get());
                logger.info("Task result: {}", task2.get());
                break;
            }
            Thread.sleep(1000);
        }
        logger.info("All tasks finished");
    }
}
