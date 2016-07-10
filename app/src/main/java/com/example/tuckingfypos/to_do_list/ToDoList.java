package com.example.tuckingfypos.to_do_list;

import java.util.List;

/**
 * Created by TuckingFypos on 7/7/16.
 */
public class ToDoList {

    String mTitle;
    List<ToDoItem> mToDoItemsList;

    public ToDoList(String mTitle) {
        this.mTitle = mTitle;
    }



    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mTitle) {
        this.mTitle = mTitle;
    }
}
