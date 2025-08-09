package com.Veer_s_Code.DataStructures;

import java.util.ArrayList;//built in package

public class MyList {
    
    private ArrayList<Integer> list =  new ArrayList<>();

    //method to print elements of a list  
    public void printList(){
        System.out.println("List : "+ list);
    }

    public void addElement(int a){
        this.list.add(a);
    }
}
