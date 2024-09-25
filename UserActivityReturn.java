package com.library.lms;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class UserActivityReturn extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_return);
        listView=findViewById(R.id.lvreturn);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("1. The Da Vinci Code \n");
        arrayList.add("2. The Girl with the Dragon Tattoo \n");
        arrayList.add("3. 1984 by George Orwell");
        arrayList.add("4. Sapiens: A Brief History of Humankind \n");
        arrayList.add("5. The Diary of Anne Frank \n");
        arrayList.add("6. Artificial Intelligence \n");

        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
    }
}