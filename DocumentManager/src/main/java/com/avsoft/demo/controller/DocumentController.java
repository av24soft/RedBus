package com.avsoft.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.avsoft.demo.factory.Factory;
import com.avsoft.demo.service.DocumentService;
import com.avsoft.demo.service.ExcelServiceImpl;

@RestController
public class DocumentController {
	
	
	@Autowired
	ApplicationContext a;
	

	@GetMapping("/print/{type}")
	public String pritntDocument(@PathVariable("type") String type )
	{
		DocumentService documentService = (DocumentService) a.getBean("excelServiceImpl");
		documentService.readData();
		documentService.processData();
		documentService.printData();
		
		System.out.println("hiiiiiiiiii");
		return "done";
		
	}
	
	
	
}
