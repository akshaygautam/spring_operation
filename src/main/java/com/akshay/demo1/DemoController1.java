package com.akshay.demo1;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController1 {
	@Autowired
	private DemoRepo1 demoRepo1;
	
	@GetMapping(value = "/hey")
	public ResponseEntity<List> getListHey(){
		List<DemoDTO> a = demoRepo1.findAll();
		a.add(demoRepo1.getDemoSuper());
		return new ResponseEntity<List>(a, HttpStatus.OK);
	}
	
	@PostMapping(value ="/save")
	public ResponseEntity saveDemo(@RequestBody DemoDTO dto){
		DemoDTO saved = demoRepo1.save(dto);
		try {
			if(true)
			throw new RuntimeException();
		}catch(RuntimeException e){
			return new ResponseEntity<>("Heyman this sucks",HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<DemoDTO>(saved, HttpStatus.CREATED);
	}
	
}
