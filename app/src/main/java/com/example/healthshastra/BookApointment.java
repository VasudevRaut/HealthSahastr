package com.example.healthshastra;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class BookApointment extends AppCompatActivity {


    RecyclerView bookapointmentcardRecycler;

    List<BookApointmentModel> data_list;
    private BookApointmentAdapter bookApointmentAdapter;
    LinearLayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_apointment);


        bookapointmentcardRecycler = findViewById(R.id.bookapointmentcardRecycler);
        layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(RecyclerView.VERTICAL);
        bookapointmentcardRecycler.setLayoutManager(layoutManager);


        data_list = new ArrayList<>();




        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());
        data_list.add(new BookApointmentModel());



        bookApointmentAdapter = new BookApointmentAdapter(data_list, BookApointment.this);
        bookapointmentcardRecycler.setAdapter(bookApointmentAdapter);










    }
}