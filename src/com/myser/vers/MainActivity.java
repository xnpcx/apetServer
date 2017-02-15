package com.myser.vers;

import android.app.*;
import android.content.*;
import android.graphics.drawable.*;
import android.os.*;
import android.view.*;
import android.view.View.*;
import android.view.animation.*;
import android.widget.*;
import java.io.*;
import java.io.File;
import java.util.EmptyStackException;
import android.net.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		// Load the ImageView that will host the animation and
// set its background to our AnimationDrawable XML resource.
		ImageView img = (ImageView)findViewById(R.id.spin_animation);
		img.setBackgroundResource(R.drawable.animation);

// Get the background, which has been compiled to an AnimationDrawable object.
		AnimationDrawable frameAnimation = (AnimationDrawable) img.getBackground();

// Start the animation (looped playback by default).
		frameAnimation.start();

		ImageView img1 = (ImageView)findViewById(R.id.spin);
		img1.setBackgroundResource(R.drawable.logo);

// Get the background, which has been compiled to an AnimationDrawable object.
		AnimationDrawable frameAnimation1 = (AnimationDrawable) img1.getBackground();

// Start the animation (looped playback by default).
		frameAnimation1.start();
	}
	public void subClick(View view)
	{
		Intent intent = new Intent(MainActivity.this,GameWebActivity.class);
		startActivity(intent);
	}

	public void klikClick(View view)
	{
		Uri uri = Uri.parse("https://invite.cashtree.id/86ed2a");
		Intent intent = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(intent);
	}

	public void hcClick(View view)
	{
		Uri uri = Uri.parse("https://play.google.com/store/apps/details?id=net.okitoo.hackers&referrer=1_anehA");
		Intent intent = new Intent(Intent.ACTION_VIEW,uri);
		startActivity(intent);
	}
	public final static boolean DEBUG = false;
}
