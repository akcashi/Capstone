package jamesaldrin.reyes.com.capstone;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.AlertDialog;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle("Wikalamin");
        setContentView(R.layout.activity_main);
        Log.d("Log: ", "onCreate() session has been initiated");

        Button mShowDialog = (Button) findViewById(R.id.dLogin);
        mShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                final AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
                final View mView = getLayoutInflater().inflate(R.layout.activity_dialog_login, null);
                final EditText mEmail = (EditText) mView.findViewById(R.id.rUsername);
                final EditText mPassword = (EditText) mView.findViewById(R.id.rPassword);
                Button mLogin = (Button) mView.findViewById(R.id.Login);
                mLogin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        if (!mEmail.getText().toString().isEmpty() && !mPassword.getText().toString().isEmpty()) {
                            Toast.makeText(MainActivity.this,
                                    R.string.success_login_msg,
                                    Toast.LENGTH_SHORT).show();
                        } else {
                            Toast.makeText(MainActivity.this,
                                    R.string.error_login_msg,
                                    Toast.LENGTH_SHORT).show();
                        }
                    }
                });

                mBuilder.setView(mView)
                .setTitle("WikAlamin - Login");
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

        TextView mShowRegister = (TextView) findViewById(R.id.dRegister);
        mShowRegister.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            final AlertDialog.Builder mBuilder = new AlertDialog.Builder(MainActivity.this);
            final View mView = getLayoutInflater().inflate(R.layout.activity_register, null);
            final EditText rUsername = (EditText) mView.findViewById(R.id.rUsername);
            final EditText rPassword = (EditText) mView.findViewById(R.id.rPassword);
            Button mRegister = (Button) mView.findViewById(R.id.bRegister);
            mRegister.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (!rUsername.getText().toString().isEmpty() && !rPassword.getText().toString().isEmpty()) {
                        Toast.makeText(MainActivity.this,
                                R.string.success_login_msg,
                                Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this,
                                R.string.error_login_msg,
                                Toast.LENGTH_SHORT).show();
                    }
                }
            });



            mBuilder.setView(mView)
                    .setTitle("WikAlamin - Register");
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


    @Override
    protected void onStart() {
        super.onStart();
        Log.d ("Log: ","onStart() session has been initiated"); }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d ("Log: ","onResume() session has been initiated"); }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d ("Log: ","onStop() session has been initiated"); }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d ("Log: ","onPause() session has been initiated"); }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d ("Log: ","onRestart() session has been initiated"); }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d ("Log: ","onDestroy() session has been initiated"); }

    public void Back(View v){
        Toast.makeText(this,"Toast: Initiated Back Button",Toast.LENGTH_LONG).show();
        Log.d ("Log: ","Toast session has been initiated"); }

    public void Next(View v){
        Snackbar.make(v, "Snackbar: Initiated Next Button", Snackbar.LENGTH_LONG).show();
        Log.d ("Log: ","Snackbar session has been initiated"); }


}
