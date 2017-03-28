package com.example.john.listviewtest;

import android.app.Activity;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
public class CustomListAdapter extends ArrayAdapter<String> {
    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;
    private final String[] itemNumber;
    public CustomListAdapter(Activity context, String[] itemname, Integer[] imgid, String[] itemNumber) {
        super(context, R.layout.mylist, itemname);
        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
        this.itemNumber =itemNumber;
    }
    public View getView(int position,View view,ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowView=inflater.inflate(R.layout.mylist, null,true);
        TextView txtTitle = (TextView) rowView.findViewById(R.id.item);
        TextView extratxt = (TextView) rowView.findViewById(R.id.textView1);
        ImageView imageview1 = (ImageView) rowView.findViewById(R.id.imageView1);
        txtTitle.setText(itemname[position]);
        imageview1.setImageResource(imgid[position]);
        extratxt.setText("ID : "+itemNumber[position]);
        return rowView;


    };

}