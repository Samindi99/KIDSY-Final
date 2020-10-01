package com.project.kidsy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import io.paperdb.Paper;

public class AdminPannel extends AppCompatActivity {

    private Button LogoutBtn, QuoteBtn, Videobtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_pannel);

        LogoutBtn=findViewById(R.id.logout_btn);
        QuoteBtn=findViewById(R.id.qadd);
        Videobtn=findViewById(R.id.vadd);


        LogoutBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Paper.book().destroy();

                Intent intent = new Intent(AdminPannel.this,Welcome.class);
                startActivity(intent);
            }
        });

        QuoteBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPannel.this,AdminQuote.class);
                startActivity(intent);
            }
        });

        Videobtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminPannel.this,AdminVideo.class);
                startActivity(intent);
            }
        });

    }
}