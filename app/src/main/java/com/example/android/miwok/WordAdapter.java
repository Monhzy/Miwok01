package com.example.android.miwok;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by mycomputer on 2017/8/15.
 */

public class WordAdapter extends ArrayAdapter<Word> {


    private int mColorResourceId;

    public WordAdapter(Activity context,ArrayList<Word> words,int colorResourceId){
        super(context,0,words);
        mColorResourceId = colorResourceId;

    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView==null){
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list,parent,false);
        }

        Word currentWord = getItem(position);

        TextView englishTextView = (TextView)listItemView.findViewById(R.id.english_text_view);
        englishTextView.setText(currentWord.getmEnglish());

        TextView miwokTextView = (TextView)listItemView.findViewById(R.id.miwok_text_view);
        miwokTextView.setText(currentWord.getmMiwok());

        ImageView imageView = (ImageView)listItemView.findViewById(R.id.Image);

        // Set the theme color for the list item
        View textContainer = listItemView.findViewById(R.id.text);
        // Find the color that the resource ID maps to
        int color = ContextCompat.getColor(getContext(), mColorResourceId);
        // Set the background color of the text container View
        textContainer.setBackgroundColor(color);



        if(currentWord.hasImage()){
            imageView.setImageResource(currentWord.getId());
        }else{
            imageView.setVisibility(View.GONE);
        }
        return listItemView;
    }





}
