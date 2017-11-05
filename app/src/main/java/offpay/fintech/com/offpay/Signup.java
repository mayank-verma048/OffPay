package offpay.fintech.com.offpay;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

class LogActivity extends AppCompatActivity {


    private Button btLogin;
    private TextView tvRegister;
    private TextView changepass;
    private EditText etEmail;
    private  EditText etPassword;


    private static final String TAG = "LoginActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.layout3);

        btLogin = (Button) findViewById(R.id.btLogin);
        tvRegister = (TextView) findViewById(R.id.tvregister);
        etEmail = (EditText) findViewById(R.id.etlogin);
        etPassword = (EditText) findViewById(R.id.etpassword);
        changepass = (TextView)findViewById(R.id.changepas);

        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                authenticate();
            }
        });
        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(LogActivity.this,LoginActivity.class));
            }
        });



    }

    public void authenticate(){

        String email = etEmail.getText().toString().trim();
        final String password = etPassword.getText().toString().trim();

        if(TextUtils.isEmpty(email))
        {
            Toast.makeText(LogActivity.this,"Please enter your Email",Toast.LENGTH_SHORT).show();
        }
        if (TextUtils.isEmpty(password))
        {
            Toast.makeText(LogActivity.this,"Please enter your Password",Toast.LENGTH_SHORT).show();
        }
    }
}