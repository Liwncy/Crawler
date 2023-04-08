package com.codefishing.crawler;

import com.codefishing.crawler.task.TestJobProcessor;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyWebControllerApplicationTests {

    @Autowired
    private TestJobProcessor testJobProcessor;

    @Test
    void contextLoads() {
    }

    @Test
    public void runCrawler() {
        this.testJobProcessor.start(testJobProcessor);
    }

}
