package com.example.appank.listviewdengangambar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    int[] image ={R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp,
            R.drawable.ic_person_black_24dp };
    String [] text = {"Andi",
            "Rani",
            "Anto",
            "Ani"};

    String [] text2 = {"laki-laki","perempuan","laki-laki","perempuan"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView = (ListView) findViewById(R.id.listView);
        costumAdaptor costumAdaptor = new costumAdaptor();
        listView.setAdapter(costumAdaptor);


    }

    class costumAdaptor extends BaseAdapter {

        @Override
        public int getCount() {
            return image.length;
        }

        @Override
        public Object getItem(int position) {
            return null;
        }

        @Override
        public long getItemId(int position) {
            return 0;
        }

        @Override
        public View getView(int position, View convertView, ViewGroup parent) {
            View view = getLayoutInflater().inflate(R.layout.layoutcostume,null);
            ImageView imageView = view.findViewById(R.id.imageView);
            TextView textView = view.findViewById(R.id.textView);
            TextView textView1 = view.findViewById(R.id.textView1);
            imageView.setImageResource(image[position]);
            textView.setText(text[position]);
            textView1.setText(text2[position]);
            return view;
        }
    }
}
