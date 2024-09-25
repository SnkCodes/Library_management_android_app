package com.library.lms;


import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class UserActivitySearch extends AppCompatActivity {

    RadioButton rc,re,rm,rciv,reee;
    Button button;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_search);
        rc=findViewById(R.id.rbcse);
        re=findViewById(R.id.rbece);
        rm=findViewById(R.id.rbmec);
        rciv=findViewById(R.id.rbciv);
        reee=findViewById(R.id.rbeee);
        button=findViewById(R.id.buttongo);
        listView=findViewById(R.id.lvsearch);


        ArrayList<String> arrayListcse=new ArrayList<String>();
        arrayListcse.add("  Mystery");
        arrayListcse.add("1. The Da Vinci Code");
        arrayListcse.add("2. Gone Girl");
        arrayListcse.add("3. Big Little Lies");
        arrayListcse.add("4. Murder on the Orient Express");
        arrayListcse.add("5. The Girl with the Dragon Tattoo");

        ArrayList<String> arrayListece=new ArrayList<String>();
        arrayListece.add("  Fiction");
        arrayListece.add("1. To Kill a Mockingbird");
        arrayListece.add("2. 1984 by George Orwell");
        arrayListece.add("3. The Great Gatsby");
        arrayListece.add("4. Harry Potter and the Philosopher's Stone");
        arrayListece.add("5. The Catcher in the Rye");

        ArrayList<String> arrayListmec=new ArrayList<String>();
        arrayListmec.add("  Non-Fiction");
        arrayListmec.add("1. Sapiens: A Brief History of Humankind");
        arrayListmec.add("2. The Power of Habit");
        arrayListmec.add("3. Educated");
        arrayListmec.add("4. The Immortal Life of Henrietta Lacks");
        arrayListmec.add("5. Quiet: The Power of Introverts");


        ArrayList<String> arrayListciv=new ArrayList<String>();
        arrayListciv.add("  Historical");
        arrayListciv.add("1. The Diary of Anne Frank ");
        arrayListciv.add("2. The Histories ");
        arrayListciv.add("3. The Art of War");
        arrayListciv.add("4. The Republic");
        arrayListciv.add("5. The Prince");

        ArrayList<String> arrayListeee=new ArrayList<String>();
        arrayListeee.add("  Academia");
        arrayListeee.add("1. Computer Networking ");
        arrayListeee.add("2. Artificial Intelligence");
        arrayListeee.add("3. Introduction to Algorithms");
        arrayListeee.add("4. Database Management Systems");
        arrayListeee.add("5. Information Security");


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(rc.isChecked()){
                    ArrayAdapter<String> arrayAdapter1cse=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayListcse);
                    listView.setAdapter(arrayAdapter1cse);
                    Toast.makeText(getApplicationContext(),"MYSTERY BOOKS",Toast.LENGTH_SHORT).show();
                }
                else if(re.isChecked()){
                    ArrayAdapter<String> arrayAdapter1ece=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayListece);
                    listView.setAdapter(arrayAdapter1ece);
                    Toast.makeText(getApplicationContext(),"FICTION BOOKS",Toast.LENGTH_SHORT).show();
                }
                else if(rm.isChecked()){
                    ArrayAdapter<String> arrayAdapter1mec=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayListmec);
                    listView.setAdapter(arrayAdapter1mec);
                    Toast.makeText(getApplicationContext(),"NON-FICTION BOOKS",Toast.LENGTH_SHORT).show();
                }
                else if(rciv.isChecked()){
                    ArrayAdapter<String> arrayAdapter1civ=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayListciv);
                    listView.setAdapter(arrayAdapter1civ);
                    Toast.makeText(getApplicationContext(),"HISTORICAL BOOKS",Toast.LENGTH_SHORT).show();
                }
                else if(reee.isChecked()){
                    ArrayAdapter<String> arrayAdapter1eee=new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1,arrayListeee);
                    listView.setAdapter(arrayAdapter1eee);
                    Toast.makeText(getApplicationContext(),"ACADEMIA BOOKS",Toast.LENGTH_SHORT).show();
                }
                else{
                    AlertDialog.Builder builder=new AlertDialog.Builder(UserActivitySearch.this);
                    builder.setCancelable(true);
                    builder.setTitle("Message");
                    builder.setMessage("Enter correct ID");
                    builder.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            dialog.dismiss();
                        }
                    });AlertDialog d=builder.create();
                    d.show();
                }
            }
        });

    }

}