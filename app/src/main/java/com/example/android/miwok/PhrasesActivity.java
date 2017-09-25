package com.example.android.miwok;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;

public class PhrasesActivity extends AppCompatActivity {

    private  MediaPlayer mediaPlayer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        final ArrayList<Word> words = new ArrayList<Word>();
        words.add(new Word("Where are you\n" +
                "going?","minto wuksus",R.raw.mui));
        words.add(new Word("What is your name?","tinnə oyaase'nə"
                ,R.raw.mui));
        words.add(new Word("My name is...","oyaaset...",R.raw.mui));



        WordAdapter adapter = new WordAdapter(this,words,R.color.category_phrases);
        ListView listView = (ListView)findViewById(R.id.list);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {






                Word word = words.get(i);
                mediaPlayer = MediaPlayer.create(PhrasesActivity.this,
                        word.getMusicResourceId());
                if(mediaPlayer!=null&&mediaPlayer.isPlaying()){
                    mediaPlayer.stop();
                    mediaPlayer.release();
                    mediaPlayer = null;
                }else{
                    mediaPlayer.start();
                }

            }
        });

    }
}
