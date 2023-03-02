package prueba2;

//Fig. 3.8: GradeBookTest.java
//Create and manipulate a GradeBook object.
import java.util.Scanner; // program uses Scanner

public class GradeBookTest
{
// main method begins program execution
public static void main( String args[] )
{ 
	
   // create Scanner to obtain input from command window
   Scanner entrada = new Scanner( System.in );

   // create a GradeBook object and assign it to myGradeBook
   GradeBook myGradeBook = new GradeBook("introduccion Java", "Juan"); 

   // display initial value of courseName
   //System.out.printf( "El nombre del curso actual: %s\n\n",
     // myGradeBook.getCourseName() );

  
   // prompt for and read course name
   /*System.out.println( "Ingrese el nombre del curso:" );
   String elNombre = entrada.nextLine(); // read a line of text
   myGradeBook.setCourseName( elNombre ); // set the course name
   System.out.println(); */// outputs a blank line

   // display welcome message after specifying course name
   myGradeBook.displayMessage();
   
} 

} 

