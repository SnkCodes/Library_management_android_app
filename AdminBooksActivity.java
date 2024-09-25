package com.library.lms;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.library.lms.Adapter.*;
import com.library.lms.DB.AppDatabase;
import com.library.lms.DB.Books;
import com.library.lms.DB.BooksDao;


public class AdminBooksActivity extends AppCompatActivity {
    ListView listView;
    ImageView searchButton;
    FloatingActionButton addButton;

    AppDatabase dbRoom;
    BooksDao booksDao;
    BookAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_books);

        // Get view reference
        listView = findViewById(R.id.listView_books);
        searchButton = findViewById(R.id.button_search);
        addButton = findViewById(R.id.floatingButton_books);

        // Init Database
        dbRoom = AppDatabase.getInstance(this);
        booksDao = dbRoom.booksDao();
        List<Books> books = booksDao.getAll();
        if (books.size() == 0) {
            booksDao.insertAll(
                    new Books(978_81_203_4007_7L, "The Diary of Anne Frank", "Anne Frank", 5, 3),
                    new Books(978_81_265_5427_0L, "The Art of War", "Sun Tzu", 7, 6),
                    new Books(978_93_87432_29_1L, "Educated", "Tara Westover", 3, 2),
                    new Books(978_01_99459_63_6L, "The Great Gatsby", "F. Scott Fitzgerald", 7, 3),
                    new Books(978_93_51109_05_1L, "The Da Vinci Code", "Dan Brown", 10, 7),
                    new Books(978_1_118_53164_8L, "Murder on the Orient Express", "Agatha Christie", 25, 13)
            );
            books = booksDao.getAll();
        }

        // Init ListView
        adapter = new BookAdapter(this, books);
        listView.setAdapter(adapter);

        setListeners();
    }

    private void setListeners() {
        // Search Button
        searchButton.setOnClickListener(view -> {
            Toast.makeText(getApplicationContext(), "Search Books", Toast.LENGTH_SHORT).show();
        });

        // Add button
        addButton.setOnClickListener(view -> {
            Intent intent = new Intent(AdminBooksActivity.this, AdminAddBookActivity.class);
            startActivity(intent);
        });
    }
}
