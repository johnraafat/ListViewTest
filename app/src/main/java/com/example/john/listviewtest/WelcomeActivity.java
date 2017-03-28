package com.example.john.listviewtest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class WelcomeActivity extends AppCompatActivity {
    TextView textView;
    ImageView imageView;
    TextView textView2;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);
        textView=(TextView)findViewById(R.id.textView);
        imageView=(ImageView)findViewById(R.id.imageView);
        textView2=(TextView)findViewById(R.id.textView2);
        button = (Button)findViewById(R.id.button);
        Bundle bundle = getIntent().getExtras();
        String name = bundle.getString("itemName");
        Integer img = bundle.getInt("itemImg");
        String num = bundle.getString("itemNum");
        textView.setText("Welcome "+name);
        imageView.setImageResource(img);
        textView2.setText("ID Number = "+num);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                intent.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(intent);
            }
        });
    }
}
