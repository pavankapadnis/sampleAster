package com.framework.keyword;

import org.testng.annotations.Test;

public class FrameworkTestCases {
	
	@Test
	public void demoTest() {
		
		Allkeyword.openBrowser("chrome");
		Allkeyword.openUrl("file:///F:/Selenium%20Html/ExcelSheetValueInForm.html");
		Allkeyword.cssOrvalue("input#fname","Pavan");
		Allkeyword.cssOrvalue("input#lname","Kapadnis");
		Allkeyword.click("input#male");
		Allkeyword.selectValue("select#country","India");
		Allkeyword.cssOrvalue("input#age","28");
		Allkeyword.cssOrvalue("input#date","09/03/1994");
		Allkeyword.cssOrvalue("input#emid","3585");
		Allkeyword.cssOrvalue("input#myFile","F:\\FB_IMG_1596948781867.jpg");
		Allkeyword.selectValue("select#country","Great Britain");
		//Allkeyword.click("input[value='Reset']");
	}
	
	
}
