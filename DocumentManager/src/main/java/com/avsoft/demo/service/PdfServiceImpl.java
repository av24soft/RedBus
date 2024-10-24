package com.avsoft.demo.service;

import org.springframework.stereotype.Service;

@Service
public class PdfServiceImpl implements DocumentService {

	@Override
	public void readData() {

		System.out.println("read data from db");
	}

	@Override
	public void processData() {

		System.out.println("process data for pdf");

		
	}

	@Override
	public void printData() {

		System.out.println("pritn data for pdf");
	}

}
