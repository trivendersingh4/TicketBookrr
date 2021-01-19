package com.trivendra.ticketbookrr;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Screenlayout extends AppCompatActivity {
    int c=0,i,a;
    int y=1;
    String strID;
    Button back;
    private Button enter;
    int[] k={0,0,0,0,0,0};
    int[] j={0,0,0,0,0,0};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen_layout);
        back = (Button) findViewById(R.id.button57);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Screenlayout.this,SpinnerActivity.class));
            }
        });
        final Button[] button = {(Button)findViewById(R.id.button1), (Button)findViewById(R.id.button2), (Button)findViewById(R.id.button3), findViewById(R.id.button4),
                (Button)findViewById(R.id.button5), (Button)findViewById(R.id.button6), (Button)findViewById(R.id.button7), (Button)findViewById(R.id.button8), (Button)findViewById(R.id.button9), (Button)findViewById(R.id.button10),
                (Button)findViewById(R.id.button11),(Button) findViewById(R.id.button12), (Button)findViewById(R.id.button13), (Button)findViewById(R.id.button14), (Button)findViewById(R.id.button15), (Button)findViewById(R.id.button16), (Button)findViewById(R.id.button17), (Button)findViewById(R.id.button18),(Button)findViewById(R.id.button19),
                (Button)findViewById(R.id.button20), (Button)findViewById(R.id.button21), (Button)findViewById(R.id.button22), (Button)findViewById(R.id.button23), (Button)findViewById(R.id.button24), (Button)findViewById(R.id.button25), (Button)findViewById(R.id.button26),
                (Button) findViewById(R.id.button27),(Button) findViewById(R.id.button28), (Button)findViewById(R.id.button29), (Button)findViewById(R.id.button30), (Button)findViewById(R.id.button31), (Button)findViewById(R.id.button32), (Button)findViewById(R.id.button33), (Button)findViewById(R.id.button34),(Button)findViewById(R.id.button35),(Button)findViewById(R.id.button36),
                (Button) findViewById(R.id.button37),(Button) findViewById(R.id.button38), (Button)findViewById(R.id.button39), (Button)findViewById(R.id.button40), (Button)findViewById(R.id.button41), (Button)findViewById(R.id.button42), (Button)findViewById(R.id.button43), (Button)findViewById(R.id.button44),
                (Button) findViewById(R.id.button45), (Button)findViewById(R.id.button46), (Button)findViewById(R.id.button47), (Button)findViewById(R.id.button48), (Button)findViewById(R.id.button49), (Button)findViewById(R.id.button50), (Button)findViewById(R.id.button51), (Button)findViewById(R.id.button52),
                (Button) findViewById(R.id.button53),(Button) findViewById(R.id.button54), (Button)findViewById(R.id.button55), (Button)findViewById(R.id.button56)};

        View.OnClickListener myListener =new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int ID6=v.getId();

                y=1;
                for(i=0;i<6;i++) {

                    if (ID6 == k[i]) {

                            for(a=i;a<=c;a++) {
                                if (a < 5)
                                    k[a] = k[a + 1];
                                if(a==5) {
                                    k[5] = 0;
                                    Log.d("MyApplication3", "BUtton presseddanish");

                                }  }
                            y = 0;
                            c--;
                            int ID = v.getId();
                            final Button buttonM = (Button) findViewById(ID);

                            buttonM.setBackgroundColor(Color.GRAY);
                    }
                                 }


                switch (c) {
                    case 0:  Log.d("MyApplication3", "BUtton pressed00000000");

                        int ID = v.getId();
                        if(y==1) {
                            k[0] = ID;
                            final Button buttonA = (Button) findViewById(ID);

                            buttonA.setBackgroundColor(Color.GREEN);
                        }
                       break;
                    case 1: Log.d("MyApplication3", "BUtton pressed001");

                        int ID1 = v.getId();
                        if(y==1) {
                            k[1] = ID1;
                            final Button buttonB = (Button) findViewById(ID1);


                            buttonB.setBackgroundColor(Color.GREEN);
                        }
                        break;
                    case 2:  Log.d("MyApplication3", "BUtton pressed002");

                        int ID2= v.getId();
                        if(y==1) {
                            k[2] = ID2;
                            final Button buttonC = (Button) findViewById(ID2);
                            if (y == 1)
                                buttonC.setBackgroundColor(Color.GREEN);
                        }break;
                    case 3:  Log.d("MyApplication3", "BUtton pressed003");

                        int ID3 = v.getId();
                        if(y==1) {
                            k[3] = ID3;
                            final Button buttonD = (Button) findViewById(ID3);

                            buttonD.setBackgroundColor(Color.GREEN);
                        }
                        break;

                    case 4: Log.d("MyApplication3", "BUtton pressed004");

                        int ID4 = v.getId();
                        if(y==1) {
                            k[4] = ID4;
                            final Button buttonE = (Button) findViewById(ID4);

                            buttonE.setBackgroundColor(Color.GREEN);
                        }break;

                    case 5:
                        Log.d("MyApplication3", "BUtton pressed005");

                        int ID5 = v.getId();
                        if(y==1) {
                            k[5] = ID5;
                            final Button buttonF = (Button) findViewById(ID5);

                            buttonF.setBackgroundColor(Color.GREEN);

                        }

                        break;

                    default:
                        Toast myToast = Toast.makeText(getApplicationContext(),"Maximum 6 seats Allowed", Toast.LENGTH_SHORT);
                        myToast.show();
                        break;
                }
            if(c<6&&y==1)
             c++;



            }
        };
        for( i=0;i<56;i++)
            button[i].setOnClickListener(myListener);
        enter = (Button) findViewById(R.id.button58);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openNext();
            }
        });
    }
    public void openNext() {
        Intent intent2 = new Intent(this, movieDetails.class);
        intent2.putExtra("NUMBER",c);
        startActivity(intent2);
    }
    }

