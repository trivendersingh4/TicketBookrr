package com.trivendra.ticketbookrr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

import java.util.List;

public class SpinnerActivity extends AppCompatActivity implements
        OnItemSelectedListener {

    // Spinner element
    Spinner spinner, spinner2, spinner3, spinner4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        Button proceed;

        // Spinner element
        spinner = findViewById(R.id.spinner);
        spinner2 = findViewById(R.id.spinner2);
        spinner3 = findViewById(R.id.spinner3);
        spinner4 = findViewById(R.id.spinner4);

        // Spinner click listener
        spinner.setOnItemSelectedListener(this);
        spinner2.setOnItemSelectedListener(this);
        spinner3.setOnItemSelectedListener(this);
        spinner4.setOnItemSelectedListener(this);
        proceed = (Button) findViewById(R.id.proceed);
        proceed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SpinnerActivity.this, Screenlayout.class));
            }
        });


        DatabaseHelper2 helper = new DatabaseHelper2(this);
        MovieObject a = new MovieObject();




        helper.insertMovie(a);

        // Loading spinner data from database
        loadSpinnerData();
    }

    /**
     * Function to load the spinner data from SQLite database
     * */
    private void loadSpinnerData() {
        // database handler
        DatabaseHelper2 db = new DatabaseHelper2(getApplicationContext());

        List<String> dates = db.getAllDates();
        List<String> names = db.getAllNames();
        List<String> times = db.getAllTimes();
        List<String> seats = db.getAllSeats();

        ArrayAdapter<String> nameAdapter = setAdapter(names);

        ArrayAdapter<String> dateAdapter = setAdapter(dates);

        ArrayAdapter<String> timeAdapter = setAdapter(times);

        ArrayAdapter<String> seatAdapter = setAdapter(seats);

        // Drop down layout style - list view with radio button
        nameAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        dateAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        timeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        seatAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // attaching data adapter to spinner
        spinner.setAdapter(nameAdapter);
        spinner2.setAdapter(dateAdapter);
        spinner3.setAdapter(timeAdapter);
        spinner4.setAdapter(seatAdapter);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) { }

    @Override
    public void onNothingSelected(AdapterView<?> arg0) {
        // TODO Auto-generated method stub

    }

    public ArrayAdapter<String> setAdapter(List<String> strList){
        return new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, strList);
    }
}