package com.example.planetsapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class MyCustomAdapter extends ArrayAdapter<Planet> {
    private ArrayList<Planet> planetsArrayList;
    Context context;
    public MyCustomAdapter(ArrayList<Planet> planetsArrayList, Context context){
        super(context, R.layout.item_list_layout, planetsArrayList);
        this.planetsArrayList = planetsArrayList;
        this.context = context;
    }
    //ViewHolder
    private static class MyViewHolder{
        TextView planetName;
        TextView moons;
        ImageView planetImage;
    }
    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Planet planet = getItem(position);

        MyViewHolder viewHolder;
        View result;

        if (convertView == null) {
            viewHolder = new MyViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.item_list_layout, parent, false);

            viewHolder.planetName = (TextView) convertView.findViewById(R.id.planetName);
            viewHolder.moons = (TextView) convertView.findViewById(R.id.moons);
            viewHolder.planetImage = (ImageView) convertView.findViewById(R.id.imageView);

            result = convertView;
            convertView.setTag(viewHolder);
        }else {
            viewHolder = (MyViewHolder) convertView.getTag();
            result = convertView;
        }

        viewHolder.planetName.setText(planet.getPlanetName());
        viewHolder.moons.setText(planet.getMoons());
        viewHolder.planetImage.setImageResource(planet.getPlanetImage());
        return result;
    }
}
