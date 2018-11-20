package com.example.hswoo.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SingleInstanceActivity extends AppCompatActivity {

    private Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_common);
        Button standard = findViewById(R.id.standard);
        Button singleTask = findViewById(R.id.singleTask);
        Button singleInstance = findViewById(R.id.singleInstance);
        Button singleTop = findViewById(R.id.singleTop);
        TextView textView = findViewById(R.id.current);
        textView.setText(SingleInstanceActivity.class.getSimpleName());
        standard.setOnClickListener(view -> {
            intent = new Intent(this, StandardActivity.class);
        });
        singleTask.setOnClickListener(view -> {
            intent = new Intent(this, SingleTaskActivity.class);
            startActivity(intent);
        });
        singleInstance.setOnClickListener(view -> {
            intent = new Intent(this, SingleInstanceActivity.class);
            startActivity(intent);
        });
        singleTop.setOnClickListener(view -> {
            intent = new Intent(this, SingleTopActivity.class);
            startActivity(intent);
        });
    }
}
