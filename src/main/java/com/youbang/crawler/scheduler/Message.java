package com.youbang.crawler.scheduler;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/9.
 */
@Component
public class Message {
    private static final Logger LOGGER =  LoggerFactory.getLogger(Message.class);
    @Scheduled(cron = "0/5 * * * * ?")
    public void msg(){
        LOGGER.info("我是定时任务2");
    }
}
