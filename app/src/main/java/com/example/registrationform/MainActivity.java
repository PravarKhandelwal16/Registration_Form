package com.example.registrationform;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextClock;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void btnRegister(View view){
        TextView txtFirstName = findViewById(R.id.txtViewFirstName);
        TextView txtLastName = findViewById(R.id.txtViewLastName);
        TextView txtEmail = findViewById(R.id.txtViewEmail);

        EditText edtTxtFirstName = findViewById(R.id.edtTextFirstName);
        EditText edtTxtLastName = findViewById(R.id.editTxtLastName);
        EditText edtTxtEmail = findViewById(R.id.edtTxtEmail);

        txtFirstName.setText(edtTxtFirstName.getText().toString());
        txtLastName.setText(edtTxtLastName.getText().toString());
        txtEmail.setText(edtTxtEmail.getText().toString());
    }
}