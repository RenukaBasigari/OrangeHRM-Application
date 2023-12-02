package com.WebTable;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import net.bytebuddy.implementation.bytecode.ByteCodeAppender.Size;

public class WebTable_DynamicTable extends BaseTest {
	
	public void CapturingCompleteWebTableData ()
	{
		//To go to everyrow
		
		///html/body/div[5]/section[1]/div/section/div[1]/div/table
		
	By	WebTableProperty=By.xpath("/html/body/div[5]/section[1]/div");
WebElement	WebTable=renuka.findElement(WebTableProperty);

//Row identified tag name=tr

       By rowProperty =By.tagName("tr");
       
            List<WebElement>rows =WebTable.findElements(rowProperty);
            
            for(int rowindex=0;rowindex<rows.size();rowindex++)
            {
       WebElement  WebTableRow  = rows.get(rowindex);
       
       //
       //identifying the Number Of Cells in the WebTable tagname=td
       
    By  rowofcellProperty =By.tagName("td");
    
    
List<WebElement>rowofCells =WebTableRow.findElements(rowofcellProperty);

     for(int rowofcellindex=0;rowofcellindex<rowofCells.size();rowofcellindex++)
     {
    WebElement	rowofCell=rowofCells.get(rowofcellindex);
    
         String data=rowofCell.getText();
         System.out.print(data+" | ");
    
    
     }
     
     System.out.println();
     
            }
            
            
	
	}
	public static void main(String[] args) {
		WebTable_DynamicTable webTable=new WebTable_DynamicTable();
		webTable.ApplicationLaunch();
		webTable.CapturingCompleteWebTableData();
		
		
	}

}
