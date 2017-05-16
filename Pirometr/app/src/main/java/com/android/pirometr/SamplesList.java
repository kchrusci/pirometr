package com.android.pirometr;

import android.app.ListActivity;
import android.provider.Contacts;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SamplesList extends ListActivity {

    TextView content;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_samples_list);


        //content = (TextView)findViewById(R.id.output);

        //listView = (ListView) findViewById(R.id.list);
        //TODO: get list of sample names from assets, also get the miniatures and apply them to the list
        String[] values = new String[] { "a", "b", "c" };

        //TODO: do it like here: http://www.androidinterview.com/android-custom-listview-with-image-and-text-using-arrayadapter/
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.samples_list_list_item, R.id.sample_name, values);

        // Assign adapter to List
        setListAdapter(adapter);
    }


    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {

        super.onListItemClick(l, v, position, id);

        // ListView Clicked item index
        int itemPosition = position;

        // ListView Clicked item value
        String itemValue = (String) l.getItemAtPosition(position);
        Toast.makeText(getApplicationContext(), "Click : \n  Position :"+itemPosition+"  \n  ListItem : " +itemValue, Toast.LENGTH_SHORT).show();

    }
}