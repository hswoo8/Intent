package com.example.hswoo.intent;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.action_view).setOnClickListener(view -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String scheme = "market";
            String host = "host";
            StringBuilder builder = new StringBuilder();
            StringBuilder uri = builder.append(scheme)
                    .append("://")
                    .append(host)
                    .append("?text=test");

            intent.setData(Uri.parse(uri.toString()));
            System.out.println(uri.toString());
            intent.putExtra("text", "text");
            startActivity(intent);
        });

        findViewById(R.id.standard).setOnClickListener(view -> startActivity(new Intent(this, StandardActivity.class)));


    }
}
