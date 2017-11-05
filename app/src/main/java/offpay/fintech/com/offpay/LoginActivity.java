package offpay.fintech.com.offpay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        String authPref = "";
        SharedPreferences sharedPref = this.getSharedPreferences(authPref, Context.MODE_PRIVATE);
        int auth = sharedPref.getInt(authPref, 0);

        if (auth == 0) {
            setContentView(R.layout.layout3);
            SharedPreferences.Editor editor = getSharedPreferences(authPref, MODE_PRIVATE).edit();
            editor.putString(authPref, "whatever pin is provided to the person");
            editor.apply();
        }
        setContentView(R.layout.layout2);
        SharedPreferences prefs = getSharedPreferences(authPref, MODE_PRIVATE);
        String restoredText = prefs.getString("text", null);
        if (restoredText != null) {
            String name = prefs.getString("name", "No name defined");//"No name defined" is the default value.
            int idName = prefs.getInt("idName", 0); //0 is the default value.
        }

    }
    public void Login(View view) {
        //let the user see his profile when he clicks login button
    }
}




