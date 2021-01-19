package com.trivendra.ticketbookrr;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class movieDetails extends AppCompatActivity {
    private Button button;
    private Button back3;
    int seats;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_details);
        TextView textView= (TextView)findViewById(R.id.tickets);
        seats = getIntent().getExtras().getInt("NUMBER");
        textView.setText("Number of Seats: " + "" +seats+"\n\n"+"Total Amount: "+ ""+seats*80);
        button = (Button)findViewById(R.id.confirm);
        back3 = (Button)findViewById(R.id.back);
        back3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openLogin();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openfinalconfirm();
            }
        });

    }
    public void openfinalconfirm() {
        Intent intent = new Intent(this, phoneVerification.class);
        startActivity(intent);

    }
    public void openLogin() {
        Intent intent4 = new Intent(this, SpinnerActivity.class);
        startActivity(intent4);
    }
}
