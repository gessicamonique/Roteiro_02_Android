package com.example.sonyvaio.aula04;

import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Aula04Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aula04);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("OI MOBRAL!!");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }

        TextView textView1 = (TextView) findViewById(R.id.textView);
        final TextView textView2 = (TextView) findViewById(R.id.textView);


        LinearLayout linearLayout = (LinearLayout) findViewById(R.id.linear);

        // LayoutInflater inflater = LayoutInflater.from(this);
        //inflater.inflate(R.layout.edit, linearLayout, false);

        View view = View.inflate(this, R.layout.id, linearLayout);

        final EditText editText = (EditText) view.findViewById(R.id.editText);
        textView2.setText(editText.getText().toString());

        ((Button) findViewById(R.id.button)).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                textView2.setText(editText.getText().toString());
            }
        });
    }
        public boolean onOptionsItemSelected(MenuItem item){
            int id = item.getItemId();

            if(id == android.R.id.home){
                Toast.makeText(Aula04Activity.this, "Voltei", Toast.LENGTH_SHORT.show());
            }

            return super.onOptionsItemSelected(item);


    }
}
