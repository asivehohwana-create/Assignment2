package com.example.textbookapp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Button btnViewBooks, btnAddBook, btnSearch;
    // Made static so it can be accessed from other activities
    public static ArrayList<Textbook> bookList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Add some sample data if the list is empty
        if (bookList.isEmpty()) {
            bookList.add(new Textbook("Java Basics", "John Doe", 5, 150.0, "Bank A"));
            bookList.add(new Textbook("Physics 101", "Jane Smith", 2, 200.0, "Bank B"));
            bookList.add(new Textbook("Calculus Made Easy", "Bob Brown", 3, 180.0, "Bank C"));
        }

        btnViewBooks = findViewById(R.id.btnViewBooks);
        btnAddBook = findViewById(R.id.btnAddBook);
        btnSearch = findViewById(R.id.btnSearch);

        btnViewBooks.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, ViewBooksActivity.class);
            startActivity(intent);
        });

        btnAddBook.setOnClickListener(v -> {
            Intent intent = new Intent(MainActivity.this, AddBookActivity.class);
            startActivity(intent);
        });

        btnSearch.setOnClickListener(v -> {
            // Opening ViewBooksActivity for searching
            Intent intent = new Intent(MainActivity.this, ViewBooksActivity.class);
            startActivity(intent);
        });
    }
}
