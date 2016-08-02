package fanjavaid.com.contactapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.List;

import fanjavaid.com.contactapp.MainActivity;
import fanjavaid.com.contactapp.R;
import fanjavaid.com.contactapp.model.Contact;

/**
 * Created by fanjavaid on 8/2/16.
 */
public class ContactAdapter extends BaseAdapter {

    private List<Contact> results;
    private Context context;
    private LayoutInflater inflater;

    public ContactAdapter(MainActivity mainActivity, List<Contact>results) {
        this.results = results;
        context = mainActivity;
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return results.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View rowView = inflater.inflate(R.layout.contact_list, null);
        TextView fullname = (TextView) rowView.findViewById(R.id.fullname);
        TextView phone1 = (TextView) rowView.findViewById(R.id.phone1);
        TextView email = (TextView) rowView.findViewById(R.id.email);

        fullname.setText(results.get(position).getFirstName() + " " + results.get(position).getLastName());
        phone1.setText(results.get(position).getPhone1());
        email.setText(results.get(position).getEmail());

        return rowView;
    }
}
