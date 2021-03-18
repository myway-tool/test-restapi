package kr.co.test.mytools;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TestRestapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestRestapiApplication.class, args);
	}

//    @Bean
//    public ApplicationListener<ApplicationReadyEvent> readyEventApplicationListener(){
//		int port = 8080;
//        return new ApplicationListener<ApplicationReadyEvent>() {
//            @Override
//            public void onApplicationEvent(ApplicationReadyEvent applicationReadyEvent) {
//            	try {
//            		new DiscardServer(port).run();
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//            }
//        };
//    }
}
