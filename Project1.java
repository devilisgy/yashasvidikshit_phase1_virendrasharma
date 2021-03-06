package lockers1;
import java.util.Scanner;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.io.IOException;


public class Project1 {
	 static Scanner s2 = new Scanner(System.in);
	static Scanner s1 = new Scanner(System.in);
	static int userinput,userinput2;
	final static String path = "F:/demo1/";
	
	
	
	static void showmenu()
	{
		System.out.println("               \n\n     MAIN MENU   \n\n"+
                "    Select the option below \n "+
                 "1.To get the Files in the Directory \n "+
                 " \n 2.To manage the Files in the Directory \n"+
              "\n 0.To Exit the Application \n"
                 );
	}

	public static void main(String[] args) {
		
			       showmenu();
				  userinput = s1.nextInt();
				 
		        /*System.out.println("would you like to proceed or quit");
				System.out.println("to proceed enter 4");
				System.out.println("to quit enter 0");
				Scanner q = new Scanner(System.in);*/
				switch (userinput)
				{
				case 0:
					System.out.println("thank you and good bye");
				       System.exit(0);
					break;
					
					case 1:
					System.out.println("file directory is");
					File dir = new File(path);
					File files[] = dir.listFiles();	
						for(File file : files)
						{
							System.out.println("File name:"+file.getName());							
							System.out.println("File path"+file.getAbsolutePath());
							System.out.println("size :"+file.getTotalSpace());
							System.out.println(" ");
							
						}
						main(args);
						break;
				case 2: 
					submenu();
				break;
				
				default : {
					
							
							main(args);
						}
								
							}
				}
						
					
			static void submenu() {
		try {
			
		
		Project1 a= new Project1();
		System.out.println("choose below the option to manage the files "+
                "1.To Add a file in the directory"+
                "\n 2.To Delete a file in the directory"+
                "\n 3.To search a file in the directory"+
                "\n 4.To go Back Main menu ");

userinput2 = s2.nextInt();
switch(userinput2)
{
	



case 1:


System.out.println("Enter the desired name of your file: ");
String fileName = s2.next();
File c = new File(path+fileName);
if(c.createNewFile())
 System.out.println(" File  "+fileName+"\" added to"+path +"\n" );
else  
System.out.println("File"+fileName+"\"file alerady exist"+path+"\n");

submenu();
break;
case  2:

System.out.println("enter the file name to be deleted");
String fileName1 = s2.next();
File d = new File(path+ "/"+fileName1);
if(d.delete())
	System.out.println("File"+fileName1+"\"deleted "+path+ "\n");
else
	System.out.println("file not able to delete");
submenu();
break;


case 3 :

System.out.println("enter a search file");
String fileName3 = s2.next();
File t = new File(path+"/"+fileName3);
if(t.exists())
{
	

	System.out.println("file exist");
}else
{
	System.out.println("file not exist");
}
submenu();
break;

case 4:
{
a.main(null);
}
break;
default :
	submenu();
}
	}
		catch(IOException a) {
			System.out.println(a);
		}
	}
}
