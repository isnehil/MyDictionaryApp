import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.*;

public class TimeTest 
{
	private static BufferedReader br;
	private static Scanner sc1;

	public static void main(String[] args) throws IOException
	{
		sc1 = new Scanner(System.in);
		System.out.println("Enter name of dictionary");
		String frname;
		frname=sc1.next();
		File fer=new File("C:/Dictionary/"+frname+".txt");
		br = new BufferedReader(new FileReader(fer));
		String inr;
		TreeSet<String> tr=new TreeSet<String>();
		
		while((inr=br.readLine())!=null)
		{
			
			String[] str_array = inr.split("=");
			String stringa = str_array[0];
			tr.add(stringa);
			TimeTest.getCurrentTimeStamp(stringa);
		}
		System.out.println(tr);
	}

	public static String getCurrentTimeStamp(String a) 
	{
	    SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
	}
}