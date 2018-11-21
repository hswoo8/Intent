package com.example.hswoo.intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BaseActivity extends AppCompatActivity {
    private Intent intent;
    protected TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_base);

        Button standard = findViewById(R.id.standard);
        Button singleTask = findViewById(R.id.singleTask);
        Button singleInstance = findViewById(R.id.singleTop);
        Button singleTop = findViewById(R.id.clearTop);

        textView = findViewById(R.id.current);
        textView.setText(toString());

        standard.setOnClickListener(view -> {
            intent = new Intent(this, StandardActivity.class);
            startActivity(intent);
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

    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
