/*
--------------------------------HEADER----------------------------------
Creator:      		Jason Haldiman

Date:           	03-02-22

Purpose:        	For team to practice creating an two objects object calling both.
   
Connections:    	Creates objects from other .java class files in same folder

Preconditions: 		All called files in same folder.

Inputs:          	Takes hardcoded values for constructors of objects.

Outputs     		Prints the area of different shapes to console.

Postconditions: 	Main terminates
    
Methods:			None in this file.

Algorithm:			

Notes:

-------------------------------------------------------------------------
INSTRUCTIONS TO TEAM MEMBERS FOR TEST 3:
1. Make a pull request for this main file. This will allow you to edit it to add the calls to create objects 
   for your shapes in step 4.
2. Create a new .java file named "group_test_3_SHAPE.java" depending on what shape you want to find the area of.
3. Add constructors to the "group_test_3_SHAPE.java" file you created. Use my attahced group_test_3_square_area.java 
   as a reference.
4. Edit the main file so it creates objects of your shape-constructors and prints their area in main
5. Push it back to GitHub so it can be added to the MAIN branch on GitHub
--------------------------------------------------------------------------
 */

public class group_test_3_main {

    
    //class with main
    public static void main(String[] args) {
      
       //creating object with initialized values.
       group_test_3_square_area sqr_object = new group_test_3_square_area(4);
       
       //creating object with uninitializes values we can input later
       
       /*
        Notice the decleration of an object is the same as declaring an 
        integer or a string.
        
        TYPE object_name = new TYPE(parameter)
        
        TYPE is the name of the class we are creating an object of.
        var_name is the name associated with the object we are creating.
        new is a decleration of a new object for memory to make space for.
        */


        System.out.printf("\nThis is area of initialized value: %d\n", sqr_object.get_area());
        
        /*
        Notice how we call a method of the object. This also works to call
        a parameter IF THE PARAMETER OF THE OBJECT IS ACCESSIBLE (I.E. not
        private).
        
        object_name.method();
        object_name.var_name;        
        */
        
        
        
        //----------------------------------------------------------------
        
        
        
        int square = 0;
         
        //create object with uninitialized values
        group_test_3_square_area sqr_object_2 = new group_test_3_square_area();
        square = sqr_object_2.get_area_passed(5);
        System.out.printf("\nThis is the area of passed value of square object: %d\n", square);
        
    }//end main
}// end group_test_3_main
