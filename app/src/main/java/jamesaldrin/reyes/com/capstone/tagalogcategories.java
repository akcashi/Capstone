package jamesaldrin.reyes.com.capstone;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class tagalogcategories extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tagalogcategories);
    }

    public void Numericals(View v) {
        Intent i = null;
        i = new Intent(tagalogcategories.this, TagalogNumericals.class);
        startActivity(i);

    }
}
