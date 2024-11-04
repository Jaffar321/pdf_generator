package com.pdfGenerator;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.pdfGenerator.utility.PdfGenerator;

@SpringBootTest
class PdfGeneratorExampleApplicationTests {

	@Test
	void contextLoads() {
		PdfGenerator pdf1=new PdfGenerator();
		pdf1.writeUsingIText();
	}

}
