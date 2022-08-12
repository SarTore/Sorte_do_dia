package br.com.up.sortedodia;


import androidx.appcompat.app.AppCompatActivity;
import android.view.View;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView textViewTitle;
    private Button buttonAction;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textViewTitle = findViewById(R.id.textView);
        buttonAction = findViewById(R.id.button_action);


        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String[] messages = {"um", "dois", "tres", "quatro"};
                int position = new Random().nextInt(messages.length);
                String message = messages[position];
                textViewTitle.setText(message);
            }
        };
        buttonAction.setOnClickListener(listener);

    }

}