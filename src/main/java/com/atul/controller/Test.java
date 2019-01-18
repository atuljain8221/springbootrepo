package com.atul.controller;

import java.io.PrintWriter;
import java.io.StringWriter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.atul.DemoDaoImpl;
import com.atul.entity.Tblbidsubfinal;

@Controller
public class Test {

	
	@Autowired
	private DemoDaoImpl demoDaoImpl;
	
	  private static final Logger LOGGER = LogManager.getLogger(Test.class.getName());
	@RequestMapping(value="/")
	public String getData() throws Exception{
		Tblbidsubfinal pojo=new Tblbidsubfinal();
		pojo.setBidderid("aa");
		pojo.setBidsubfinalid(654);
		pojo.setFinalstatus("1");
		pojo.setTenderid(5);
		//Integer i=10/0;
		LOGGER.error("this is the error");
		//throw new Exception();
		//demoDaoImpl.updateData(pojo);
		//System.out.println("jjjjjjjjjjjjkkkkkkkkkkkkkkkkkklllllllllllllllll");
	return "index";
		
	}
	
	
	@RequestMapping(value="/myData")
	public String getDataa() throws Exception{
		
		LOGGER.error("this is the error");
		try{
			Tblbidsubfinal pojo=new Tblbidsubfinal();
			pojo.setBidderid("aa");
			pojo.setBidsubfinalid(654);
			pojo.setFinalstatus("1");
			pojo.setTenderid(5);
			Integer i=10/0;
		}catch(Exception e){
			e.printStackTrace();
			System.out.println(e.getStackTrace()[0].getLineNumber());
			StringWriter sWriter = new StringWriter();
		    PrintWriter pWriter = new PrintWriter(sWriter);
		    e.printStackTrace(pWriter);
		    LOGGER.error("line no ;  "+e.getStackTrace()[0].getLineNumber());
			LOGGER.error("some oops string "+sWriter.toString());
		}
		
		//throw new Exception();
		//demoDaoImpl.updateData(pojo);
		//System.out.println("jjjjjjjjjjjjkkkkkkkkkkkkkkkkkklllllllllllllllll");
	return "index";
		
	}
}
