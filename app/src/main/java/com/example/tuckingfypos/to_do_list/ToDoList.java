package com.example.tuckingfypos.to_do_list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by TuckingFypos on 7/7/16.
 */
public class ToDoList {

    String mTitle;
    List<ToDoItem> mToDoItemsList;

    public ToDoList(String mTitle) {
        this.mTitle = mTitle;
        mToDoItemsList = new ArrayList<>();
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public List<ToDoItem> getToDoItems(){
        return mToDoItemsList;
    }
}
