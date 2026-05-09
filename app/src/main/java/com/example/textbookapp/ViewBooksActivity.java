package com.example.textbookapp;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class ViewBooksActivity extends AppCompatActivity {

    ListView listViewBooks;
    EditText etSearch;
    ArrayAdapter<String> adapter;
    ArrayList<String> displayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_books);

        listViewBooks = findViewById(R.id.listViewBooks);
        etSearch = findViewById(R.id.etSearch);

        displayList = new ArrayList<>();
        updateDisplayList("");

        adapter = new ArrayAdapter<>(
                this,
                android.R.layout.simple_list_item_1,
                displayList
        );

        listViewBooks.setAdapter(adapter);

        etSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {}

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                updateDisplayList(s.toString());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void afterTextChanged(Editable s) {}
        });
    }

    private void updateDisplayList(String query) {
        displayList.clear();
        for (Textbook book : MainActivity.bookList) {
            if (query.isEmpty() || 
                book.getTitle().toLowerCase().contains(query.toLowerCase()) || 
                book.getSellerName().toLowerCase().contains(query.toLowerCase())) {
                
                displayList.add(book.getTitle() + " - R" + book.getPrice() + " (" + book.getSellerName() + ")");
            }
        }
    }
}
