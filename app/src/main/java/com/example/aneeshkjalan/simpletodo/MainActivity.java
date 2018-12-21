package com.example.aneeshkjalan.simpletodo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<String> items;
    ArrayAdapter<String> itemsAdapt;
    ListView lvItems;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        readItems();
        itemsAdapt = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, items);
        lvItems = (ListView) findViewById(R.id.lv_items);

        lvItems.setAdapter(itemsAdapt);

        //mock data
        //items.add("First item");
        //items.add("Second Item");

        setupListViewListener();
    }

    public void onAddItem (View v) {
        EditText newItem = (EditText) findViewById(R.id.et_new_item);
        itemsAdapt.add(newItem.getText().toString());
        newItem.setText("");
        writeItems();
        Toast.makeText(getApplicationContext(), "Item added to list", Toast.LENGTH_SHORT).show();
    }

    private void setupListViewListener () {
        Log.i("MainActivity", "Setting up the Long Click Listener");
        lvItems.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {

            @Override
            public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
                Log.i("MainActivity", "Item removed form List: " + position);
                items.remove(position);
                itemsAdapt.notifyDataSetChanged();
                writeItems();
                return true;
            }
        });
    }

    private File getDataFile () {
        return new File(getFilesDir(), "todo.txt");
    }

    private void readItems () {
        try {
            items = new ArrayList<>(FileUtils.readLines(getDataFile(), Charset.defaultCharset()));
        } catch (IOException e) {
            Log.e("MainActivity", "Error reading from file ", e);
            items = new ArrayList<>();
        }
    }

    private void writeItems () {
        try {
            FileUtils.writeLines(getDataFile(), items);
        } catch (IOException e) {
            Log.e("MainActivity", "Error writing to file ", e);
        }
    }
}
