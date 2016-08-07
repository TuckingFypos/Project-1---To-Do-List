package com.example.tuckingfypos.to_do_list;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ListActivity extends AppCompatActivity {

    private ToDoListAdapter mListAdapter;
    private Singleton mSingleton;
    private int mListIndex;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showInputDialog();
            }
        });

        mSingleton = Singleton.getInstance();

        mListIndex = getIntent().getIntExtra("index",-1);

        toolbar.setTitle(mSingleton.getToDoLists().get(mListIndex).getTitle());

        setSupportActionBar(toolbar);
//        getSupportActionBar().setDisplayShowHomeEnabled(true);

        mListAdapter = new ToDoListAdapter(this,mSingleton.getToDoLists().get(mListIndex).getToDoItems());
        ListView listView = (ListView)findViewById(R.id.items_list_view);
        TextView emptyItemTextView = (TextView)findViewById(R.id.empty_item_text_view);
        listView.setAdapter(mListAdapter);
        listView.setEmptyView(emptyItemTextView);

        listView.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                mSingleton.getToDoLists().get(mListIndex).getToDoItems().remove(position);
                mListAdapter.notifyDataSetChanged();
                return false;
            }
        });


    }

    public void showInputDialog(){
        AlertDialog.Builder dialogBuilder = new AlertDialog.Builder(this);
        LayoutInflater inflater = this.getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.text_dialog, null);
        dialogBuilder.setView(dialogView);

        final EditText titleEditText = (EditText) dialogView.findViewById(R.id.title_text);
        final EditText descriptionEditText = (EditText) dialogView.findViewById(R.id.description_text);


        dialogBuilder.setTitle("To-Do Item");
        dialogBuilder.setMessage("Enter item title and description below");
        dialogBuilder.setPositiveButton("Done", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
                if(titleEditText.getText().toString().length() == 0) {
                    Toast.makeText(ListActivity.this, "Please enter an item title", Toast.LENGTH_SHORT).show();
                } else {
                    mSingleton.getToDoLists().get(mListIndex).getToDoItems().
                            add(new ToDoItem(titleEditText.getText().toString(),
                                    descriptionEditText.getText().toString()));
                    mListAdapter.notifyDataSetChanged();
                }
            }
        });
        dialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int whichButton) {
            }
        });
        AlertDialog b = dialogBuilder.create();
        b.show();
    }

}