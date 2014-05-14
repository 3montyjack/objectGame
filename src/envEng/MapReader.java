package envEng;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MapReader {

	private InputStream inputStr = null; 
    private InputStreamReader inputStrRead = null;
    private BufferedReader buffReader = null;
    private String textPath = "src/envEng/text.txt";
    
    private StringBuilder buffInput = new StringBuilder();
	private static String[] split = new String[251];
	private static String[][] twoD = null;
	private int mapWidth = 26;
	private String value;

    public MapReader() throws IOException {
    	
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
	    //System.out.println(getAItems());
    }
	
	public void inputStringTo2D() {
	    String input = buffInput.toString();
		split = input.split("\\s+");
		
		twoD = new String[1500][1000];
		
		for (int i = 0; i < getAItems(); i++) {
			for (int a = 0; a < mapWidth; a++) {
				twoD[i][a] = split[(i*4)+a];
				System.out.print(split[(i*4)+a]);
			}
			System.out.println();
		}
	}
	
	public int getAItems() {
		//System.out.println(split.length);
		return split.length;
	}
	
	public static int checkType(int x, int y) {
		return Integer.parseInt(twoD[x][y]);
	}
}
