package com.example.tuckingfypos.to_do_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TuckingFypos on 7/25/16.
 */
public class Singleton {
    private static Singleton sToDoSingleton = null;
    private static List<ToDoList> sToDoLists;

    private Singleton(){
        sToDoLists = new ArrayList<>();
    }

    public static Singleton getInstance(){
        if(sToDoSingleton == null)
            sToDoSingleton = new Singleton();
        return sToDoSingleton;
    }

    public void addToDoList(ToDoList toDoList){
        sToDoLists.add(toDoList);
    }

    public List<ToDoList> getToDoLists(){
        return sToDoLists;
    }
}
