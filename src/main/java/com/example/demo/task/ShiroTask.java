package com.example.demo.task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * desc:
 * author:yangzhou
 * date:2019/9/17 10:26
 */
@Component
public class ShiroTask {
    private Logger logger = LoggerFactory.getLogger(ShiroTask.class);
    public void taskExecute() {
        try {
            System.out.println(new Date() + "测试定时任务,当前线程名=" + Thread.currentThread().getName());
//            int a = 3/0;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
        }

    }
}
