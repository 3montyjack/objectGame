package envEng;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MazeReader {

	InputStream inputStr = null; 
    InputStreamReader inputStrRead = null;
    BufferedReader buffReader = null;
    String textPath = "src/envEng/text.txt";
    ByteArrayOutputStream bao = new ByteArrayOutputStream();
    
    private int max = 2000;
    private byte[] val = new byte[max];
	private String[][] result;
    
    int i = 0;
    

    public MazeReader() throws IOException {
    	
	    try{
	       inputStr = new FileInputStream(textPath);
	       inputStrRead = new InputStreamReader(inputStr);
	       buffReader = new BufferedReader(inputStrRead);
	    
	       int value=0;
	       
	       // reads to the end of the stream 

	       int a = 0;
	       while((value = buffReader.read()) != -1)
	       {
	    	   
		          val[a] = (byte) value;
		          a++;
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
	    inputTo2D();	    
	    
    }
    
	private void inputTo2D() {
	    String input = val.toString();
		String[] split = input.split(";");
		int size = split.length;
		result = new String [size][];
		
		
		int count = 0;
		for (String line : split) {
			result[count] = line.split(":");
			count++;
			
		}
	}
	
	public String getResult(int item, int value) {
		return result[item][value];
	}
}
