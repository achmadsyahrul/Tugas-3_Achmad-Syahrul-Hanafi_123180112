package com.example.tugas3_achmadsyahrulhanafi_123180112;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> teamLogo = new ArrayList<>();
    private ArrayList<String> playerName = new ArrayList<>();
    private ArrayList<String> teamName = new ArrayList<>();
    private ArrayList<String> playerGoals = new ArrayList<>();
    private ArrayList<String> playerPhoto = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getData();
    }

    private void prosesRecyclerViewAdapter(){
        RecyclerView recyclerView = findViewById(R.id.recyclerView);
        RecyclerViewAdapter adapter = new RecyclerViewAdapter(teamLogo, playerName, teamName, playerGoals, playerPhoto, info, this);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getData(){
        teamLogo.add("https://ssl.gstatic.com/onebox/media/sports/logos/k3Q_mKE98Dnohrcea0JFgQ_96x96.png");
        playerName.add("Harry Kane");
        teamName.add("Spurs");
        playerGoals.add("19");
        playerPhoto.add("https://resources.premierleague.com/premierleague/photos/players/250x250/p78830.png");
        info.add(" Penampilan\t: 29\n Goal\t\t\t\t\t\t: 19\n Assist\t\t\t\t\t: 13\n Menang\t\t\t: 14\n Kalah\t\t\t\t\t: 8");

        teamLogo.add("https://ssl.gstatic.com/onebox/media/sports/logos/0iShHhASp5q1SL4JhtwJiw_96x96.png");
        playerName.add("Mohamed Salah");
        teamName.add("Liverpool");
        playerGoals.add("18");
        playerPhoto.add("https://resources.premierleague.com/premierleague/photos/players/250x250/p118748.png");
        info.add(" Penampilan\t: 30\n Goal\t\t\t\t\t\t: 19\n Assist\t\t\t\t\t: 3\n Menang\t\t\t: 14\n Kalah\t\t\t\t\t: 9");

        teamLogo.add("https://ssl.gstatic.com/onebox/media/sports/logos/udQ6ns69PctCv143h-GeYw_96x96.png");
        playerName.add("Bruno Fernandes");
        teamName.add("Man Utd");
        playerGoals.add("16");
        playerPhoto.add("https://resources.premierleague.com/premierleague/photos/players/250x250/p141746.png");
        info.add(" Penampilan\t: 31\n Goal\t\t\t\t\t\t: 16\n Assist\t\t\t\t\t: 11\n Menang\t\t\t: 18\n Kalah\t\t\t\t\t: 4");

        teamLogo.add("https://ssl.gstatic.com/onebox/media/sports/logos/5dqfOKpjjW6EwTAx_FysKQ_96x96.png");
        playerName.add("Patrick Bamford");
        teamName.add("Leeds");
        playerGoals.add("14");
        playerPhoto.add("https://resources.premierleague.com/premierleague/photos/players/250x250/p106617.png");
        info.add(" Penampilan\t: 31\n Goal\t\t\t\t\t\t: 14\n Assist\t\t\t\t\t: 7\n Menang\t\t\t: 14\n Kalah\t\t\t\t\t: 14");

        teamLogo.add("https://ssl.gstatic.com/onebox/media/sports/logos/C3J47ea36cMBc4XPbp9aaA_96x96.png");
        playerName.add("Dominic Calvert");
        teamName.add("Everton");
        playerGoals.add("14");
        playerPhoto.add("https://resources.premierleague.com/premierleague/photos/players/250x250/p177815.png");
        info.add(" Penampilan\t: 26\n Goal\t\t\t\t\t\t: 14\n Assist\t\t\t\t\t: 0\n Menang\t\t\t: 13\n Kalah\t\t\t\t\t: 8");

        prosesRecyclerViewAdapter();

    }
}