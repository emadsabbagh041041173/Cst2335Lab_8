package com.example.cst2335lab_8;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity {
    DrawerLayout drawerLayout;
    NavigationView navigationView;
    Toolbar toolbar;

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.emad_menueup, menu);
        return true;
    }



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        drawerLayout = findViewById(R.id.drawerLayout);
        navigationView  = findViewById(R.id.navigationMenu);
        toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar, R.string.string_open, R.string.string_close);
        drawerLayout.addDrawerListener(toggle);
        toggle.syncState();







        navigationView.setNavigationItemSelectedListener(new NavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                drawerLayout.closeDrawer(GravityCompat.START);
                switch (item.getItemId()){
                    case R.id.draw1:
                        Toast.makeText(MainActivity.this, "Home Clicked", Toast.LENGTH_SHORT).show();
                        return true;
                    case R.id.draw2:
                        Toast.makeText(MainActivity.this, "DadJoke Clicked", Toast.LENGTH_SHORT).show();
                        Intent i = new Intent(MainActivity.this, DadJoke.class);
                        startActivity(i);


                        return true;
                    case R.id.draw3:
                        Toast.makeText(MainActivity.this, "Exit Clicked", Toast.LENGTH_SHORT).show();
                        finishAffinity();
                        return true;





                }
                return true;
            }
        });
    }





}