package com.example.abdul_wahab.customadapters17.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.abdul_wahab.customadapters17.R;
import com.example.abdul_wahab.customadapters17.models.Contact;

import java.util.List;

/**
 * Created by Abdul-Wahab on 4/5/2017.
 */

public class ContactAdapter extends ArrayAdapter {
    public ContactAdapter(Context context, List objects) {
        super(context, 0, objects);
    }


    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View v = LayoutInflater.from(getContext()).inflate(R.layout.custom_contact_layout , parent, false);

        TextView txt1 = (TextView) v.findViewById(R.id.txt1);
        TextView txt2 = (TextView) v.findViewById(R.id.txt2);
        Contact contact = (Contact) getItem(position);
        txt1.setText(contact.getName());
        txt2.setText(contact.getPhone() );

        return v;
    }
}
