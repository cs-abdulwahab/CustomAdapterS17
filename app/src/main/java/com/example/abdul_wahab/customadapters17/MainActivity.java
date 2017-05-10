package com.example.abdul_wahab.customadapters17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.abdul_wahab.customadapters17.adapters.ContactAdapter;
import com.example.abdul_wahab.customadapters17.models.Contact;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List<Contact> contactList = new ArrayList<>();
        for (int i = 0; i < 50; i++) {
            contactList.add(new Contact("Name =  "+i,"Phone  "+i , i%2==3 ));
        }

        ListView listview1 = (ListView) findViewById(R.id.listview1);
        ContactAdapter contactAdapter = new ContactAdapter(this, contactList);
        listview1.setAdapter(contactAdapter);



    }
}
