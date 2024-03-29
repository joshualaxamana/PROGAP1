package demo;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class PDFGenerateDemo {

	public static void main(String[] args) 
		throws Exception {
	
		Document document = new Document();
		String date = new SimpleDateFormat("yyyyMMMMddmmss").format(new Date());
		PdfWriter.getInstance(document,
		 new FileOutputStream("D:\\" + date + "mysamplefile.pdf"));
		
		document.open();
	    Paragraph paragraph = new Paragraph();
	    
	    paragraph.add("Hello World\n");
	    paragraph.add("PDF sample generation demo\n");
	    paragraph.add("programmed by Josh Laxamana\n");
	    paragraph.add("DLS-CSB is a wonderful school. "
	    	+ "I will miss you and hope "
	    	+ "to see you again.\n\n");
	    
	    //adding Image
	    Image csbImage = 
	    	Image.getInstance("d:\\dls-csb.png");
	    
	    document.add(paragraph);
	    document.add(csbImage);
	    document.close();
	}
}
