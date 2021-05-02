package com.example.cropimagedemo;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.theartofdev.edmodo.cropper.CropImage;

public class MainActivity extends AppCompatActivity {

    ImageButton btBrowse, btReset;
    ImageView imageview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btBrowse = findViewById(R.id.bt_browse);
        btReset = findViewById(R.id.bt_reset);
        imageview = findViewById(R.id.imageview);
        btBrowse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CropImage.startPickImageActivity(MainActivity.this);
            }
        });
    }

    btReset.setOnClickListener (new View.OnClickListener(){


        @Override
        public void onClick(View v)
        {
        imageview.setImageBitmap(null);

        }
    });
}
@Override
protected void onActivityResult(int requestCode,int resultcode, @Nullable intent data)
        if(requestCode ==CropImage.PICK_IMAGE_CHOOSER_REQUEST_CODE
        && resultcode ==Activity.RESULT_OK){
            Uri imageuri =CropImage.getPickImageResultUri(content this,data);
            if(CropImage.isReadExternalStoragePermissionReequired(content this,imageuri))
                uri=imageuri;
            requestPermissions(new String[]{Manifest.permission.READ_EXTERNAL_STORAGE,requestCode 0);

        }else{
                startCrop(imageuri);
        }
        }
        if (requestCode ==CropImage.CROP_IMAGE_ACTIVITY_REQUEST_CODE){
        CropImage.ActivityResult result=CropImage.getActivityResult(data);
        if(resultCode==RESULT_OK){
        IMAGEView.setImageURI(result.getUri());
        Toast.makeText(context this,resid: :ImageUpdate Successfully!!!!
        ,Toast.LENGTH_SHORT).show();
        }
        }
}
        private void startCrop(Uri imageuri) {
    CropImage.activity(imageuri)
        .setGuidelines(CropImageView.Guidelines.ON)
        .setMultiTouchEnabled(true)
        }