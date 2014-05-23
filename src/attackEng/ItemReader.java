package attackEng;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ItemReader {

	private int numValues = 5;
	private InputStream inputStr = null; 
    private InputStreamReader inputStrRead = null;
    private BufferedReader buffReader = null;
    private String textPath = "Resources/Items.txt";
    
    private StringBuilder buffInput = new StringBuilder();
	private static String[] split = new String[200];
	private static String[][] twoD = null;
	
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
	       inputStringTo2D();
	       
	    } catch(Exception e) {
	    	System.out.println("ERROR ItemReader Class");
	    	e.printStackTrace();
	    } finally {
	       
	       if(inputStr!=null)
	          inputStr.close();
	       if(inputStrRead!=null)
	          inputStrRead.close();
	       if(buffReader!=null)
	          buffReader.close();
	    }    
	    //System.out.println(getAItems());
    }
	
	public void inputStringTo2D() {
	    String input = buffInput.toString();
		split = input.split(",");
		
		twoD = new String[getAItems()][getAItems()];
		
		for (int i = 0; i < getAItems(); i++) {
			for (int a = 0; a < 5; a++) {
				twoD[i][a] = split[(i*5)+a];
				System.out.print(split[(i*5)+a]);
			}
			System.out.println();
		}
	}
	
	public int getAItems() {
		//System.out.println(split.length);
		return split.length/numValues;
	}
	
	public static String getResultStr(int item, int value) {
		String out = twoD[item][value].trim();
		return out;
	}
	
	public static int getResultInt(int item, int value) {
		return Integer.parseInt(getResultStr(item,value));
	}
}
