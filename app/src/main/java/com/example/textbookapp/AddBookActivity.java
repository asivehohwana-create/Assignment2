package com.example.textbookapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class AddBookActivity extends AppCompatActivity {

    EditText etTitle, etSeller, etCopies, etPrice,etBank;
    Button btnSubmitBook;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_book);

        etTitle = findViewById(R.id.etTitle);
        etSeller = findViewById(R.id.etSeller);
        etCopies = findViewById(R.id.etCopies);
        etPrice = findViewById(R.id.etPrice);
        etBank = findViewById(R.id.etBank);

        btnSubmitBook = findViewById(R.id.btnSubmitBook);

        btnSubmitBook.setOnClickListener(v -> {

            try {

                String title = etTitle.getText().toString();
                String seller = etSeller.getText().toString();
                String bank = etBank.getText().toString();

                int copies = Integer.parseInt(
                        etCopies.getText().toString()
                );

                double price = Double.parseDouble(
                        etPrice.getText().toString()
                );

                Textbook book = new Textbook(
                        title,
                        seller,
                        copies,
                        price,
                        bank
                );

                MainActivity.bookList.add(book);

                Toast.makeText(this,
                        "Book Submitted Successfully",
                        Toast.LENGTH_SHORT).show();
                finish(); // Close activity after adding

            } catch (Exception e) {

                Toast.makeText(this,
                        "Please enter valid data",
                        Toast.LENGTH_SHORT).show();
            }

        });
    }
}