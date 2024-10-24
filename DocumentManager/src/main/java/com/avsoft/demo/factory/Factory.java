package com.avsoft.demo.factory;

import com.avsoft.demo.service.DocumentService;
import com.avsoft.demo.service.ExcelServiceImpl;
import com.avsoft.demo.service.PdfServiceImpl;

public class Factory {

	public static DocumentService createObject(String type) {

		if (type.equals("excelServiceImpl")) {
			ExcelServiceImpl excelServiceImpl = new ExcelServiceImpl();

			return excelServiceImpl;
		}

		if (type.equals("pdfServiceImpl")) {
			PdfServiceImpl pdfServiceImpl = new PdfServiceImpl();
			return pdfServiceImpl;
		}

		return null;

	}

}
