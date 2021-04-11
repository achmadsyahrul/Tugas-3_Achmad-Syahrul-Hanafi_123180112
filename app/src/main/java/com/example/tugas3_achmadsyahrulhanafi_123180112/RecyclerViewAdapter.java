package com.example.tugas3_achmadsyahrulhanafi_123180112;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    private ArrayList<String> teamLogo = new ArrayList<>();
    private ArrayList<String> playerName = new ArrayList<>();
    private ArrayList<String> teamName = new ArrayList<>();
    private ArrayList<String> playerGoals = new ArrayList<>();
    private ArrayList<String> playerPhoto = new ArrayList<>();
    private ArrayList<String> info = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(ArrayList<String> teamLogo, ArrayList<String> playerName, ArrayList<String> teamName, ArrayList<String> playerGoals, ArrayList<String> playerPhoto, ArrayList<String> info, Context context) {
        this.teamLogo = teamLogo;
        this.playerName = playerName;
        this.teamName = teamName;
        this.playerGoals = playerGoals;
        this.playerPhoto = playerPhoto;
        this.info = info;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_design_adapter, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).asBitmap().load(teamLogo.get(position)).into(holder.iv_teamLogo);

        holder.tv_teamName.setText(teamName.get(position));
        holder.tv_playerName.setText(playerName.get(position));
        holder.tv_playerGoals.setText(playerGoals.get(position));

        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("player_photo", playerPhoto.get(position));
                intent.putExtra("player_name", playerName.get(position));
                intent.putExtra("team_name", teamName.get(position));
                intent.putExtra("info", info.get(position));
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return playerName.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        ImageView iv_teamLogo, iv_playerPhoto;
        TextView tv_playerName, tv_teamName, tv_playerGoals, tv_info;
        LinearLayout linearLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            iv_teamLogo = itemView.findViewById(R.id.iv_teamLogo);
            iv_playerPhoto = itemView.findViewById(R.id.iv_playerPhoto);
            tv_playerName = itemView.findViewById(R.id.tv_playerName);
            tv_teamName = itemView.findViewById(R.id.tv_teamName);
            tv_playerGoals = itemView.findViewById(R.id.tv_playerGoals);
            tv_info = itemView.findViewById(R.id.tv_info);
            linearLayout = itemView.findViewById(R.id.linearLayout);

        }
    }
}
