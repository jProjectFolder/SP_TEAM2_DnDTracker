/*
Creator:        Jason Haldiman
Date:           02-27-22
Purpose:        The purpose of this file is to allow the team to access a file on GitHub and modify it to so it changes the main thread.

This file will have the team members call a printName() 
method and add there name. 

*/

package SP_TEAM2_DnDTracker;
public class GroupTest1 {
    

    public static void main(String[] args){
        //insert the nameCall() method here with name
        nameCall("Jason was here!");
        nameCall("Chase was here!");
        nameCall("Matthew was here!");
        nameCall("Roy was here!");
        nameCall("Colton was here!");


    }//end main

    
    
    //Method that prints passed argument
    public static void nameCall(String name){
        System.out.println(name);
    }//end nameCall

}//end class GroupTest1
