package com.example.android.miwok;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.word_list);

        //Declaring array for the english words
        ArrayList<Word> words = new ArrayList<Word>();
        //Initializing the elements of the array
        words.add(new Word("one", "lutti",R.drawable.number_one));
        words.add(new Word("two", "otiiko",R.drawable.number_two));
        words.add(new Word("three", "tolookosu",R.drawable.number_three));
        words.add(new Word("four", "oyyisa",R.drawable.number_four));
        words.add(new Word("five", "massokka",R.drawable.number_five));
        words.add(new Word("six", "temmokka",R.drawable.number_six));
        words.add(new Word("seven", "kenekaku",R.drawable.number_seven));
        words.add(new Word("eight", "kawinta",R.drawable.number_eight));
        words.add(new Word("nine", "wo'e",R.drawable.number_nine));
        words.add(new Word("ten", "na'aacha",R.drawable.number_ten));

        //Logging statements to verbose Logcat
        Log.i("Numbers Activity", "English Number ArrayList created with a total of " + words.size() + " words");

        WordAdapter adapter = new WordAdapter(this, words);


        ListView listView = findViewById(R.id.rootView);
        listView.setAdapter(adapter);
        Log.i(" Aveg", String.valueOf(countBlocks(new double[]{87.8, 32.1, 32.21, 35, 43.6})));


    }

    public String findLongestName(String [] names){
        int namesize = names.length;
        String LongestName = names[0];
        for(int i = 1;i<namesize;i++)
            if(LongestName.length() < names[i].length()){
                return LongestName;
            }
        return LongestName;
    }

    public double countBlocks(double[] temperatures) {
        int size = temperatures.length;
        double total = 0;
        for (int i = 0; i < size; i++) {
            total += temperatures[i];
        }
        double average = (total / size);
        return average;
    }

}
