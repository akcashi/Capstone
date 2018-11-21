package jamesaldrin.reyes.com.capstone;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class choose extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose);


        Button mShowTagalog = (Button) findViewById(R.id.Tagalog);
        mShowTagalog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder mBuilder = new AlertDialog.Builder(choose.this);
                final View mView = getLayoutInflater().inflate(R.layout.activity_tagaloghistory, null);
                Button mStart = (Button) mView.findViewById(R.id.Start);
                mStart.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {

                            Toast.makeText(choose.this,
                                    R.string.success_login_msg,
                                    Toast.LENGTH_SHORT).show();
                        Intent i = null;
                        i = new Intent(choose.this, tagalogcategories.class);
                        startActivity(i);

                    }
                });

                mBuilder.setView(mView)
                        .setTitle("WikAlamin - Tagalog History");
                final AlertDialog dialog = mBuilder.create();
                dialog.show();
                final ImageButton mClose = (ImageButton) mView.findViewById(R.id.close);

                mClose.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialog.dismiss();
                    }
                });


            }
        });
    }
}
