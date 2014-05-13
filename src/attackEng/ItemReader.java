package attackEng;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ItemReader {

	InputStream inputStr = null; 
    InputStreamReader inputStrRead = null;
    BufferedReader buffReader = null;
    String textPath = "src/attackEng/text.txt";
    ByteArrayOutputStream bao = new ByteArrayOutputStream();
    
    StringBuilder buffInput = new StringBuilder();
	String[] split = new String[200];
	
	private String value;

    public ItemReader() throws IOException {
    	
	    try{
	       inputStr = new FileInputStream(textPath);
	       inputStrRead = new InputStreamReader(inputStr);
	       buffReader = new BufferedReader(inputStrRead);
	    
	       

	       while((value = buffReader.readLine()) != null)
	       {
	    	   
		          buffInput.append(value);
		  	      System.out.println(value);
	       }
	       inputToString();
	       
	    } catch(Exception e) {
	    	System.out.println("ERROR");
	    	e.printStackTrace();
	    } finally {
	       
	       if(inputStr!=null)
	          inputStr.close();
	       if(inputStrRead!=null)
	          inputStrRead.close();
	       if(buffReader!=null)
	          buffReader.close();
	    }    
	    getLengthString();
    }
    
	private void inputToString() {
	    String input = buffInput.toString();
	    //System.out.println(input);
		split = input.split(",");
		
	}
	
	public int getLengthString() {
		System.out.println(split.length);
		return split.length;
	}
	
	public String getResult(int item, int value) {
		int actualItem = 4*item + value;
		//System.out.println(actualItem);
		//for(int x=0;x<getLengthString();x++){
			//System.out.println(split[x]);
		//}

		return split[actualItem];
	}
}
