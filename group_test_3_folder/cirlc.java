//inports for math and such

public class group_test_3_circle_area {

    private int diameter;
    private int diameter2;

    public group_test_3_square_area(int new_diameter)
    {
        radius = new_diameter / 2;
    }//end constructor

    public int get_area(){
        area = Math.PI * Math.pow(radius,2); //pir^2
        return area;
    }//end get_area
    
    
    
    //-----------------------------------------------------------------
    
    
    
    //Uninitialized constructor
    public group_test_3_circle_area()
    {
        diameter2 = diameter2;//put unitilized side2 in constructor
    }//end constructor
    
    //observer
    public int get_area_passed(int passed_diameter){
        diameter2 = (int) Math.floor(Math.pow(passed_diameter,2));
        return diameter2 ;
    }//end get_area_passed

}//end group_test_3_write class