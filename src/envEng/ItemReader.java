package envEng;

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
    String textPath = "src/envEng/text.txt";
    ByteArrayOutputStream bao = new ByteArrayOutputStream();
    
    StringBuilder buffInput = new StringBuilder();
	String[] split = new String[12];
    
    int i = 0;
    

    public ItemReader() throws IOException {
    	
	    try{
	       inputStr = new FileInputStream(textPath);
	       inputStrRead = new InputStreamReader(inputStr);
	       buffReader = new BufferedReader(inputStrRead);
	    
	       int value=0;
	       
	       // reads to the end of the stream 

	       while((value = buffReader.read()) != -1)
	       {
	    	   
		          buffInput.append((char) value);
		  	      
	       }
	       
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
	    
	    inputToString();	    
	    
    }
    
	private void inputToString() {
	    String input = buffReader.toString();
		split = input.split(",");
		//String var = split[3];
	}
	
	public String getResult(int item, int value) {
		int actualItem = 4*item + value;
		return split[actualItem];
	}
}
