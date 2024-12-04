			
			//View Of What ever is saved
	
package com.example.hms;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity {

    TextView t;
    Button btn;

    String HOTEL,name,CheckIn,CheckOut;
    long id,phone,Amount,Days;


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.m,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        if (item.getItemId() == R.id.Refersh1) {
            recreate();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        t = findViewById(R.id.BILL_DETAILS);
        btn = findViewById(R.id.b);

        Bundle b = getIntent().getExtras();
        id = b.getLong("I");
        HOTEL = b.getString("HN");
        name = b.getString("N");
        phone = b.getLong("PN");
        CheckIn = b.getString("CI");
        CheckOut = b.getString("CO");
        Amount = b.getLong("A");
        Days = b.getLong("D");
        t.setText("Booking ID :- " + id+"\n" + "\nHotel Name :- " + HOTEL+"\n" + "\nName :- " + name+"\n" +
                "\nPhone Number :- " + phone+"\n" + "\nCheck-In Date :- " + CheckIn+"\n" +
                "\nCheck-Out Date :- " + CheckOut+"\n" + "\n No of Days :- " + Days+"\n" +
                "\nAmount Paid :- " + Amount);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Main5Activity.this,Main6Activity.class);
                startActivity(i);
            }
        });


    }
}
