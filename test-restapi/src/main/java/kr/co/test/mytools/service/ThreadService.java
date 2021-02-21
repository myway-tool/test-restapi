package kr.co.test.mytools.service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ThreadService{


//    @Async("threadPoolTaskExecutor")
//    public Future<String> thread_method(String message) throws Exception {
//        // do
////        for(int i=0; i < 1000; i++) {
////            log.info(message);
////        }
//        log.info(message);
//
////        Thread.sleep(3000);
//
//        return new AsyncResult<String>("[Success]" + message);
//    }

    @Async("threadPoolTaskExecutor")
    public void thread_method(String message) throws Exception {
        // do
//        for(int i=0; i < 1000; i++) {
//            log.info(message);
//        }
//    	Logger.info(message);
//        log.info(message);

//        Thread.sleep(3000);

//        return new AsyncResult<String>("[Success]" + message);
    }
}
