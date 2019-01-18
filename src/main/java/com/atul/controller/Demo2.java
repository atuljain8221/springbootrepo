package com.atul.controller;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.tool.xml.XMLWorkerHelper;

public class Demo2 {
	public static void main(String[] args) {
		try {
			OutputStream file = new FileOutputStream(new File("D:/HTMLtoPDF.pdf"));
			Document document = new Document();
			PdfWriter writer = PdfWriter.getInstance(document, file);
			StringBuilder htmlString = new StringBuilder();
			htmlString.append(new String(
					"<html><head> <meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\" />"));
					htmlString.append("<style>");
					htmlString.append("table, th, td {");
					htmlString.append("    border: 1px solid black;");
					htmlString.append("    border-collapse: collapse;");
					htmlString.append("    font-family: Helvetica, arial, sans-serif;");
					htmlString.append("    font-size: 13px;");
					htmlString.append("}");
					htmlString.append("th, td {");
					htmlString.append("    padding: 5px;");
					htmlString.append("	width: 50%;");
					htmlString.append("}");
					htmlString.append("th {");
					htmlString.append("    text-align: left;");
					htmlString.append("}");
					htmlString.append("table + table {");
					htmlString.append("    page-break-before: always;");
					htmlString.append("}");
					htmlString.append("</style>");
					htmlString.append("</head><body> This is HMTL to PDF conversion Example<table border='2' align='center'> ");
			htmlString.append(new String(
					"<tr><td>अंग्रेजी का आसमान</td><td>अंग्रेजी का आसमान</td></tr>"));
			htmlString.append(new String(
					"<tr> <td> Google Here </td> <td><a href='www.google.com'>Google</a> </td> </tr></table></body></html>"));

			document.open();
			InputStream is = new ByteArrayInputStream(htmlString.toString().getBytes(StandardCharsets.UTF_8));
			XMLWorkerHelper.getInstance().parseXHtml(writer, document, is);
			document.close();
			file.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
