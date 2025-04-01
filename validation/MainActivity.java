package com.example.myapplication;

import android.app.Dialog;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText editTextName, editTextEmail, editTextPassword, editTextAge, editTextPhone;
    private Button buttonSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextName = findViewById(R.id.editTextName);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        editTextAge = findViewById(R.id.editTextAge);
        editTextPhone = findViewById(R.id.editTextPhone);
        buttonSubmit = findViewById(R.id.buttonSubmit);

        buttonSubmit.setOnClickListener(v -> validateAndSubmit());
    }

    private void validateAndSubmit() {
        String name = editTextName.getText().toString().trim();
        String email = editTextEmail.getText().toString().trim();
        String password = editTextPassword.getText().toString().trim();
        String ageStr = editTextAge.getText().toString().trim();
        String phone = editTextPhone.getText().toString().trim();

        if (TextUtils.isEmpty(name)) {
            showDialog("Please enter your name.");
            return;
        }

        if (TextUtils.isEmpty(email) || !android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
            showDialog("Please enter a valid email address.");
            return;
        }

        if (TextUtils.isEmpty(password) || password.length() < 6) {
            showDialog("Password must be at least 6 characters long.");
            return;
        }

        if (TextUtils.isEmpty(ageStr)) {
            showDialog("Please enter your age.");
            return;
        }

        int age = Integer.parseInt(ageStr);
        if (age < 1 || age > 120) {
            showDialog("Please enter a valid age.");
            return;
        }

        if (TextUtils.isEmpty(phone) || phone.length() < 10) {
            showDialog("Please enter a valid phone number.");
            return;
        }

        // If all validations pass
        showDialog("Registration successful!");
    }

    private void showDialog(String message) {
        final Dialog dialog = new Dialog(this);
        dialog.setContentView(R.layout.dialog_message);

        TextView textViewMessage = dialog.findViewById(R.id.textViewMessage);
        Button buttonOk = dialog.findViewById(R.id.buttonOk);

        textViewMessage.setText(message);

        buttonOk.setOnClickListener(v -> dialog.dismiss());
        dialog.show();
    }
}