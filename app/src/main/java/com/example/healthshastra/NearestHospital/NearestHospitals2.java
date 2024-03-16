package com.example.healthshastra.NearestHospital;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.healthshastra.R;

import java.util.ArrayList;
import java.util.List;

public class NearestHospitals2 extends AppCompatActivity {

    RecyclerView doctorlistrecycler;

    List<DoctorListModel> data_list;
    private DoctorListAdapter doctorlistAdapter;
    LinearLayoutManager layoutManager;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nearest_hospitals2);

        fetchDoctorInfo();
    }

    private void fetchDoctorInfo() {



        doctorlistrecycler = findViewById(R.id.doctorlistrecyler);
        layoutManager = new LinearLayoutManager(this);

        layoutManager.setOrientation(RecyclerView.VERTICAL);
        doctorlistrecycler.setLayoutManager(layoutManager);


        data_list = new ArrayList<>();




        data_list.add(new DoctorListModel());
        data_list.add(new DoctorListModel());
        data_list.add(new DoctorListModel());
        data_list.add(new DoctorListModel());
        data_list.add(new DoctorListModel());
        data_list.add(new DoctorListModel());
        data_list.add(new DoctorListModel());






        doctorlistAdapter = new DoctorListAdapter(data_list, NearestHospitals2.this);
        doctorlistrecycler.setAdapter(doctorlistAdapter);







    }

}