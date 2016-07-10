package com.example.tuckingfypos.to_do_list;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class ItemList extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_item_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "New Item added", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        //TODO: onClick that takes a String from EditText and makes it a ToDoItem for this ToDoList
        //TODO: longClick on the ToDoItem that deletes it from the current ToDoList
        //TODO: longClick on the ToDoList title that deletes the entire ToDoList

    }

}
