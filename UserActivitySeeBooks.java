package com.library.lms;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class UserActivitySeeBooks extends AppCompatActivity {
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_book_see);
        listView=findViewById(R.id.list);
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("1. To Kill a Mockingbird \n");
        arrayList.add("2. Harry Potter and the Philosopher's Stone \n");
        arrayList.add("3. Harry Potter and the Deathly Hallows ");
        arrayList.add("4. The Da Vinci Code \n");
        arrayList.add("5. Macbeth \n");
        arrayList.add("6. Charlie and the Chocolate Factory \n");
        arrayList.add("7. Matilda \n");
        arrayList.add("8. Notes From The Underground \n");
        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayList);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(),"BOOK "+(position+1)+" is clicked",Toast.LENGTH_SHORT).show();
            }
        });
    }
}