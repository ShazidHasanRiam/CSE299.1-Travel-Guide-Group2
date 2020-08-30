package com.example.traveller.RecommendedPlaces;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.models.SlideModel;
import com.example.traveller.R;

import java.util.ArrayList;
import java.util.List;

public class DetailsInfo extends AppCompatActivity {
    private ImageSlider imageSlider;
    private TextView textView,placename;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details_info);
        textView=findViewById(R.id.placedetails);
        placename=findViewById(R.id.placename);
        imageSlider=findViewById(R.id.image_slider1);

        Intent intent=getIntent();
        String placeName=intent.getStringExtra("placeName");
        String placeDetails=intent.getStringExtra("placeDetails");
        String placeImage=intent.getStringExtra("placeImage");
        String placeImage1=intent.getStringExtra("placeImage1");
        String placeImage2=intent.getStringExtra("placeImage2");

        placename.setText(placeName);
        textView.setText(placeDetails);


        List<SlideModel> slideModels=new ArrayList<>();

        slideModels.add(new SlideModel(placeImage));
        slideModels.add(new SlideModel(placeImage1));
        slideModels.add(new SlideModel(placeImage2));


        imageSlider.setImageList(slideModels, true);


    }
}