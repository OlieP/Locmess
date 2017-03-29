package pt.ulisboa.tecnico.cmov.locmess;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by Pedro on 29/03/2017.
 */

public class MessageListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.message_custom_list);
        populateUsersList();
    }

    private void populateUsersList() {
        // Construct the data source
        final ArrayList<Message> arrayOfUsers = getUsers();
        // Create the adapter to convert the array to views
        CustomMessageAdapter adapter = new CustomMessageAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        final ListView listView = (ListView) findViewById(R.id.lvMessages);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> a, View v, int position, long id){
                Object o = listView.getItemAtPosition(position);
                Message fullObject = (Message)o;
                Toast.makeText(MessageListActivity.this, "You have chosen: " + " " + fullObject.get_name(), Toast.LENGTH_LONG).show();
            }

        });

    }

    private ArrayList<Message> getUsers() {

        ArrayList<Message> results = new ArrayList<Message>();

        Message msg1 = new Message();
        msg1.set_name("John Cena");
        msg1.set_location("Paris, FR @  lat:-19.00W long:12.00N");
        msg1.set_message("I want a bagel!!");
        results.add(msg1);

        Message msg2 = new Message();
        msg2.set_name("John Dallas");
        msg2.set_location("Lisbon, PT @  lat:-19.00W long:12.00N ");
        msg2.set_message("Can someone bring me a Pastel de nata??");
        results.add(msg2);

        Message msg3 = new Message();
        msg3.set_name("John Smith");
        msg3.set_location("Dallas, TX  @ lat:-19.00W long:12.00N ");
        msg3.set_message("Who wants to go for a drink");
        results.add(msg3);

        return results;
    }


}
