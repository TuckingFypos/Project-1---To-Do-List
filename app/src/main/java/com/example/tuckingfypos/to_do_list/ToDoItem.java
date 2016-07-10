package com.example.tuckingfypos.to_do_list;

/**
 * Created by TuckingFypos on 7/7/16.
 */
public class ToDoItem {
    private String mItem;

    public ToDoItem(String mItem) {
        this.mItem = mItem;
    }

    public ToDoItem(){
        mItem = "";
    }

    public String getmItem() {
        return mItem;
    }

    public void setmItem(String mItem) {
        this.mItem = mItem;
    }
}
