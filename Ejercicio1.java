/*Create a new class with the following methods:
Return type: String - Body: Comparison between 2 words - Parameters : 2 strings.
Return type: boolean - Body: Verify the biggest number in a list - Parameters: List/Array of integers.
Return type: void - Body: Sort a list by asc and desc order - Parameters: List/Array of strings.
Return type: int - body: Count the length of a string - Parameters: String.*/
import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
import java.util.Collections;

public class Ejercicio1{
	public static void main(String[] args){
		Ejercicio1 comp = new Ejercicio1();
    	System.out.println(comp.comparacion(null,null));


    	Ejercicio1 bigNum = new Ejercicio1();
    	int [] lista = new int [] {-4, -1, -7, -3, -4};    	
    	System.out.println(bigNum.biggestNumber(lista));


    	Ejercicio1 asDes = new Ejercicio1();
    	String [] listString = new String[] {"German", "Ana", "Padalustro", "America","Daniel","Braulio","Ana","Camilo","Gerardo","Fernando"};
    	for (String lisShow : listString){
	    	System.out.println(lisShow);
	    }
	    asDes.sortingAscDesc(listString);


    	Ejercicio1 cuentaChar = new Ejercicio1();
    	System.out.println(cuentaChar.cuentaCaracts("Padalustro Krotolamo palabra"));

	}

	public String comparacion(String word1, String word2){
		try {
        if (word1.matches("[\\s+aA-zZ]+") && word2.matches("[\\s+aA-zZ]+")) {
            if (word1.equals(word2)){
              
              return "Both Strings are equals.";            
            }
            else{
              
              return "The strings are not equals.";
            }
        }
        else {          
           	return "Most be a valid input, just strings are allowed.";
        } 
        }
        catch (Exception e){
        	return "Must enter a value";
        }         
    } 
     

    public boolean biggestNumber(int[] list){
		int nM = list[0];
		int conteo = 0;
		for (int i=0; i < list.length; i++){
        	if(list[i] > nM){
            	nM = list[i];
            }              
        } 
        for (int intmay = 0; intmay < list.length; intmay ++){
	    	for (int intmay2 = 0; intmay2 < list.length && intmay != intmay2; intmay2++){
	    		if (list[intmay] < (list[intmay2])){
	    			int intaux = list[intmay];
	    			list[intmay] = list[intmay2];
	    			list[intmay2] = intaux;
	    			
	    		}	 
	    	} conteo ++;
	    }
		System.out.println("El numero mayor es : " + list[conteo-1]);	            
        if(nM == list[conteo-1]){
        	return true;
        }else return false;
        
    }


    public void sortingAscDesc(String[] strgList){
    	System.out.println("\tAscending :\n" );
	    for (int strasc = 0; strasc < strgList.length; strasc ++){
	    	for (int strasc2 = 0; strasc2 < strgList.length && strasc != strasc2; strasc2++){
	    		if (strgList[strasc].compareTo(strgList[strasc2]) < 0){
	    			String auxiliar = strgList[strasc];
	    			strgList[strasc] = strgList[strasc2];
	    			strgList[strasc2] = auxiliar;
                } 
	    	}
	    }
	    for (String show : strgList)
	    	System.out.println("\t" + show);

	    System.out.println("Descending :\t\n" );
	    for (int strdesc = 0; strdesc < strgList.length; strdesc ++){
	    	for (int strdesc2 = 0; strdesc2 < strgList.length && strdesc != strdesc2; strdesc2++){
	    		if (strgList[strdesc].compareTo(strgList[strdesc2]) > 0){
	    			String auxiliar2 = strgList[strdesc2];
                	strgList[strdesc2] = strgList[strdesc];
                	strgList[strdesc] = auxiliar2;
                } 
            }
	    }
	    for (String showdesc : strgList){
	    	System.out.println(showdesc);
	    }
    }
  

    public int cuentaCaracts(String strg1){
    	int count = 0;
    	for(char cuenta:strg1.toCharArray()){
        count++;      
        System.out.println(" The characters are: " + cuenta);
      }
      return count;
    }
}




