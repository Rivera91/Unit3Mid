package nyc.c4q.unit3mid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import java.util.Map;

import nyc.c4q.unit3mid.controller.DisplayAdapter;

public class RecyclerActivity extends AppCompatActivity {

    private String user;
    private ArrayList prefEntries;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recyclerView);

        if (getIntent().hasExtra("sharedprefs")) {
            user = getIntent().getExtras().getString("sharedprefs");
        }


        SharedPreferences sharedPreferences = getSharedPreferences(user,MODE_PRIVATE);

        Map<String, ?> allEntries = sharedPreferences.getAll();
        for (Map.Entry<String, ?> entry : allEntries.entrySet()) {
            prefEntries.add(entry.getValue());
        }

        DisplayAdapter displayAdapter = new DisplayAdapter(prefEntries);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);
        //LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setAdapter(displayAdapter);
        recyclerView.setLayoutManager(linearLayoutManager);

    }
}




