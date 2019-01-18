package com.atul.controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfWriter;

public class Demo {
	private static final String FILE_NAME = "D:/itext.pdf";
	public static void main(String[] args) {
	    Document document = new Document();

        try {
        	
        	String str="abc\\jdsgj\\sdhjkhksd\\sdhksdhk";
        	System.out.println(str);
        	System.out.println(str.substring(str.lastIndexOf("\\")+1));
        	//String[] str1=str.split("//\")
        	
		  PdfWriter.getInstance(document, new FileOutputStream(new File(FILE_NAME)));
		  BaseFont unicode = BaseFont.createFont("D:/Devanagari.ttf", 
			        BaseFont.IDENTITY_H,    BaseFont.EMBEDDED);
	 Font font=new Font(unicode,12,Font.NORMAL,new BaseColor(0,0,0));
	 font.setSize(8);
          //open
          document.open();

          Paragraph p = new Paragraph();
          p.setAlignment(Element.ALIGN_CENTER);

          document.add(p);

          Paragraph p2 = new Paragraph();
          p2.add("This is my paragraph 2"); //no alignment

          document.add(p2);

          Font f = new Font();
          f.setStyle(Font.BOLD);
          f.setSize(8);
          StringBuilder htmlString = new StringBuilder();
			htmlString.append(new String(
					"<html><head> <meta http-equiv='Content-Type' content='text/html; charset=utf-8' /></head><body> This is HMTL to PDF conversion Example<table border='2' align='center'> "));
			htmlString.append(new String(
					"<tr><td>अंग्रेजी का आसमान</td><td>अंग्रेजी का आसमान</td></tr>"));
			htmlString.append(new String(
					"<tr> <td> Google Here </td> <td><a href='www.google.com'>Google</a> </td> </tr></table></body></html>"));
          document.add(new Paragraph(htmlString.toString(), font));

          //close
          document.close();

          System.out.println("Done");
       
      } catch (FileNotFoundException | DocumentException e) {
          e.printStackTrace();
      } catch (IOException e) {
          e.printStackTrace();
      }

	}

}
