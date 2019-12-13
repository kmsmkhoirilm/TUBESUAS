package com.example.futsalken;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class PicActivity extends AppCompatActivity {
    private static int currentPage;
    private static int NUM_PAGES;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pic);

        BottomNavigationView BottomNavigationView = findViewById(R.id.bn_main);
        BottomNavigationView.setOnNavigationItemSelectedListener(navListener);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportFragmentManager().beginTransaction().replace(R.id.fl_container,new PicFragment()).commit();
    }

    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
            new BottomNavigationView.OnNavigationItemSelectedListener() {
                @Override
                public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                    Fragment fragment = null;
                    switch (item.getItemId()) {
                        case R.id.pic_menu:
                            fragment = new PicFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
                            break;
                        case R.id.comment_menu:
                            fragment = new CommentFragment();
                            getSupportFragmentManager().beginTransaction().replace(R.id.fl_container, fragment).commit();
                            break;
                    }
                    return true;
                }
            };
    @Override
    public boolean onSupportNavigateUp() {
        finish();
        return true;
    }
}
