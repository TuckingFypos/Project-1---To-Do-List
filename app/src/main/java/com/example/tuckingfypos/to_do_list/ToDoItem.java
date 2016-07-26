package com.example.tuckingfypos.to_do_list;

/**
 * Created by TuckingFypos on 7/7/16.
 */
public class ToDoItem {
    private String mTitle;
    private String mDescription;

    public ToDoItem(String mTitle, String mDescription) {
        this.mTitle = mTitle; this.mDescription = mDescription;
    }

    public ToDoItem(){
        mTitle = "Item";
    }

    public String getmTitle() {
        return mTitle;
    }

    public void setmTitle(String mItem) {
        this.mTitle = mItem;
    }

    public String getmDescription() {
        return mDescription;
    }

    public void setmDescription(String mDescription) {
        this.mDescription = mDescription;
    }
}
