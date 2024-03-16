package com.example.healthshastra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.DatePickerDialog;
import android.os.Bundle;
import android.view.View;
import android.widget.DatePicker;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class BookApointmentPage2 extends AppCompatActivity {

    RecyclerView bookslotrecylcer;

    List<BookApointmentModel> data_list;
    private BookslotAdapter bookslotAdapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_apointment_page2);


        bookslotrecylcer = findViewById(R.id.available_slot);
        layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(RecyclerView.VERTICAL);
        bookslotrecylcer.setLayoutManager(new GridLayoutManager(this, 2));


        data_list = new ArrayList<>();




        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());




        bookslotAdapter = new BookslotAdapter(data_list, BookApointmentPage2.this);
        bookslotrecylcer.setAdapter(bookslotAdapter);

        ImageView choosedate = findViewById(R.id.choosedate);


        long[] disabledDates = { /* Add your disabled dates in milliseconds here */ };

        // Create and show the custom date picker dialog

        choosedate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {





            }
                });














    }
}