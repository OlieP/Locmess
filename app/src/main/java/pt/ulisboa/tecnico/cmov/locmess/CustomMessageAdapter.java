package pt.ulisboa.tecnico.cmov.locmess;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
/**
 * Created by Pedro on 29/03/2017.
 */

public class CustomMessageAdapter extends ArrayAdapter<Message> {

    private static ArrayList<Message> msgArrayList;

    public CustomMessageAdapter(Context context, ArrayList<Message> users) {
        super(context, 0, users);
        msgArrayList = users;
    }

    public int getCount() {
        return msgArrayList.size();
    }

    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        // Get the data item for this position
       // Message user = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_message, parent, false);
            holder = new ViewHolder();
            holder.txtName = (TextView) convertView.findViewById(R.id.tvName);
            holder.txtLocation = (TextView) convertView.findViewById(R.id.tvLocation);
            holder.txtMessage = (TextView) convertView.findViewById(R.id.tvMessage);

            convertView.setTag(holder);
        }else{
            holder = (ViewHolder) convertView.getTag();
        }

        holder.txtName.setTag(msgArrayList.get(position).get_name());
        holder.txtLocation.setTag(msgArrayList.get(position).get_location());
        holder.txtMessage.setTag(msgArrayList.get(position).get_message());

        /*
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        TextView tvHome = (TextView) convertView.findViewById(R.id.tvHometown);
        // Populate the data into the template view using the data object
        tvName.setText(user.name);
        tvHome.setText(user.location);
        // Return the completed view to render on screen*/

        return convertView;
    }

    static class ViewHolder{
        TextView txtName;
        TextView txtLocation;
        TextView txtMessage;
    }
}
