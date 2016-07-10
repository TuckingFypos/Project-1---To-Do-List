package com.example.tuckingfypos.to_do_list;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    EditText getText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                final EditText textToGet =  (EditText) findViewById(R.id.new_list_edit);
                //findViewById(R.id.new_list_edit).setText(this, "");
                String textForTitle = textToGet.getText().toString();
                ToDoList newTDL = new ToDoList(textForTitle);
                Snackbar.make(view, "New List created", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
                TextView aTextView = new TextView(getApplicationContext());

                //TODO: make a new textView in the LinearLayout list_layout that displays the new ToDoList object
                //TODO: attach an onClickListener to the textView
                //TODO: use an intent to open the next Activity, ItemList.java

            }

            Intent intent = new Intent(MainActivity.this, ItemList.class);


        });


    }



    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
