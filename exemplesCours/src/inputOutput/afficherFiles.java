package inputOutput;
import java.io.File;  

public class afficherFiles {
  public static void main(String[] args) {
    /*
	try {
	    File  myfile = new File("C:/");
	    File[] files=myfile.listFiles();
	    
	    for (int i=0; i< files.length; i++) {
	    	if(files[i].isDirectory()) {
	    		System.out.println(files[i].getName()+"/");
	    	}
	    	else {
	    		System.out.println(files[i].getName());
	    	}
	    }
    } catch (Exception e) {
      System.out.println("An error occurred.");
      
    }
        */
	  File d=new File("C:/");
	  int n=0;
	  if(d.exists()) {
		  for(File f: d.listFiles()) {
			  if(f.isDirectory()) {
				  System.out.printf("%d- %-30s \t",n+1, f.getName());
			  }
			  else {
				  System.out.printf("%d- %-30s \t",n+1, f.getName());
			  }
			  n++;
			  if((n%4)==0) System.out.println();
		  }
	  }
	  else {System.out.println("ce dossier n'existe pas");}
	  
        
    
  }
}
