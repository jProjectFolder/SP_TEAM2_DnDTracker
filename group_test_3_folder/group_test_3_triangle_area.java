/*
Notice this class has no "main" method. So this class holds data that 
must be called by a class with a running main.
A created "object" is the same thing as a created "instance." So 
player_object == player_instance. We shold choose one or the other. 
I vote object.
 */

public class group_test_3_triangle_area {
    /*
    Declaring the integer "side" private means only this class (or an 
    object created with it) can access the "side" variable. 
    This means that object1 has side1 and can access side 1 and object2 
    has side2 and can access side2, but object1 (and any other class,
    object, or inheritance class or object) cant access the private side2.
    */
    private int side;
    private int side2;
    private int height;

    //Initialized constructor BLUEPRINT (cookie cutter) for making an
    //object
    public group_test_3_triangle_area(int new_side, int new_height)
    {
	height = new_height;
        side = new_side;
    }//end constructor
    
    //Observers.
    /*
    These are the methods that observe the initialized object, and
    perform a task with its parameter(s), then return that result.
    */
    public int get_area(){
        side = side * height / 2; //bh/2
        return side;
    }//end get_area
    
    
    
    //-----------------------------------------------------------------
    
    
    
    //Uninitialized constructor
    public group_test_3_triangle_area()
    {
	height2 = height2;
        side2 = side2;//put unitilized side2 in constructor
    }//end constructor
    
    //observer
    public int get_area_passed(int passed_side, int passed_height){
        side2 = passed_side * passed_height / 2; 
        return side2;
    }//end get_area_passed

}//end group_test_3_write class
