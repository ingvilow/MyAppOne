package com.example.myappone;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.myappone.presenter.ApiService;
import com.example.myappone.views.FirstScreenViewModel;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FirstScreenViewModel firstScreenViewModel = new ViewModelProvider(this).get(FirstScreenViewModel.class);

        firstScreenViewModel.getHomeSellers();
        Button btn = (Button) findViewById(R.id.btn);
       btn.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               System.out.println("here2");
               firstScreenViewModel.getHomeSellers();
           }
       });
        //TextView textView = (TextView) findViewById(R.id.text);
    }

}