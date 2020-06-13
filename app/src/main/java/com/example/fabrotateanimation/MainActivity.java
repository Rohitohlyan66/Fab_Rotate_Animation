package com.example.fabrotateanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.RotateAnimation;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    FloatingActionButton fab1,fab2;
    boolean isOpen=true;
    Animation rotate,back,open,close;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fab1=findViewById(R.id.fab1);
        fab2=findViewById(R.id.fab2);
         rotate=AnimationUtils.loadAnimation(this,R.anim.rotate);
         back=AnimationUtils.loadAnimation(this,R.anim.back);
         open=AnimationUtils.loadAnimation(this,R.anim.open);
         close=AnimationUtils.loadAnimation(this,R.anim.close);
        fab2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            animateFab();
            }
        });

    }
   private void animateFab()
   {
       if (isOpen)
       {
           fab1.startAnimation(open);
           fab1.setVisibility(View.VISIBLE);
           fab2.startAnimation(rotate);
           fab1.setClickable(true);
           isOpen=false;
       }
       else
       {
           fab1.startAnimation(close);
           fab1.setVisibility(View.INVISIBLE);
           fab2.startAnimation(back);
           fab1.setClickable(false);
           isOpen=true;
       }
   }
}
