import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class Test1 
{
	private static Scanner sc1;
	public static void main(String[] args) throws IOException
	{
	
	
		sc1 = new Scanner(System.in);
		System.out.println("Enter name of Dictionary");
	   	   String f1=sc1.next();
	   	   File f=new File(f1);
	   	  
	   	  
		
		
	   	File file4=new File("H:/Dictionary/"+f+".txt");
	   
	   		
		   	
		   	File tempFile = new File(file4+".txt");
		  
		   	BufferedWriter Pwr = new BufferedWriter(new FileWriter (tempFile));
		   	
		   	BufferedReader br = new BufferedReader(new FileReader(file4));
		   	System.out.println("Enter word to remove");
			
			   Scanner sc1=new Scanner(System.in);
			   	String syl=sc1.next();
		   	testing(syl, br,Pwr,file4,tempFile);
	   	/*System.out.println(file4.delete());
	   
	   	if(tempFile.renameTo(file4))
	   	{
	        System.out.println("Update succesful");
	    }
	   	else
	   	{
	        System.out.println("Update failed");
	    
	    }*/
	
	   	
	  }
	public static void testing(String syl,BufferedReader br, BufferedWriter Pwr, File file4, File tempFile) throws IOException
	{
		
			
		String stringc;
		String lin;
		while((lin=br.readLine())!=null)
	   	{
	   		String inn= lin;
	   		
	   		String[] wordo =inn.split("=");
	   		stringc = wordo[0];

	   		
	   		if(stringc.equals(syl))
	   		{
	   			continue;
	   		}
	   		else
	   		{
	   			Pwr.newLine();
	   			System.out.println(lin);
	   			Pwr.write(lin);
	   			
	           
	   		}
	   		
	   	}
	   
		br.close();
        br = null;
        Pwr.flush();
        Pwr.close();
        Pwr = null;
        System.gc();
	  
	   	
	
	 
	}
}