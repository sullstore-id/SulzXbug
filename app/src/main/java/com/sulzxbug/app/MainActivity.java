package com.sulzxbug.app;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etBugNomor, etBugGroup;
    Button btnHome, btnWhatsApp, btnInfo, btnTools, btnGlobalChat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etBugNomor = findViewById(R.id.etBugNomor);
        etBugGroup = findViewById(R.id.etBugGroup);
        btnHome = findViewById(R.id.btnHome);
        btnWhatsApp = findViewById(R.id.btnWhatsApp);
        btnInfo = findViewById(R.id.btnInfo);
        btnTools = findViewById(R.id.btnTools);
        btnGlobalChat = findViewById(R.id.btnGlobalChat);

        View.OnClickListener clickListener = v -> {
            String nomor = etBugNomor.getText().toString().trim();
            String group = etBugGroup.getText().toString().trim();
            String menu = "";
            if (v == btnHome) menu = "Home";
            else if (v == btnWhatsApp) menu = "WhatsApp";
            else if (v == btnInfo) menu = "Info";
            else if (v == btnTools) menu = "Tools";
            else if (v == btnGlobalChat) menu = "Global Chat";

            Toast.makeText(MainActivity.this,
                "🔹 " + menu + "\nNomor: " + (nomor.isEmpty() ? "-" : nomor) +
                "\nGroup: " + (group.isEmpty() ? "-" : group),
                Toast.LENGTH_SHORT).show();
        };

        btnHome.setOnClickListener(clickListener);
        btnWhatsApp.setOnClickListener(clickListener);
        btnInfo.setOnClickListener(clickListener);
        btnTools.setOnClickListener(clickListener);
        btnGlobalChat.setOnClickListener(clickListener);
    }
}