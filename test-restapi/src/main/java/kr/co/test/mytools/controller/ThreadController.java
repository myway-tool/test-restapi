package kr.co.test.mytools.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.co.test.mytools.service.ThreadService;

@Controller
@RequestMapping("/thread")
public class ThreadController {

    @Autowired
    private ThreadService threadService;


    @GetMapping({"", "/"})
    public String test() {

        int reqCount = 300;

        int loopCnt = reqCount / 30;
        int remainCnt = reqCount % 30;

//        for(int i = 0; i < 300; i++) {
        for(int i = 0; i < 30; i++) {
            String message = "test msg " + i;
            try {
                threadService.thread_method(message);

//                Future<String> result = threadService.thread_method(message);
//                System.out.println(result.get());

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return "docmain";
    }


    private void runExe() {

    }
}
