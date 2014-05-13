package attackEng;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ItemReader {

	InputStream inputStr = null; 
    InputStreamReader inputStrRead = null;
    BufferedReader buffReader = null;
    String textPath = "src/attackEng/text.txt";
    
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
		  	      //System.out.println(value);
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
    }
    
	private void inputToString() {
	    String input = buffInput.toString();
		split = input.split(",");
		
	}
	
	public int getLengthString() {
		//System.out.println(split.length);
		return split.length;
	}
	
	public String getResult(int item, int value) {
		int actualItem = (4*item)-4+value-1;
		String out = split[actualItem].trim();
		return out;
	}
}
