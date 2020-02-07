package com.androidapp.supunisharaweerasekara.recyclerviewapp.Activities;

import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.androidapp.supunisharaweerasekara.recyclerviewapp.R;

public class ResultActivity extends AppCompatActivity {
    private TextView tvID;
    private TextView tvFirstName;
    private TextView tvLastName;
    private TextView tvContactNo;

    private String firstName;
    private String lastName;
    private String contactNo;
    private int id;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        tvID = findViewById(R.id.tvID);
        tvFirstName = findViewById(R.id.tvFirstName);
        tvLastName = findViewById(R.id.tvLastName);
        tvContactNo = findViewById(R.id.tvContactNo);

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            id = extras.getInt("id");
            firstName = extras.getString("firstName");
            lastName = extras.getString("lastName");
            contactNo = extras.getString("contactNo");

            tvID.setText(String.valueOf(id));
            tvFirstName.setText(firstName);
            tvLastName.setText(lastName);
            tvContactNo.setText(contactNo);
        }

    }
}
