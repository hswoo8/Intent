package com.example.hswoo.dev_activity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
//        Intent intent = new Intent(this, MyActivity.class);
//        intent.putExtra("aaa", "bbb");
//
//        AppDatabase db = Room.databaseBuilder(getApplicationContext(), AppDatabase.class, "name").build();
//
//        UserDao userDao = db.userDao();
//        userDao.findByName("a", "b");

//        startActivity(intent);



    }
}
