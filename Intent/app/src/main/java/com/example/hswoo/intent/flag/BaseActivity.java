package com.example.hswoo.intent.flag;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.hswoo.intent.R;
import com.example.hswoo.intent.SingleTaskActivity;

public class BaseActivity extends AppCompatActivity {
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.intent_activity_base);

        TextView textView = findViewById(R.id.current);
        textView.setText(toString());

        findViewById(R.id.standard).setOnClickListener(view -> {
            intent = new Intent(this, NoFlagActivity.class);
            textView.setText(NoFlagActivity.class.getSimpleName());
            startActivity(intent);
        });

        findViewById(R.id.newTask).setOnClickListener(view -> {
            intent = new Intent(this, NewTaskActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
            intent.addFlags(Intent.FLAG_ACTIVITY_MULTIPLE_TASK);
            startActivity(intent);
        });

        findViewById(R.id.singleTop).setOnClickListener(view -> {
            intent = new Intent(this, SingleTopActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP);
            startActivity(intent);
        });

        findViewById(R.id.clearTop).setOnClickListener(view -> {
            intent = new Intent(this, ClearTopActivity.class);
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
            startActivity(intent);
        });
    }

    @NonNull
    @Override
    public String toString() {
        return getClass().getSimpleName();
    }
}
