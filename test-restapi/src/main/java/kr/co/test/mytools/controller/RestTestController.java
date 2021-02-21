package kr.co.test.mytools.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import kr.co.test.mytools.external.ResponseMessage;

@RestController
public class RestTestController {

	@GetMapping({"", "/"})
    public ResponseEntity<ResponseMessage> helloWorld() {
//        return String.format("%s %s", mapper.selectName(), LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		String message = "test";
	    try {
//	      storageService.save(file);

//	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	    } catch (Exception e) {
//	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	    }
    }
}
