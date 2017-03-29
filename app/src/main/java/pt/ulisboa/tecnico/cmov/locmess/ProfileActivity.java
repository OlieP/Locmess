package pt.ulisboa.tecnico.cmov.locmess;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.GridView;


import java.util.HashMap;

public class ProfileActivity extends AppCompatActivity {

    Button btnAddNew;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        btnAddNew = (Button) findViewById(R.id.btnAddNew);

        btnAddNew.setOnClickListener(new View.OnClickListener() {
            public void onClick(View arg0) {
                Intent intent = new Intent(ProfileActivity.this, AddKeyPairActivity.class);
                startActivity(intent);
            }
        });
    }

}
