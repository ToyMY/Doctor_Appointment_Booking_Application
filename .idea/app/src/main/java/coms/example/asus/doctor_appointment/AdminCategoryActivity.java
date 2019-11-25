package coms.example.asus.doctor_appointment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class AdminCategoryActivity extends AppCompatActivity {
    private CardView medicineCard, cardiologyCard, orthopaedicCard,
            neurosurgeryCard, gynaeCard, neurologyCard, nephrologyCard, urologyCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admin_category);

        medicineCard = findViewById(R.id.medicineId);
        cardiologyCard = findViewById(R.id.cardiologyId);
        orthopaedicCard = findViewById(R.id.orthopaedicId);
        neurosurgeryCard = findViewById(R.id.neurosurgeryId);
        gynaeCard = findViewById(R.id.gynaecologyId);
        neurologyCard = findViewById(R.id.neurologyId);
        nephrologyCard = findViewById(R.id.nephrologyId);
        urologyCard = findViewById(R.id.urologyId);

        medicineCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "medicine");
                startActivity(intent);
            }
        });

        cardiologyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "cardiology");
                startActivity(intent);
            }
        });

        orthopaedicCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "orthopaedic");
                startActivity(intent);
            }
        });

        neurosurgeryCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "neurosurgery");
                startActivity(intent);
            }
        });

        gynaeCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "gynae");
                startActivity(intent);
            }
        });

        neurologyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "neurology");
                startActivity(intent);
            }
        });

        nephrologyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "nephrology");
                startActivity(intent);
            }
        });

        urologyCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AdminCategoryActivity.this, AdminAddNewDoctorActivity.class);
                intent.putExtra("department", "urology");
                startActivity(intent);
            }
        });
    }
}
