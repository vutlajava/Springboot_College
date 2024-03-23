package com.psira.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.psira.model.College;

@RestController
@RequestMapping("/college")
public class CollegeController {
	
	private static Logger logger = LoggerFactory.getLogger(CollegeController.class);
	
	
	@GetMapping("{collegeId}")
	public ResponseEntity<College> getCollegeDetails(@PathVariable("collegeId") Long collegeId)       {
		
		logger.debug("Debug level - Hello Logback {}", collegeId);

        logger.info("Info level - Hello Logback {}", collegeId);
        
        logger.error("Error level - Hello Logback {}", collegeId);

		
		College college = new College(1L,"Kakatiya College Of Computer Science","Hunter Road");
		
		return new ResponseEntity<College>(college,HttpStatus.OK);
		
		
		
	}
	
	

}
