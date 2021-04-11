package com.example.tugas3_achmadsyahrulhanafi_123180112;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class DetailActivity extends AppCompatActivity {

    ImageView iv_playerPhoto;
    TextView tv_playerName, tv_teamName, tv_info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        iv_playerPhoto = findViewById(R.id.iv_playerPhoto);
        tv_playerName = findViewById(R.id.tv_playerName);
        tv_teamName = findViewById(R.id.tv_teamName);
        tv_info = findViewById(R.id.tv_info);

        getIncomingExtra();
    }
    private void getIncomingExtra(){
        if(getIntent().hasExtra("player_photo") && getIntent().hasExtra("player_name") && getIntent().hasExtra("team_name") && getIntent().hasExtra("info")){
            String playerPhoto = getIntent().getStringExtra("player_photo");
            String playerName = getIntent().getStringExtra("player_name");
            String teamName = getIntent().getStringExtra("team_name");
            String info = getIntent().getStringExtra("info");

            setDataActivity(playerPhoto, playerName, teamName, info);
        }
    }

    private void setDataActivity(String playerPhoto, String playerName, String teamName, String info){
        Glide.with(this).asBitmap().load(playerPhoto).into(iv_playerPhoto);
        tv_playerName.setText(playerName);
        tv_teamName.setText(teamName);
        tv_info.setText(info);
    }
}