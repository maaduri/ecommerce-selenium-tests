package com.apex.ecommerce.signon.test;

import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.apex.ecommerce.core.ApexBaseTest;
import com.apex.ecommerce.signon.constant.SiononConstant;
import com.apex.ecommerce.signon.page.SignonPage;

public class SignonTest extends ApexBaseTest implements SiononConstant{
	
	@Test(dataProvider = "TestData")
	public void testLoginWithDataDriven(String email,String password) throws InterruptedException
	{
		SignonPage signonPage = new SignonPage(driver);
		//perform the action
	    signonPage.clickonLoginBtn(email, password);
		Thread.sleep(2000);
	}
	
	
	
	
	
	
	/*@Test
	public void testwithInvalidCharacters() throws InterruptedException
	{
        SignonPage signonPage = new SignonPage(driver);
		//perform the action
        Thread.sleep(1000);
	    signonPage.clickonLoginBtn("", "");
	    Thread.sleep(2000);
	   
		
	}
	@Test
	public void testwithBlankUserId() throws InterruptedException
	{
       SignonPage signonPage = new SignonPage(driver);
	   //perform the action
       Thread.sleep(1000);
	   signonPage.clickonLoginBtn("", "arun123");
	   Thread.sleep(2000);
	    
		
	}
	@Test
	public void testwithBlankPassword() throws InterruptedException
	{
       SignonPage signonPage = new SignonPage(driver);
	   //perform the action
      
	   signonPage.clickonLoginBtn("arun@yahoo.com", "");
	   Thread.sleep(1500);
	   
	}
	
	@Test
	public void testwithBeyondthelimitCharcatets() throws InterruptedException
	{
      SignonPage signonPage = new SignonPage(driver);
	  //perform the action
     
	   signonPage.clickonLoginBtn("uyityt984utt984uthrj9843yfh9f8y34h9r38y4fh49y4yfy3fy", "");
	   Thread.sleep(1500);
	}*/
	
	 @DataProvider(name= "TestData")
	    public Object[][] getData()
	    {
	    	String[][] data = readfromSpreadSheet("LoginData.xls","Sheet1","EcommerceLogin");
	    	return data;
	    }
		
		 private String[][] readfromSpreadSheet(String xlFilePath, String sheetName,String tableName) {
			        // TODO Auto-generated method stub
			        String[][] tabArray=null;
			        try{
		            Workbook workbook = Workbook.getWorkbook(new File(xlFilePath));
		            Sheet sheet = workbook.getSheet(sheetName);
		            int startRow,startCol, endRow, endCol,ci,cj;
		            System.out.println(sheet.getName());
		            
		            Cell tableStart=sheet.findCell(tableName);
		            startRow=tableStart.getRow();
		            startCol=tableStart.getColumn();

		            Cell tableEnd= sheet.findCell(tableName, startCol+1,startRow+1, 100, 64000,  false);                               

		            endRow=tableEnd.getRow();
		            endCol=tableEnd.getColumn();
		            System.out.println("startRow="+startRow+", endRow="+endRow+", " +
		                    "startCol="+startCol+", endCol="+endCol);
		            tabArray=new String[endRow-startRow-1][endCol-startCol-1];
		            ci=0;

		            for (int i=startRow+1;i<endRow;i++,ci++){
		                cj=0;
		                for (int j=startCol+1;j<endCol;j++,cj++){
		                    tabArray[ci][cj]=sheet.getCell(j,i).getContents();
		                }
		            }
			        }//end try
		          
		            catch (Exception e)    {
                    System.out.println("error in getTableArray()");
                    e.printStackTrace();
                    }

            return(tabArray);
		 }
	
	
	
}
