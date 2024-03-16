package com.example.healthshastra;

import android.app.DatePickerDialog;
import android.content.Context;
import android.widget.DatePicker;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class RestrictedDatePickerDialog extends DatePickerDialog {

    private final long[] disabledDates;

    public RestrictedDatePickerDialog(Context context, OnDateSetListener listener, long[] disabledDates) {
        super(context, listener, Calendar.getInstance().get(Calendar.YEAR),
                Calendar.getInstance().get(Calendar.MONTH),
                Calendar.getInstance().get(Calendar.DAY_OF_MONTH));
        this.disabledDates = disabledDates;
    }

    @Override
    public void onDateChanged(DatePicker view, int year, int month, int dayOfMonth) {
        Calendar selectedCalendar = Calendar.getInstance();
        selectedCalendar.set(year, month, dayOfMonth);
        long selectedDateInMillis = selectedCalendar.getTimeInMillis();

        for (long disabledDate : disabledDates) {
            if (selectedDateInMillis == disabledDate) {
                // Date is disabled, prevent setting it
                return;
            }
        }

        // Date is not disabled, proceed as usual
        super.onDateChanged(view, year, month, dayOfMonth);
    }
}
