package prueba2;

public class GradeBook
{
   private String NomCurso; // course name for this GradeBook
   private String NomInstructor; 
   
   public GradeBook(String name, String nomI)
   {
	   NomCurso=name;
	   NomInstructor=nomI;
   }
   // method to "set" the course name
   public void setCourseName( String name )
   {
	   NomCurso = name; // store the course name
   } // end method setCourseName

   // method to retrieve the course name
   public String getCourseName()
   {
      return NomCurso;
   } // end method getCourseName

   // display a welcome message to the GradeBook user
   public void displayMessage()
   {
      // this statement calls getCourseName to get the 
      // name of the course this GradeBook represents
      System.out.printf( "Welcome to the grade book for\n%s!\n", 
         getCourseName() );
      System.out.printf("Es es el curso presentado por: %s",NomInstructor);
      
   } // end method displayMessage



} // end class GradeBook
