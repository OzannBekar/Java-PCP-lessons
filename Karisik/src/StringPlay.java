// ************************************************** 
// StringPlay.java 
//
// Play with String objects
// ************************************************** 
public class StringPlay 
{
public static void main (String[] args) 
{ 

String college = new String ("PoDunk College");

String town =  new String ("Anytown, Usa");

int stringLength;
String change1, change2, change3;

stringLength = college.length(); 

System.out.println (college + " contains " + stringLength + " characters.");
change1 = college.toUpperCase(); // part (c)
change2 = change1.replace('O', '*'); // part (d)
change3 = change2.concat(" "+ town); // part (e)
System.out.println ("The final string is " + change3); 
} 
}