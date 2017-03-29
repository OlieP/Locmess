package pt.ulisboa.tecnico.cmov.locmess;

import java.util.ArrayList;

import android.app.Activity;
import android.os.Bundle;
import android.widget.ListView;
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
        ArrayList<Message> arrayOfUsers = Message.getUsers();
        // Create the adapter to convert the array to views
        CustomMessageAdapter adapter = new CustomMessageAdapter(this, arrayOfUsers);
        // Attach the adapter to a ListView
        ListView listView = (ListView) findViewById(R.id.lvMessages);
        listView.setAdapter(adapter);
    }
}
