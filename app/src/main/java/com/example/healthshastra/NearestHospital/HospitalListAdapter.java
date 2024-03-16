package com.example.healthshastra.NearestHospital;

import android.content.Context;
import android.location.Address;
import android.location.Geocoder;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.healthshastra.BookApointmentModel;
import com.example.healthshastra.R;

import java.util.List;
import java.util.Locale;

public class HospitalListAdapter extends RecyclerView.Adapter<HospitalListAdapter.LeadData>{

    List<HospitalListModel> dataholder2;


//    List<EVStation> evStations = new ArrayList<>();
//    private FirebaseFirestore firebaseFirestore;
    Context context;
    final String sharedPreferencesFileTitle = "ecoview";
    public HospitalListAdapter(List<HospitalListModel> dataholder2, Context context) {
        this.dataholder2 = dataholder2;
        this.context = context;

    }

//    private void init(){
//        firebaseAuth = FirebaseAuth.getInstance();
//        firebaseFirestore = FirebaseFirestore.getInstance();
//
//    }

    public void setFilteredList(List<HospitalListModel> filteredList) {
        Log.println(Log.DEBUG,"debug", "Finally"+filteredList);
        this.dataholder2 = filteredList;
        notifyDataSetChanged();
    }


    @NonNull
    @Override
    public LeadData onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
//        init();
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.hospitallistonmapcard,parent,false);
        return new LeadData(view);
    }

    @Override
    public void onBindViewHolder(@NonNull LeadData holder, int position) {



////            holder.avg.setText(dataholder2.get(position).getAvg_rating()+"");
//            holder.stationname.setText(dataholder2.get(position).getEv_station_name());
//            holder.address.setText(getAddress(dataholder2.get(position).getOwner_location().getLatitude(),dataholder2.get(position).getOwner_location().getLongitude()));
//

//        holder.tvType.setText("Type " + dataholder2.get(position).getType());

//            holder.types.setText("Type " + dataholder2.get(position).getType());







    }

    private String getAddress(double lati,double longi) {

        String add = "";

        try {
            Geocoder geocoder;
            List<Address> addresses;
            geocoder = new Geocoder(context, Locale.getDefault());

            addresses = geocoder.getFromLocation(lati, longi, 1); // Here 1 represent max location result to returned, by documents it recommended 1 to 5

            add = addresses.get(0).getAddressLine(0);
        } catch (Exception e) {
            Toast.makeText(context, e.getMessage(), Toast.LENGTH_SHORT).show();
        }

        return add;
    }

    @Override
    public int getItemCount() {
        return dataholder2.size();
    }


    class LeadData extends RecyclerView.ViewHolder
    {
        TextView stationname,address;
        LinearLayout card;

        LinearLayout bottomsheet;
        TextView types;
        TextView avg;
        public LeadData(@NonNull View itemView)
        {
            super(itemView);
//            bottomsheet = itemView.findViewById(R.id.bottomsheetcontainer);
//            card = itemView.findViewById(R.id.card);
//            stationname = itemView.findViewById(R.id.station_name);
//            address = itemView.findViewById(R.id.distance);
//            types = itemView.findViewById(R.id.types);
//            avg = itemView.findViewById(R.id.avgr);

        }
    }
    public boolean isNumeric(String str) {
        return str.matches("\\d+");
    }


//    public void showBottomSheetDialog(String tag)
//    {
//
//        final BottomSheetDialog bottomSheetDialog1 = new BottomSheetDialog(
//                context,R.style.BottomSheetDialogTheme
//        );
//
//
//        View bottomSheetView = LayoutInflater.from(context)
//                .inflate(
//                        R.layout.layout_bottom_sheet, (LinearLayout)findViewById(R.id.bottomsheetcontainer)
//                );
////        Owner allowner = mp.get(tag);
//
//
////
//        TextView stationname = bottomSheetView.findViewById(R.id.stationname);
//        TextView price,remainingEnergy,address;
////        Toast.makeText(this, ""+allowner.getPrice(), Toast.LENGTH_SHORT).show();
//        price = bottomSheetView.findViewById(R.id.price);
//        remainingEnergy = bottomSheetView.findViewById(R.id.remainingenergy);
//        address = bottomSheetView.findViewById(R.id.address);
////        Toast.makeText(this, ""+ Integer.toHexString(System.identityHashCode(allowner.getOwner_location())), Toast.LENGTH_SHORT).show();
////        price.setText(allowner.getPrice()+"");
////        remainingEnergy.setText(allowner.get);
////        address.setText(getAddress());
////        stationname.setText(allowner.getOwner_name());
//
//
//
//
//
//        Button direction= bottomSheetView.findViewById(R.id.btnUpdate);
//        Button book = bottomSheetView.findViewById(R.id.book);
//
//
//
//
//        bottomSheetDialog1.setContentView(bottomSheetView);
//        bottomSheetDialog1.show();
//    }




}
