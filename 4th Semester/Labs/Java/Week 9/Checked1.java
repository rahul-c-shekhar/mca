//Checked exceptions
//FileNotFoundException

import java.io.*;
class Checked1{  
   public static void main(String args[])
   {
	FileInputStream fis = null;
	try{
	    fis = new FileInputStream("B:/myfile.txt"); 
	}
	catch(FileNotFoundException fnfe){
            System.out.println("exception handled: The specified file is not " +
			"present at the given path");
	 }
	}
}
