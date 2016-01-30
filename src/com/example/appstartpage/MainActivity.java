package com.example.appstartpage;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.drawable.AnimationDrawable;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {

    ImageView imageView;
    ImageView view1;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initAnimOne();
        initAnimTwo();
     }

	private void initAnimTwo() {
		// TODO Auto-generated method stub
		view1 = (ImageView) findViewById(R.id.anim_one);
		view1.setImageResource(R.drawable.anim_two);
		AnimationDrawable animationDrawable = (AnimationDrawable) view1.getDrawable();
		animationDrawable.start();
	}

	private void initAnimOne() {
		// TODO Auto-generated method stub
		imageView = (ImageView) findViewById(R.id.imageview);
        Animation animation = AnimationUtils.loadAnimation(this, R.anim.imageplay);
        imageView.setAnimation(animation);
        imageView.setVisibility(View.VISIBLE);
	}
}
