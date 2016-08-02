package fanjavaid.com.contactapp;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import fanjavaid.com.contactapp.adapter.ContactAdapter;
import fanjavaid.com.contactapp.model.Contact;

public class MainActivity extends AppCompatActivity {

    private ListView contactListView;
    private Context context;
    private List<Contact> contacts = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;

        contacts.add(new Contact(1, "Fandi", "Akhmad", "085695887334", null, null, "fanjavaid@gmail.com", null));
        contacts.add(new Contact(2, "Goldy", "Soraya", "081282177404", null, null, "viia@gmail.com", null));

        contactListView = (ListView) findViewById(R.id.contactList);
        contactListView.setAdapter(new ContactAdapter(this, contacts));
    }
}
