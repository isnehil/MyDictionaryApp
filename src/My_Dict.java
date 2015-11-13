import java.util.*;
import java.text.*;
import java.lang.*;
import java.io.*;

public class My_Dict
{
	private static Scanner sc2;
	private static Scanner sc3;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br=null;
		BufferedWriter bw=null;
		try
		{
			Scanner sc1=new Scanner(System.in);
			sc2 = new Scanner(System.in);
			sc3 = new Scanner(System.in);
			int choice=0;
			ArrayList<String> partOfSpeech=new ArrayList<String>();
            ArrayList<String> meaning=new ArrayList<String>();
            ArrayList<String> example=new ArrayList<String>();
            ArrayList<String> words=new ArrayList<String>();
			while(choice!=4)
			{
				System.out.println("Press 1 to create dictionary ");
				System.out.println("Press 2 to load dictionary");
				System.out.println("Press 3 to delete dictionary");
				System.out.println("Press 4 to exit");

				System.out.println("Enter your choice");
				validate(sc1);
				choice=sc1.nextInt();
				
				switch(choice)
				{
				case 1:System.out.println("Enter name of Dictionary");
				   	   String f1=sc1.next();
				   	   File f=new File(f1);
				   	   f.createNewFile();
				   	   bw=new BufferedWriter(new FileWriter("H:/Dictionary/"+f+".txt", true));
				   	   br=new BufferedReader(new FileReader("H:/Dictionary/"+f+".txt"));
				   	   if(check(f))
						   System.out.println("===");
					   else
						   System.out.println("Give valid name");
				   	   
				   	   int ch1=0;
					   
					   while(ch1!=6)
					   {
						   System.out.println("Press 1 to add a word");
						   System.out.println("Press 2 to edit");
						   System.out.println("Press 3 to remove");
						   System.out.println("Press 4 to list the words");
						   System.out.println("Press 5 to search a word");								   
						   System.out.println("Press 6 to go back");
	
						   System.out.println("Enter your choice");
						   validate(sc1);
						   ch1=sc1.nextInt();
						   
						   switch(ch1)
						   {
						   		case 1:System.out.println("Enter a word");
					   		       	   String word=sc1.next();
					   		       	   words.add(word);
					   		       	   
					   		       	   if(checkWord(word))
					   		       	   {
					   		       		   if(br.readLine()!=word)
					   		       		   {   	
						   		       		   int ch2=0;
						   		       		   while(ch2!=7)
					 						   {
						   		       			   
						   		       			   System.out.println("Press 1 if part of speech is noun");
					 							   System.out.println("Press 2 if part of speech is verb");
					 							   System.out.println("Press 3 if part of speech is adjective");
					 							   System.out.println("Press 4 if part of speech is adverb");
					 							   System.out.println("Press 5 if part of speech is pronoun");
					 							   System.out.println("Press 6 if part of speech is preposition");
					 							   System.out.println("Press 7 to go back");
					 							   
					 							   System.out.println("Enter your choice");
					 							   validate(sc1);
					 							   ch2=sc1.nextInt();
					 							   
					 							  switch(ch2)
					 							  {
					 							  case 1:System.out.println("Enter meaning for "+word+" (noun)");
		 							   			   		 String mn1=sc2.nextLine();
		 							   			   		 if(mn1==null)
		 							   			   		 {
		 							   			   			 System.out.println("Enter the meaning");
		 							   			   		 }
		 							   			   		 else
		 							   			   		 {
		 							   			   			 meaning.add(mn1);
		 							   			   			 partOfSpeech.add("noun");
		 							   			   		 }
		 							   			   		 System.out.println("Enter the example for "+word+" (noun) "+"and meaning "+mn1+":");
		 							   			   		 String ex1=sc2.nextLine();
		 							   			   		 if(ex1.contains(word))
		 							   			   			 example.add(ex1);
		 							   			   		 else
		 							   			   			 System.out.println("Give valid example");
					 								  
		 							   			   	  break;
					 							  case 2:System.out.println("Enter meaning for "+word+" (verb)");
								   			   		 	 String mn2=sc2.nextLine();
								   			   		 	 if(mn2==null)
								   			   		 	 {
								   			   		 		 System.out.println("Enter the meaning");
								   			   		 	 }
								   			   		 	 else
								   			   		 	 {
								   			   		 		 meaning.add(mn2);
								   			   		 		 partOfSpeech.add("verb");
								   			   		 	 }
								   			   		 	 System.out.println("Enter the example for "+word+" (verb) "+"and meaning "+mn2+":");
								   			   		 	 String ex2=sc2.nextLine();
								   			   		 	 if(ex2.contains(word))
								   			   		 		 example.add(ex2);
								   			   		 	 else
								   			   		 		 System.out.println("Give valid example");
					 								  break;
					 							  case 3:System.out.println("Enter meaning for "+word+" (adjective)");
								   			   		 	String mn3=sc2.nextLine();
								   			   		 	if(mn3==null)
								   			   		 	{
								   			   		 		System.out.println("Enter the meaning");
								   			   		 	}
								   			   		 	else
								   			   		 	{
								   			   		 		meaning.add(mn3);
								   			   		 		partOfSpeech.add("adjective");
								   			   		 	}
								   			   		 	System.out.println("Enter the example for "+word+" (adjective) "+"and meaning "+mn3+":");
								   			   		 	String ex3=sc2.nextLine();
								   			   		 	if(ex3.contains(word))
								   			   		 		example.add(ex3);
								   			   		 	else
								   			   		 		System.out.println("Give valid example");
					 								  break;
					 							  case 4:System.out.println("Enter meaning for "+word+" (adverb)");
								   			   		 	String mn4=sc2.nextLine();
								   			   		 	if(mn4==null)
								   			   		 	{
								   			   		 		System.out.println("Enter the meaning");
								   			   		 	}
								   			   		 	else
								   			   		 	{
								   			   		 		meaning.add(mn4);
								   			   		 		partOfSpeech.add("adverb");
								   			   		 	}
								   			   		 	System.out.println("Enter the example for "+word+" (adverb) "+"and meaning "+mn4+":");
								   			   		 	String ex4=sc2.nextLine();
								   			   		 	if(ex4.contains(word))
								   			   		 		example.add(ex4);
								   			   		 	else
								   			   		 		System.out.println("Give valid example");
					 								  break;
					 							  case 5:System.out.println("Enter meaning for "+word+" (pronoun)");
								   			   		 String mn5=sc2.nextLine();
								   			   		 if(mn5==null)
								   			   		 {
								   			   			 System.out.println("Enter the meaning");
								   			   		 }
								   			   		 else
								   			   		 {
								   			   			 meaning.add(mn5);
								   			   			 partOfSpeech.add("pronoun");
								   			   		 }
								   			   		 System.out.println("Enter the example for "+word+" (pronoun) "+"and meaning "+mn5+":");
								   			   		 String ex5=sc2.nextLine();
								   			   		 if(ex5.contains(word))
								   			   			 example.add(ex5);
								   			   		 else
								   			   			 System.out.println("Give valid example");
					 								  break;
					 							  case 6:System.out.println("Enter meaning for "+word+" (preposition)");
								   			   		 	String mn6=sc2.nextLine();
								   			   		 	if(mn6==null)
								   			   		 	{
								   			   		 		System.out.println("Enter the meaning");
								   			   		 	}
								   			   		 	else
								   			   		 	{
								   			   		 		meaning.add(mn6);
								   			   		 		partOfSpeech.add("preposition");
								   			   		 	}
								   			   		 	System.out.println("Enter the example for "+word+" (preposition) "+"and meaning "+mn6+":");
								   			   		 	String ex6=sc2.nextLine();
								   			   		 	if(ex6.contains(word))
								   			   		 		example.add(ex6);
								   			   		 	else
								   			   		 		System.out.println("Give valid example");
					 								  break;
					 							  case 7:System.out.println("");
					 								  break;
					 							  default:System.out.println("Enter inputs 1 to 7");
					 									break;  
					 								 
					 							  }
					 						   }
					   		       		   }
					   		       		   else
					   		       		   {
					   		       			   System.out.println("Enter anpther word");
					   		       		   }
					   		       	   }
					   		       	   else
					   		       	   {
					   		       		   System.out.println("Enter proper word");
					   		       	   }
					   		       	   Iterator<String> it1=partOfSpeech.iterator();
					   		       	   Iterator<String> it2=meaning.iterator();
					   		       	   Iterator<String> it3=example.iterator();
					   		       	   
                                    
                                   
					   		       	   while(it1.hasNext()&&it2.hasNext()&&it3.hasNext())
					   		       	   {
					   		       		   Object s=it1.next();
					   		       		   Object g=it2.next();
					   		       		   Object t=it3.next();
					   		       		   
					   		       		   bw.write(word+"="+s+":"+g+"::"+t+":::"+getCurrentTimeStamp());
					   		       		   bw.newLine();
					   		       		   
					   		       		   
					   		       		  
					   		       	   }
					   		       	   partOfSpeech.removeAll(partOfSpeech);
				   		       		   meaning.removeAll(meaning);
				   		       		   example.removeAll(example);
						   			
					   		       	   break;
						   		case 2:sc1 = new Scanner(System.in);
						   		sc2= new Scanner(System.in);
                    			
                    			File file5=new File("H:/Dictionary/"+f+".txt");
                    			System.out.println("Enter word to edit");
                    			String syll=sc2.next();
                    			String line;
                    			
                    			String stringb;
                    			br = new BufferedReader(new FileReader(file5));
                    			while((line=br.readLine())!=null)
                    			{
                    				String inn= line;
                    				
                    				String[] wordp =inn.split("=");
                    				stringb = wordp[0];
                    				String stringb2;
                    				int ch3=0;
					 			    if(stringb.equals(syll))
					 	            {
	                                    System.out.println(inn);
					 			    	while(ch3!=3)
		                                 {	
		                                		System.out.println("The word exsists");
		                                   		
		                                   		System.out.println("Press 1 to add part of speech/meaning/example");
		                               		    System.out.println("Press 2 to remove part of speech/meaning/example");
		                                	    System.out.println("Press 3 to go back");
		                                    		   
		                                   	    System.out.println("Enter your choice");
		                                   	    validate(sc1);
		                                  	    ch3=sc1.nextInt();
		                                    		   
		                                   	    switch(ch3)
		                                   	    {
		                                  		 	case 1:
		                                  		 			
		                                  		 			System.out.println("Enter part of speech");
		                                  		 			String pos1=sc1.next();
		                                  		 		
		                                  		 			System.out.println("Enter meaning");
		                                  		 			String mean1=sc1.next();
		                                  		 		
		                                  		 			System.out.println("Enter example");
		                                  		 			String ex1=sc3.nextLine();
		                                  		 			if(!(ex1.contains(syll)))
		                                  		 			{	
		                                  		 				System.out.println("Give proper example");
		                                  		 				continue;
		                                  		 			}
		                                  		 			bw.newLine();
		                                  		 			bw.write(syll+"="+pos1+":"+mean1+"::"+ex1+":::"+getCurrentTimeStamp());
		         					   		       		   bw.newLine();
		                                  		 		break;
		                                   		  	case 2:File file8=new File("H:/Dictionary/"+f+".txt");
		             						 	   
		    						   				
		            							   	
		    						   				File tempFile = new File(file8+".txt");
		    							  
		    						   				BufferedWriter Pwr = new BufferedWriter(new FileWriter (tempFile));
		    							   	
		    						   				BufferedReader br1 = new BufferedReader(new FileReader(file8));
		    						   				
		    						   				Test2.testing( syll, br1,Pwr,file8,tempFile);
		    						   				
		    						   				bw.close();
		    						   				br.close();
		    						   				System.out.println(file8.delete());
		    						   		   		System.out.println(tempFile.renameTo(file8));
		    						   		   	bw=new BufferedWriter(new FileWriter(file8, true));
		    								   	   br=new BufferedReader(new FileReader(file8));
			                                   		  			
			                                   		   	break;
		                                   		   	case 3:
		                                   		   		   break;
		                                   		   	default:System.out.println("Enter 1 to 3");
															break;
		                                   		}
		                                    }
                                   
					 	            }
					 			    
                                   
                    			}
                        	   
                            	   
			 				   break;
						   			
						   		case 3:File file4=new File("H:/Dictionary/"+f+".txt");
						 	   
						   				
							   	
						   				File tempFile = new File(file4+".txt");
							  
						   				BufferedWriter Pwr = new BufferedWriter(new FileWriter (tempFile));
							   	
						   				BufferedReader br1 = new BufferedReader(new FileReader(file4));
						   				System.out.println("Enter word to remove");
						   				
						   			  sc1=new Scanner(System.in);
						   			   	String syl=sc1.next();
						   				Test1.testing( syl, br1,Pwr,file4,tempFile);
						   				
						   				bw.close();
						   				br.close();
						   				System.out.println(file4.delete());
						   		   		System.out.println(tempFile.renameTo(file4));
	                        	   
	                        	   
	                        	   	break;
						   		case 4:int ch4=0;
		                         	   while(ch4!=4)
		                         	   {
		                         		   System.out.println("Press 1 to list in alphabetical order");
		                         		   System.out.println("Press 2 to list by length");
		                         		   System.out.println("Press 3 to list by date and time");
		                         		   System.out.println("Press 4 to go back");
		                         		   
		                         		   System.out.println("Enter your choice");
		                         		   validate(sc1);
		                         		   ch4=sc1.nextInt();
		                         		   
		                         		   switch(ch4)
		                         		   {
		                         		   		case 1:  
		                         		   				
			                                				File fe=new File("H:/Dictionary/"+f+".txt");
			                                				br=new BufferedReader(new FileReader(fe));
			                                				String in;
			                                				TreeSet<String> t=new TreeSet<String>();
			                                				while((in=br.readLine())!=null)
			                                				{
			                                					
			                                					String[] str_array = in.split("=");
			                                					String stringa = str_array[0];
			                                					t.add(stringa);
			                                				}
			                                				System.out.println(t);
			                                				break;
		                         		   		case 2:
			                                				File fer=new File("H:/Dictionary/"+f+".txt");
			                                				br=new BufferedReader(new FileReader(fer));
			                                				String inr;
			                                				TreeSet<String> tr=new TreeSet<String>(new FileLength());
			                                				
			                                				while((inr=br.readLine())!=null)
			                                				{
			                                					
			                                					String[] str_array = inr.split("=");
			                                					String stringa = str_array[0];
			                                					tr.add(stringa);
			                                				}
			                                				System.out.println(tr);
			                                				break;
		                         		   			
		                         		   		case 3:
			                                				File far=new File("H:/Dictionary/"+f+".txt");
			                                				br = new BufferedReader(new FileReader(far));
			                                				String ine;
			                                				TreeSet<String> tr2=new TreeSet<String>();
			                                				
			                                				while((ine=br.readLine())!=null)
			                                				{
			                                					
			                                					String[] str_array = ine.split("=");
			                                					String stringa = str_array[0];
			                                					tr2.add(stringa);
			                                					TimeTest.getCurrentTimeStamp(stringa);
			                                				}
			                                				System.out.println(tr2);
		                         		   			}
		                         	   			}
				                                				
		                      		   			       
		                         		   			   
								   			break;
						   		case 5:sc1 = new Scanner(System.in);
	                        	   	  File file6=new File("H:/Dictionary/"+f+".txt");
	                        	   	  
	                        	   	  
	                        	   	  int ch5=0;
	         					   
	                        	   	  while(ch5!=5)
	                        	   	  {
	                        	   		  System.out.println("Press 1 to search a word");
	                        	   		  System.out.println("Press 2 to search a meaning");
	                        	   		  System.out.println("Press 3 to search a part of speech");
	                        	   		  System.out.println("Press 4 to search an example");
	         						   							   
	                        	   		  System.out.println("Press 5 to go back");
	         	
	                        	   		  System.out.println("Enter your choice");
	                        	   		  validate(sc1);
	                        	   		  ch5=sc1.nextInt();
	         						   
	         						   switch(ch5)
	         						   {
	         						   case 1:System.out.println("Enter word to search");
		                        	   	  	  String syl1=sc1.next();
		                        	   	  	  String lin1;
			         						   
		                        	   	  	  String stringc1;
			                        	   	  br = new BufferedReader(new FileReader(file6));
			                        	   	int count=0;
			                        	   	  while((lin1=br.readLine())!=null)
			                        	   	  {
			                        	   		  String inn= lin1;
		              				
			                        	   		  String[] wordi =inn.split("=");
			                        	   		  stringc1 = wordi[0];
			                        	   		  
		          			    	   
			                        	   		  if(stringc1.equals(syl1))
			                        	   		  {
			                        	   			 
			                        	   			  count++;
			                        	   			  System.out.println(lin1);
			                        	   		  }
			                        	   		 else
			                        	   			  System.out.println("Not the word");
			                        	   	  }
			                        	   	  System.out.println("No of occurences= "+count);
	         							   break;
	         							   
	         						   case 2:System.out.println("Enter meaning to search");
	                        	   	  	  String syl2=sc1.next();
	                        	   	  	  String lin2;
		         						  String stringcc; 
	                        	   	  	  String stringc2;
		                        	   	  br = new BufferedReader(new FileReader(file6));
		                        	   	  int count1=0;
		                        	   	  while((lin2=br.readLine())!=null)
		                        	   	  {
		                        	   		  String inn= lin2;
	              				
		                        	   		  String[] wordi =inn.split("::");
		                        	   		  stringc2 = wordi[0];
		                        	   		  String[] wordi1=stringc2.split(":");
		                        	   		  stringcc=wordi1[1];
	          			    	   
		                        	   		  if(stringcc.equals(syl2))
		                        	   		  {
		                        	   			 
		                        	   			  System.out.println(lin2);
		                        	   			  count1++;
		                        	   		  }
		                        	   		  else
		                        	   			  System.out.println("meaning not found");
		                        	   	  }
		                        	   	  System.out.println("No of occurences= "+count1++);
	         							   break;
	         							   
	         						   case 3:System.out.println("Enter part of speech to search");
	                        	   	  	  String syl3=sc1.next();
	                        	   	  	  String lin3;
		         						   String stringcs;
	                        	   	  	  String stringc3;
	                        	   	  	  int count2=0;
		                        	   	  br = new BufferedReader(new FileReader(file6));
	              			       
		                        	   	  while((lin3=br.readLine())!=null)
		                        	   	  {
		                        	   		  String inn= lin3;
	              				
		                        	   		  String[] wordi =inn.split(":");
		                        	   		  stringc3 = wordi[0];
		                        	   		  String[] wordi2=stringc3.split("=");
		                        	   		  stringcs= wordi2[1];
	          			    	   
		                        	   		  if(stringcs.equals(syl3))
		                        	   		  {
		                        	   			 count2++;
		                        	   			  System.out.println(lin3);
		                        	   		  }
		                        	   		  else
		                        	   			  System.out.println("Part of speech not found");
		                        	   	  }
		                        	   	System.out.println("No of occurences= "+count2++);
	         							   break;
	         							   
	         						   case 4:System.out.println("Enter example to search");
	                        	   	  	  		String syl4=sc2.nextLine();
	                        	   	  	  		String lin4;
	                        	   	  	  		String stringcd;
	                        	   	  	  		String stringc4;
	                        	   	  	  		int count3=0;
	                        	   	  	  		br = new BufferedReader(new FileReader(file6));
	              			       
	                        	   	  	  		while((lin4=br.readLine())!=null)
	                        	   	  	  		{
	                        	   	  	  			String inn= lin4;
	              				
	                        	   	  	  			String[] wordi =inn.split(":::");
	                        	   	  	  			stringc4 = wordi[0];
	                        	   	  	  			String[] wordi3=stringc4.split("::");
	                        	   	  	  			stringcd= wordi3[1];
	          			    	   
	                        	   	  	  			if(stringcd.equals(syl4))
	                        	   	  	  			{
	                        	   	  	  				count3++;
	                        	   	  	  				System.out.println(lin4);
	                        	   	  	  				
	                        	   	  	  			}
	                        	   	  	  			else
	                        	   	  	  				System.out.println("example not found");
	                        	   	  	  		}
	                        	   	  	  	System.out.println("No of occurences= "+count3++);
	                        	   	  	  		break;
	         							   
	         						   case 6:
	         							   break;
	         							   
	         						   default:System.out.println("Press 1 to 5");
	         							   break;
	         						   }
	         					 }
				   	   
						   }
					   }
				   	   
					   break;
				
				case 2:System.out.println("Enter name to load");
					   String load=sc1.next();
					   File loadi=new File("H:/Dictionary/"+load+".txt");
					   if(loadi.exists())
					   {
						   bw=new BufferedWriter(new FileWriter(loadi, true));
					   	   br=new BufferedReader(new FileReader(loadi));
					   	   
					   	   
					   	   int c1=0;
						   
						   while(c1!=6)
						   {
							   System.out.println("Press 1 to add a word");
							   System.out.println("Press 2 to edit");
							   System.out.println("Press 3 to remove");
							   System.out.println("Press 4 to list the words");
							   System.out.println("Press 5 to search a word");								   
							   System.out.println("Press 6 to go back");
		
							   System.out.println("Enter your choice");
							   validate(sc1);
							   c1=sc1.nextInt();
							   
							   switch(c1)
							   {
							   		case 1:System.out.println("Enter a word");
						   		       	   String word=sc1.next();
						   		       	   words.add(word);
						   		       	   
						   		       	   if(checkWord(word))
						   		       	   {
						   		       		   if(br.readLine()!=word)
						   		       		   {   	
							   		       		   int ch2=0;
							   		       		   while(ch2!=7)
						 						   {
							   		       			   
							   		       			   System.out.println("Press 1 if part of speech is noun");
						 							   System.out.println("Press 2 if part of speech is verb");
						 							   System.out.println("Press 3 if part of speech is adjective");
						 							   System.out.println("Press 4 if part of speech is adverb");
						 							   System.out.println("Press 5 if part of speech is pronoun");
						 							   System.out.println("Press 6 if part of speech is preposition");
						 							   System.out.println("Press 7 to go back");
						 							   
						 							   System.out.println("Enter your choice");
						 							   validate(sc1);
						 							   ch2=sc1.nextInt();
						 							   
						 							  switch(ch2)
						 							  {
						 							  case 1:System.out.println("Enter meaning for "+word+" (noun)");
			 							   			   		 String mn1=sc2.nextLine();
			 							   			   		 if(mn1==null)
			 							   			   		 {
			 							   			   			 System.out.println("Enter the meaning");
			 							   			   		 }
			 							   			   		 else
			 							   			   		 {
			 							   			   			 meaning.add(mn1);
			 							   			   			 partOfSpeech.add("noun");
			 							   			   		 }
			 							   			   		 System.out.println("Enter the example for "+word+" (noun) "+"and meaning "+mn1+":");
			 							   			   		 String ex1=sc2.nextLine();
			 							   			   		 if(ex1.contains(word))
			 							   			   			 example.add(ex1);
			 							   			   		 else
			 							   			   			 System.out.println("Give valid example");
						 								  
			 							   			   	  break;
						 							  case 2:System.out.println("Enter meaning for "+word+" (verb)");
									   			   		 	 String mn2=sc2.nextLine();
									   			   		 	 if(mn2==null)
									   			   		 	 {
									   			   		 		 System.out.println("Enter the meaning");
									   			   		 	 }
									   			   		 	 else
									   			   		 	 {
									   			   		 		 meaning.add(mn2);
									   			   		 		 partOfSpeech.add("verb");
									   			   		 	 }
									   			   		 	 System.out.println("Enter the example for "+word+" (verb) "+"and meaning "+mn2+":");
									   			   		 	 String ex2=sc2.nextLine();
									   			   		 	 if(ex2.contains(word))
									   			   		 		 example.add(ex2);
									   			   		 	 else
									   			   		 		 System.out.println("Give valid example");
						 								  break;
						 							  case 3:System.out.println("Enter meaning for "+word+" (adjective)");
									   			   		 	String mn3=sc2.nextLine();
									   			   		 	if(mn3==null)
									   			   		 	{
									   			   		 		System.out.println("Enter the meaning");
									   			   		 	}
									   			   		 	else
									   			   		 	{
									   			   		 		meaning.add(mn3);
									   			   		 		partOfSpeech.add("adjective");
									   			   		 	}
									   			   		 	System.out.println("Enter the example for "+word+" (adjective) "+"and meaning "+mn3+":");
									   			   		 	String ex3=sc2.nextLine();
									   			   		 	if(ex3.contains(word))
									   			   		 		example.add(ex3);
									   			   		 	else
									   			   		 		System.out.println("Give valid example");
						 								  break;
						 							  case 4:System.out.println("Enter meaning for "+word+" (adverb)");
									   			   		 	String mn4=sc2.nextLine();
									   			   		 	if(mn4==null)
									   			   		 	{
									   			   		 		System.out.println("Enter the meaning");
									   			   		 	}
									   			   		 	else
									   			   		 	{
									   			   		 		meaning.add(mn4);
									   			   		 		partOfSpeech.add("adverb");
									   			   		 	}
									   			   		 	System.out.println("Enter the example for "+word+" (adverb) "+"and meaning "+mn4+":");
									   			   		 	String ex4=sc2.nextLine();
									   			   		 	if(ex4.contains(word))
									   			   		 		example.add(ex4);
									   			   		 	else
									   			   		 		System.out.println("Give valid example");
						 								  break;
						 							  case 5:System.out.println("Enter meaning for "+word+" (pronoun)");
									   			   		 String mn5=sc2.nextLine();
									   			   		 if(mn5==null)
									   			   		 {
									   			   			 System.out.println("Enter the meaning");
									   			   		 }
									   			   		 else
									   			   		 {
									   			   			 meaning.add(mn5);
									   			   			 partOfSpeech.add("pronoun");
									   			   		 }
									   			   		 System.out.println("Enter the example for "+word+" (pronoun) "+"and meaning "+mn5+":");
									   			   		 String ex5=sc2.nextLine();
									   			   		 if(ex5.contains(word))
									   			   			 example.add(ex5);
									   			   		 else
									   			   			 System.out.println("Give valid example");
						 								  break;
						 							  case 6:System.out.println("Enter meaning for "+word+" (preposition)");
									   			   		 	String mn6=sc2.nextLine();
									   			   		 	if(mn6==null)
									   			   		 	{
									   			   		 		System.out.println("Enter the meaning");
									   			   		 	}
									   			   		 	else
									   			   		 	{
									   			   		 		meaning.add(mn6);
									   			   		 		partOfSpeech.add("preposition");
									   			   		 	}
									   			   		 	System.out.println("Enter the example for "+word+" (preposition) "+"and meaning "+mn6+":");
									   			   		 	String ex6=sc2.nextLine();
									   			   		 	if(ex6.contains(word))
									   			   		 		example.add(ex6);
									   			   		 	else
									   			   		 		System.out.println("Give valid example");
						 								  break;
						 							  case 7:System.out.println("");
						 								  break;
						 							  default:System.out.println("Enter inputs 1 to 7");
						 									break;  
						 								 
						 							  }
						 						   }
						   		       		   }
						   		       		   else
						   		       		   {
						   		       			   System.out.println("Enter anpther word");
						   		       		   }
						   		       	   }
						   		       	   else
						   		       	   {
						   		       		   System.out.println("Enter proper word");
						   		       	   }
						   		       	   Iterator<String> it1=partOfSpeech.iterator();
						   		       	   Iterator<String> it2=meaning.iterator();
						   		       	   Iterator<String> it3=example.iterator();
						   		       	   
	                                    
	                                   
						   		       	   while(it1.hasNext()&&it2.hasNext()&&it3.hasNext())
						   		       	   {
						   		       		   Object s=it1.next();
						   		       		   Object g=it2.next();
						   		       		   Object t=it3.next();
						   		       		   
						   		       		   bw.write(word+"="+s+":"+g+"::"+t+":::"+getCurrentTimeStamp());
						   		       		   bw.newLine();
						   		       		   
						   		       		   
						   		       		  
						   		       	   }
						   		       	   partOfSpeech.removeAll(partOfSpeech);
					   		       		   meaning.removeAll(meaning);
					   		       		   example.removeAll(example);
							   			
						   		       	   break;
							   		case 2:sc1 = new Scanner(System.in);
							   		sc2= new Scanner(System.in);
	                    			
	                    			File file5=new File("H:/Dictionary/"+load+".txt");
	                    			System.out.println("Enter word to edit");
	                    			String syll=sc2.next();
	                    			String line;
	                    			
	                    			String stringb;
	                    			br = new BufferedReader(new FileReader(file5));
	                    			while((line=br.readLine())!=null)
	                    			{
	                    				String inn= line;
	                    				
	                    				String[] wordp =inn.split("=");
	                    				stringb = wordp[0];
	                    				String stringb2;
	                    				int ch3=0;
						 			    if(stringb.equals(syll))
						 	            {
		                                    System.out.println(inn);
						 			    	while(ch3!=3)
			                                 {	
			                                		System.out.println("The word exsists");
			                                   		
			                                   		System.out.println("Press 1 to add part of speech/meaning/example");
			                               		    System.out.println("Press 2 to remove part of speech/meaning/example");
			                                	    System.out.println("Press 3 to go back");
			                                    		   
			                                   	    System.out.println("Enter your choice");
			                                   	    validate(sc1);
			                                  	    ch3=sc1.nextInt();
			                                    		   
			                                   	    switch(ch3)
			                                   	    {
			                                  		 	case 1:
			                                  		 			
			                                  		 			System.out.println("Enter part of speech");
			                                  		 			String pos1=sc1.next();
			                                  		 		
			                                  		 			System.out.println("Enter meaning");
			                                  		 			String mean1=sc1.next();
			                                  		 		
			                                  		 			System.out.println("Enter example");
			                                  		 			String ex1=sc2.nextLine();
			                                  		 			if(!ex1.contains(syll))
			                                  		 			{	
			                                  		 				System.out.println("Give proper example");
			                                  		 				continue;
			                                  		 			}
			                                  		 			bw.write(syll+"="+pos1+":"+mean1+"::"+ex1+":::"+getCurrentTimeStamp());
			         					   		       		   bw.newLine();
			                                  		 		break;
			                                   		  	case 2:File file8=new File("H:/Dictionary/"+load+".txt");
			             						 	   
			    						   				
			            							   	
			    						   				File tempFile = new File(file8+".txt");
			    							  
			    						   				BufferedWriter Pwr = new BufferedWriter(new FileWriter (tempFile));
			    							   	
			    						   				BufferedReader br1 = new BufferedReader(new FileReader(file8));
			    						   				
			    						   				Test2.testing( syll, br1,Pwr,file8,tempFile);
			    						   				
			    						   				bw.close();
			    						   				br.close();
			    						   				System.out.println(file8.delete());
			    						   		   		System.out.println(tempFile.renameTo(file8));
			    						   		   	bw=new BufferedWriter(new FileWriter(file8, true));
			    								   	   br=new BufferedReader(new FileReader(file8));
				                                   		  			
				                                   		   	break;
			                                   		   	case 3:
			                                   		   		   break;
			                                   		   	default:System.out.println("Enter 1 to 3");
																break;
			                                   		}
			                                    }
	                                   
						 	            }
						 			    
	                                   
	                    			}
	                        	   
	                            	   
				 				   break;
							   			
							   		case 3:File file4=new File("H:/Dictionary/"+load+".txt");
							 	   
							   				
								   	
							   				File tempFile = new File(file4+".txt");
								  
							   				BufferedWriter Pwr = new BufferedWriter(new FileWriter (tempFile));
								   	
							   				BufferedReader br1 = new BufferedReader(new FileReader(file4));
							   				System.out.println("Enter word to remove");
							   				
							   			  sc1=new Scanner(System.in);
							   			   	String syl=sc1.next();
							   				Test1.testing( syl, br1,Pwr,file4,tempFile);
							   				
							   				bw.close();
							   				br.close();
							   				System.out.println(file4.delete());
							   		   		System.out.println(tempFile.renameTo(file4));
		                        	   
		                        	   
		                        	   	break;
							   		case 4:int ch4=0;
			                         	   while(ch4!=4)
			                         	   {
			                         		   System.out.println("Press 1 to list in alphabetical order");
			                         		   System.out.println("Press 2 to list by length");
			                         		   System.out.println("Press 3 to list by date and time");
			                         		   System.out.println("Press 4 to go back");
			                         		   
			                         		   System.out.println("Enter your choice");
			                         		   validate(sc1);
			                         		   ch4=sc1.nextInt();
			                         		   
			                         		   switch(ch4)
			                         		   {
			                         		   		case 1:  
			                         		   				sc1 = new Scanner(System.in);
				                                				
				                                				File fe=new File("H:/Dictionary/"+load+".txt");
				                                				br=new BufferedReader(new FileReader(fe));
				                                				String in;
				                                				TreeSet<String> t=new TreeSet<String>();
				                                				while((in=br.readLine())!=null)
				                                				{
				                                					
				                                					String[] str_array = in.split("=");
				                                					String stringa = str_array[0];
				                                					t.add(stringa);
				                                				}
				                                				System.out.println(t);
				                                				break;
			                         		   		case 2: sc1 = new Scanner(System.in);
				                                				
				                                				File fer=new File("H:/Dictionary/"+load+".txt");
				                                				br=new BufferedReader(new FileReader(fer));
				                                				String inr;
				                                				TreeSet<String> tr=new TreeSet<String>(new FileLength());
				                                				
				                                				while((inr=br.readLine())!=null)
				                                				{
				                                					
				                                					String[] str_array = inr.split("=");
				                                					String stringa = str_array[0];
				                                					tr.add(stringa);
				                                				}
				                                				System.out.println(tr);
				                                				break;
			                         		   			
			                         		   		case 3:
				                                				File far=new File("H:/Dictionary/"+load+".txt");
				                                				br = new BufferedReader(new FileReader(far));
				                                				String ine;
				                                				TreeSet<String> tr2=new TreeSet<String>();
				                                				
				                                				while((ine=br.readLine())!=null)
				                                				{
				                                					
				                                					String[] str_array = ine.split("=");
				                                					String stringa = str_array[0];
				                                					tr2.add(stringa);
				                                					TimeTest.getCurrentTimeStamp(stringa);
				                                				}
				                                				System.out.println(tr2);
			                         		   			}
			                         	   			}
					                                				
			                      		   			       
			                         		   			   
									   			break;
							   		case 5:sc1 = new Scanner(System.in);
		                        	   	  File file6=new File("H:/Dictionary/"+load+".txt");
		                        	   	  
		                        	   	  
		                        	   	  int ch5=0;
		         					   
		                        	   	  while(ch5!=5)
		                        	   	  {
		                        	   		  System.out.println("Press 1 to search a word");
		                        	   		  System.out.println("Press 2 to search a meaning");
		                        	   		  System.out.println("Press 3 to search a part of speech");
		                        	   		  System.out.println("Press 4 to search an example");
		         						   							   
		                        	   		  System.out.println("Press 5 to go back");
		         	
		                        	   		  System.out.println("Enter your choice");
		                        	   		  validate(sc1);
		                        	   		  ch5=sc1.nextInt();
		         						   
		         						   switch(ch5)
		         						   {
		         						   case 1:System.out.println("Enter word to search");
			                        	   	  	  String syl1=sc1.next();
			                        	   	  	  String lin1;
				         						   
			                        	   	  	  String stringc1;
				                        	   	  br = new BufferedReader(new FileReader(file6));
				                        	   	  int count=0;
				                        	   	  while((lin1=br.readLine())!=null)
				                        	   	  {
				                        	   		  String inn= lin1;
			              				
				                        	   		  String[] wordi =inn.split("=");
				                        	   		  stringc1 = wordi[0];
			                     
			          			    	   
				                        	   		  if(stringc1.equals(syl1))
				                        	   		  {
				                        	   			  
				                        	   			  System.out.println(lin1);
				                        	   			  count++;
				                        	   		  }
				                        	   		  else
				                        	   			  System.out.println("Not the word");
				                        	   	  }
				                        	   	System.out.println("No of occurences= "+count);
		         							   break;
		         							   
		         						   case 2:System.out.println("Enter meaning to search");
		                        	   	  	  String syl2=sc1.next();
		                        	   	  	  String lin2;
			         						  String stringcc; 
		                        	   	  	  String stringc2;
		                        	   	  	  int count1=0;
			                        	   	  br = new BufferedReader(new FileReader(file6));
		              			       
			                        	   	  while((lin2=br.readLine())!=null)
			                        	   	  {
			                        	   		  String inn= lin2;
		              				
			                        	   		  String[] wordi =inn.split("::");
			                        	   		  stringc2 = wordi[0];
			                        	   		  String[] wordi1=stringc2.split(":");
			                        	   		  stringcc=wordi1[1];
		          			    	   
			                        	   		  if(stringcc.equals(syl2))
			                        	   		  {
			                        	   			  count1++;
			                        	   			  System.out.println(lin2);
			                        	   		  }
			                        	   		  else
			                        	   			  System.out.println("meaning not found");
			                        	   	  }
			                        	   	System.out.println("No of occurences= "+count1++);
		         							   break;
		         							   
		         						   case 3:System.out.println("Enter part of speech to search");
		                        	   	  	  String syl3=sc1.next();
		                        	   	  	  String lin3;
		                        	   	  	  int count2=0;
			         						   String stringcs;
		                        	   	  	  String stringc3;
			                        	   	  br = new BufferedReader(new FileReader(file6));
		              			       
			                        	   	  while((lin3=br.readLine())!=null)
			                        	   	  {
			                        	   		  String inn= lin3;
		              				
			                        	   		  String[] wordi =inn.split(":");
			                        	   		  stringc3 = wordi[0];
			                        	   		  String[] wordi2=stringc3.split("=");
			                        	   		  stringcs= wordi2[1];
		          			    	   
			                        	   		  if(stringcs.equals(syl3))
			                        	   		  {
			                        	   			  count2++;
			                        	   			  System.out.println(lin3);
			                        	   		  }
			                        	   		  else
			                        	   			  System.out.println("Part of speech not found");
			                        	   	  }
			                        	   	System.out.println("No of occurences= "+count2++);
		         							   break;
		         							   
		         						   case 4:System.out.println("Enter example to search");
		                        	   	  	  		String syl4=sc2.nextLine();
		                        	   	  	  		String lin4;
		                        	   	  	  		int count3=0;
		                        	   	  	  		String stringcd;
		                        	   	  	  		String stringc4;
		                        	   	  	  		br = new BufferedReader(new FileReader(file6));
		              			       
		                        	   	  	  		while((lin4=br.readLine())!=null)
		                        	   	  	  		{
		                        	   	  	  			String inn= lin4;
		              				
		                        	   	  	  			String[] wordi =inn.split(":::");
		                        	   	  	  			stringc4 = wordi[0];
		                        	   	  	  			String[] wordi3=stringc4.split("::");
		                        	   	  	  			stringcd= wordi3[1];
		          			    	   
		                        	   	  	  			if(stringcd.equals(syl4))
		                        	   	  	  			{
		                        	   	  	  				count3++;
		                        	   	  	  				System.out.println(lin4);
		                        	   	  	  				
		                        	   	  	  			}
		                        	   	  	  			else
		                        	   	  	  				System.out.println("example not found");
		                        	   	  	  		}
		                        	   	  	  	System.out.println("No of occurences= "+count3++);
		                        	   	  	  		break;
		         							   
		         						   case 6:
		         							   break;
		         							   
		         						   default:System.out.println("Press 1 to 5");
		         							   break;
		         						   }
		         					 }
					   	   
							   }
						   }
						   
					   }
					   else
					   {
						   System.out.println("Dictionary doesnt exist");
					   }
					   break;
				
				
				case 3:System.out.println("Enter the name of dictionary");
	               	   String s=sc1.next();
	               	   File fd=new File("H:/Dictionary/"+s+".txt");
	               	   if(fd.exists())
	               	   {
	               		   fd.delete();
	               		   System.out.println("Dictionary deleted..");
	               	   }
	               	   else
	               		   System.out.println("The dictionary does not exsist");
				   
	               	   break;
				
				
				case 4:System.out.println("Tata Bye Bye!! Have a nice day");
					break;
				
				
				default:System.out.println("Press 1 to 5");
					break;
				}
			}
		}
		finally
		{
			try
			{
				if(br!=null)
					br.close();
				if(bw!=null)
					bw.close();
				
				
			}
			catch(IOException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
	}
	private static String getCurrentTimeStamp() {
		SimpleDateFormat sdfDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    Date now = new Date();
	    String strDate = sdfDate.format(now);
	    return strDate;
		
	}
	public static boolean checkWord(String n)
	{
		if(n==null||n.equals(" ")||(n.matches("[^a-zA-Z0-9 ]")))
			return false;
		else
			return true;
	}
	public static boolean check(File f)
	{
		if(f.getName()==null||f.getName().equals(" ")||(f.getName().matches("[^a-zA-Z0-9 ]")))
			return false;
		else
			return true;
	}
	public static void validate(Scanner sc4)
	{
		while(!sc4.hasNextInt())
		{
			System.out.println("Enter integer inputs only");
			sc4.next();
		}
	}
}
