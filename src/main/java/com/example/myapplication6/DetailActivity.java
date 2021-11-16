package com.example.myapplication6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {
    private static final String TAG = "GalleryActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getIntentfromAdapter();
    }

    private void getIntentfromAdapter() {
        Log.d(TAG, "getIncomingIntent: checking for incoming intents.");

        if (getIntent().hasExtra("url_image") && getIntent().hasExtra("name_image") && getIntent().hasExtra("desc")){
            Log.d(TAG, "getIncomingIntent: found intent extras.");

            String urlImage = getIntent().getStringExtra("url_image");
            String nameImage = getIntent().getStringExtra("name_image");
            String desc = getIntent().getStringExtra("desc");


            setData(urlImage, nameImage, desc);
        }
    }

    private void setData(String urlImage, String nameImage, String desc) {
        Log.d(TAG, "setImage: setting te image and name to widgets.");

        TextView des = findViewById(R.id.desc_detail);
        des.setText(desc);
        des.setMovementMethod(new ScrollingMovementMethod());
        des.setMovementMethod(new LinkMovementMethod());

        TextView name = findViewById(R.id.image_description);
        name.setText(nameImage);

        ImageView image = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(urlImage)
                .into(image);
    }
}