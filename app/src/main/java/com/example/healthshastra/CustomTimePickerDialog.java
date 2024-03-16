package com.example.healthshastra;

import android.app.Dialog;
import android.app.TimePickerDialog;
import android.os.Bundle;
import android.text.format.DateFormat;
import android.widget.TimePicker;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.DialogFragment;

import java.util.Calendar;

public class CustomTimePickerDialog extends DialogFragment implements TimePickerDialog.OnTimeSetListener {

    @NonNull
    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        // Use the current time as the default values for the picker
        final Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);
        int minute = c.get(Calendar.MINUTE);

        // Create a new instance of TimePickerDialog and return it
        return new TimePickerDialog(getActivity(), this, hour, minute, DateFormat.is24HourFormat(getActivity()));
    }

    @Override
    public void onTimeSet(TimePicker view, int hourOfDay, int minute) {
        // Custom logic to check if the selected time slot is allowed
        if (!isTimeSlotAllowed(hourOfDay, minute)) {
            // Show an error message or reset the time picker
            Toast.makeText(getActivity(), "This time slot is not allowed", Toast.LENGTH_SHORT).show();
            // Reset the time picker to the default time
            Calendar c = Calendar.getInstance();
            view.setCurrentHour(c.get(Calendar.HOUR_OF_DAY));
            view.setCurrentMinute(c.get(Calendar.MINUTE));
        } else {
            // Do something with the selected time
            // For example, store it in a variable or pass it to another method
        }
    }

    private boolean isTimeSlotAllowed(int hourOfDay, int minute) {
        // Custom logic to determine if the selected time slot is allowed
        // For example, you can check against a list of allowed time slots
        // Return true if allowed, false otherwise
        // You can implement your own logic here based on your requirements
        return true; // Placeholder return value
    }
}
