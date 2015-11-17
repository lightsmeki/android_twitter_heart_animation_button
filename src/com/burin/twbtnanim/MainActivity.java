package com.burin.twbtnanim;


import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	private ImageView btn_anim;
	private AnimationDrawable animationDrawable,AniDraw;
	private int flag = 0;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btn_anim = (ImageView) findViewById(R.id.btn_anim);
		btn_anim.setImageResource(R.drawable.animation);  
        animationDrawable = (AnimationDrawable) btn_anim.getDrawable();  
		btn_anim.setOnClickListener(new Button.OnClickListener(){  
			
            @Override  
            public void onClick(View v) {
            	
            	if(flag == 0){//按钮动画开始
					btn_anim.setImageResource(R.drawable.animation);
					animationDrawable.start();
					flag = 1;
            	}else if(flag == 1){//按钮复原
            		animationDrawable.selectDrawable(0);//回到第一帧
            		animationDrawable.stop();
            		flag = 0;
            	}
            }
        });  
	}
}
