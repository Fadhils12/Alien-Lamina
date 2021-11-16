package com.example.myapplication6;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private static final String TAG = "Adapter";

    private ArrayList<String> nameItem = new ArrayList<>();
    private ArrayList<String> imageItem = new ArrayList<>();
    private ArrayList<String> descItem = new ArrayList<>();
    private Context context;

    public Adapter(ArrayList<String> nameItem, ArrayList<String> imageItem, ArrayList<String> descItem, Context context) {
        this.nameItem = nameItem;
        this.imageItem = imageItem;
        this.descItem = descItem;
        this.context = context;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        CircleImageView image;
        TextView name;
        TextView desc;
        RelativeLayout parentLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            image = itemView.findViewById(R.id.image);
            name = itemView.findViewById(R.id.name);
            desc = itemView.findViewById(R.id.desc);
            parentLayout = itemView.findViewById(R.id.parent_layout);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, @SuppressLint("RecyclerView") int position) {
        Log.d(TAG, "onBindViewHolder: called.");

        Glide.with(context)
                .asBitmap()
                .load(imageItem.get(position))
                .into(holder.image);

        holder.name.setText(nameItem.get(position));

        holder.desc.setText(descItem.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Log.d(TAG, "onClick: clicked on: " + nameItem.get(position));

                Toast.makeText(context, nameItem.get(position), Toast.LENGTH_LONG).show();

                Intent intent = new Intent(context, DetailActivity.class);
                intent.putExtra("url_image", imageItem.get(position));
                intent.putExtra("name_image", nameItem.get(position));
                intent.putExtra("desc", descItem.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return nameItem.size();
    }


}
