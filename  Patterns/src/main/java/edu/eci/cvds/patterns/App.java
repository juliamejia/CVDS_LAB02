package edu.eci.cvds.patterns;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
	  if(args.length==0){
        	System.out.println( "Hello World!");
        }
	  else{
		String completo = "";
	  	for(int i=0; i<args.length;i+=1){
			completo += args[i]+" ";
		}
	  	System.out.println( "Hello " + completo);
		
	  }
    }
}
