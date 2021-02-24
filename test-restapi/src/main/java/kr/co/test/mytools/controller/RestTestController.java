package kr.co.test.mytools.controller;

import java.util.LinkedHashMap;

import javax.validation.Valid;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import kr.co.test.mytools.external.LoginForm;
import kr.co.test.mytools.external.ResponseMessage;

@RestController
public class RestTestController {

	@GetMapping({"", "/"})
    public ResponseEntity<ResponseMessage> helloWorld() {
//        return String.format("%s %s", mapper.selectName(), LocalDateTime.now().format(DateTimeFormatter.ISO_LOCAL_DATE_TIME));

		String message = "test한글";
	    try {
//	      storageService.save(file);

//	      message = "Uploaded the file successfully: " + file.getOriginalFilename();
	      return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage(message));
	    } catch (Exception e) {
//	      message = "Could not upload the file: " + file.getOriginalFilename() + "!";
	      return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new ResponseMessage(message));
	    }
    }


	@PostMapping(value = "/content", produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<ResponseMessage> postResponseJsonContent(
	  @RequestBody @Valid LoginForm loginForm) {

		return ResponseEntity.status(HttpStatus.OK).body(new ResponseMessage("JSON Content!"));
//	    return new ResponseTransfer("JSON Content!");
	}

    @PostMapping("/project/{nickname}/{title}/cloud/upload")
    public LinkedHashMap<String, Object> handleFileUpload(@PathVariable("nickname") String nickname,
            @PathVariable("title") String title,
            @RequestParam("file") MultipartFile file,
//                @CurrentUser Account account,
            RedirectAttributes redirectAttributes) {

//        // nickname과 projectTitle로 projectId 찾기
//        Long projectId = projectService.getProjectId(nickname, title);
//
//        uploadFileService.storeFile(file,projectId,account);
//        redirectAttributes.addFlashAttribute("message",
//                "You successfully uploaded " + file.getOriginalFilename() + "!");

        System.out.println("file:" + file.getName());

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("key01", "value01");

        return map;
    }

    @PostMapping(value = "/uploadfile", consumes = { MediaType.APPLICATION_JSON_VALUE,
            MediaType.MULTIPART_FORM_DATA_VALUE })
    public LinkedHashMap<String, Object> handleFileUpload(@RequestParam("file") MultipartFile file
//            , RedirectAttributes redirectAttributes
    ) {

        System.out.println("uploadfile-----------------------");

        String oriFileNm = file.getOriginalFilename();

        if (file == null) {
            System.out.println("file is null.!!!");
        } else {
            System.out.println("file is not null.!!!");
        }

//        File destinationFile = new File(context.getRealPath("/WEB-INF/uploaded" ) + File.separator + oriFileNm);
//        inputFile.transferTo(destinationFile );
//        headers.add("File Uploaded Successfully - ", oriFileNm);
//
//        fileInfo.setFileName(destinationFile .getPath());
//        fileInfo.setFileSize(inputFile .getSize());
//        return new ResponseEntity<FileInfo>(fileInfo , headers, HttpStatus.OK );

//        storageService.store(file);
//        redirectAttributes.addFlashAttribute("message","You successfully uploaded " + file.getOriginalFilename() + "!");

//        return "redirect:/";

        System.out.println(String.format("file name=%s", oriFileNm));

        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("key01", "value01");

        return map;
    }
}
