package com.codefishing.crawler.controller;

import com.codefishing.crawler.task.TestJobProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.websocket.server.ServerEndpoint;

/**
 * @description 爬虫项目启动Web端页面逻辑
 */
@RestController
@ServerEndpoint("/websocket")
public class MyWebController {

    @Autowired
    private TestJobProcessor testJobProcessor;

    @PostMapping("/run")
    public void runCrawler() {
        this.testJobProcessor.start(testJobProcessor);
    }

}
