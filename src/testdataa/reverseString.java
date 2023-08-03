package testdataa;

import java.lang.*;
import java.io.*;
import java.util.*;

public class reverseString {

	public static void main(String[] args) {
		
		String stringInput="pooja velani";
		//get the String length
		int iStrLength=stringInput.length();
		
		while(iStrLength >0)
		{
			System.out.print(stringInput.charAt(iStrLength -1));
			iStrLength--;
		}

}
}