package com.example.sonyvaio.aula06application;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

import java.util.List;

/**
 * Created by sony vaio on 03/03/2016.
 */
public class PlanetaAdapter extends BaseAdapter {

    private List<Planeta> planetas;

    public PlanetaAdapter(List<Planeta> planetas) {
        this.planetas = planetas;
    }

    @Override
    public int getCount() {
        return planetas.size();
    }

    @Override
    public Object getItem(int position) {
        return planetas.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Context context;
        View view = LayoutInflater.from(context).inflate(R.layout.layout_item_list, parent, false);

        Planeta planeta =  planetas.get(position);
        {(ImageView) view.findViewById(R.id.imageView)).setImageAlpha(planeta.getIdImagem());


            return view;

    
    }
}