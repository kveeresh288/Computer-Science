package com.Veer_s_Code.App;

import com.Veer_s_Code.DataStructures.MyList; //importing MyList from DataStructures Package
// we have to use import to use class from different package

//import com.Veer_s_Code.DataStructures.*; //import everything from the data structures package
public class App {
    
    public static void main(String args[]){
    
    MyList mylist = new MyList();

    mylist.printList();

    mylist.addElement(1);
    mylist.addElement(2);
    mylist.addElement(3);

    mylist.printList();
    
        
    }
}
