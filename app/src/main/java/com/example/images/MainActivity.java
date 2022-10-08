package com.example.images;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button lastimg;
    private Button nextimg;
    private ImageView imageView;
    private TextView textview;
    private int[] p = {R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e};
    private int Index = 0;
    private int count = p.length-1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init() {
        lastimg = (Button)findViewById(R.id.lastimg);
        nextimg = (Button) findViewById(R.id.nextimg);
        imageView=(ImageView) findViewById(R.id.imageView);
        textview=(TextView) findViewById(R.id.textView);
    }

    public void onClick(View view){
        switch(view.getId()){
            case R.id.lastimg:
                if(Index == 0){
                    Index = count;
                } else{
                    Index = Index - 1;
                }
                break;
            case R.id.nextimg:
                if(Index == count){
                    Index = 0;
                }else{
                    Index = Index + 1;
                }
                break;
            default:
                break;
        }
        imageView.setImageResource(p[Index]);
        textview.setText(Integer.toString(Index+1)+"/"+p.length);
    }

}