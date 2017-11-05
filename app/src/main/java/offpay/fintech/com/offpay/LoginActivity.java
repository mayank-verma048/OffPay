package offpay.fintech.com.offpay;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.widget.VideoView;

/**
 * Created by mayank on 5/11/17.
 */

public class LoginActivity extends AppCompatActivity {
    EditText etpin,email,password;
    String auth;
    String authPref;
    String restoredText;
    String accpref;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        restoredText = "";
        authPref = "";
         password = findViewById(R.id.etpassword);
        SharedPreferences sharedPref = this.getSharedPreferences(authPref, Context.MODE_PRIVATE);
        SharedPreferences accountpref = this.getSharedPreferences(accpref, Context.MODE_PRIVATE);
        auth = sharedPref.getString(authPref, "");
        etpin = findViewById(R.id.pin_enter);

        if (auth.isEmpty()) {
            setContentView(R.layout.activity_login);
            Button login = findViewById(R.id.btLogin);
            final EditText et = findViewById(R.id.etacc);
            login.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {

                    String em = "akshajjain";
                    String key = "bhargavbvbv";
                    SharedPreferences.Editor editor = getSharedPreferences(authPref, MODE_PRIVATE).edit();
                    SharedPreferences.Editor editor1 = getSharedPreferences(accpref, MODE_PRIVATE).edit();
                    editor.putString(authPref, key);
                    editor1.putString(accpref,em);
                    Log.i("Login",key);
                    editor.apply();
                    editor1.apply();
                    setContentView(R.layout.layout3);
                    SharedPreferences prefs = getSharedPreferences(authPref, MODE_PRIVATE);
                    restoredText = prefs.getString(authPref, null);
                }
            });

        }
        else {
            setContentView(R.layout.layout3);
            SharedPreferences prefs = getSharedPreferences(authPref, MODE_PRIVATE);
            restoredText = prefs.getString(authPref, null);

        }

    }
    public void Login(View view) {
        //let the user see his profile when he clicks login button
        etpin = findViewById(R.id.pin_enter);
        String pin_entered = etpin.getText().toString();
        if(restoredText.equals(pin_entered))
        {
            startActivity(new Intent(LoginActivity.this,MainActivity.class));
        }
        else
        {
            Toast.makeText(LoginActivity.this,"Wrong PIN!",Toast.LENGTH_SHORT).show();
        }

    }

}
