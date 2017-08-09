package com.youbang.crawler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/8/9.
 */
@Component
public class MessageTask {
    private static final Logger LOGGER =  LoggerFactory.getLogger(MessageTask.class);
    @Scheduled(fixedRate=2000)  // 每隔2秒执行一次
    public void test(){

        LOGGER.info("我是定时任务");
    }
}
