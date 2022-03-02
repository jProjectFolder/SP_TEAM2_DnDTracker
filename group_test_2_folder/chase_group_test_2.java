/*
--------------------------------HEADER----------------------------------
CREATOR:        Jason Haldiman
DATE:           02-28-22
PURPOSE:        1. Java file for team members to create their own copy of and upload to the GitHub for practicing adding a java class (a file) to a project folder.
                2. Also for deciding some standardization for team members when coding their files. This gives example of what header we would want on each file and what headers we would want for methods inside the class.
CONNECTIONS:    List other classes or files that this .java file reads from or writes to.
READS:          The .java file name and what this file reads from that file.
WRITES          The .java file name and what this file writes to that file.
LIST OF METHODS:List all the methods contatined in this class, their input parameters, and their outputs
-------------------------------------------------------------------------
INSTRUCTIONS TO TEAM MEMBERS FOR TEST:
1. Download this file into your apache netbeans 12 editor.
2. Change the file name to "Fname_group_test_2". You can do this by changing the public class name from "group_test_2" to your "Fname_group_test_2", then clicking on the error lightbulb on the line number, and selecting "rename file to Fname_group_test_2". Example: jason_group_test_2.java
3. Call the name_print() method in main so your name is printed when the class is run.
4. Upload and commit you file to the GitHub group project repository
--------------------------------------------------------------------------
 */

package SP_TEAM2_DnDTracker;

public class jason_group_test_2 {
    
   //note, create main method quickly with psvm + tab
    public static void main(String[] args) {
        name_print("Chase completed his assignment");
    }//end main
    
    
    
    public static void name_print(String name){
        System.out.println(name);
    }//end name_print
    
    
    
    /*-------------------------------------------------------------
    Purpose:        Brief description of the method's purpose OUTSIDE METHOD
    Inputs:         Describe what inputs its suppose to receive
    Outputs:        Describe what method outputs
    References:     Describe OTHER METHODS that this method calls or writes to (for calculations or for data)
    */
    public void method_1(){
        System.out.println("I like the format for describing method 1!");
    }// end method_1
    
    
    public void method_2(){
    /*
    Purpose:        Brief description of the method's purpose OUTSIDE METHOD
    Inputs:         Describe what inputs its suppose to receive
    Outputs:        Describe what method outputs
    References:     Describe OTHER METHODS that this method calls or writes to (for calculations or for data)
    */
        System.out.println("I like the format for describing method 2!");
    }//end method_2
    
}//end group_test_2
