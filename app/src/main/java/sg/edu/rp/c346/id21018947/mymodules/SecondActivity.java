package sg.edu.rp.c346.id21018947.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    TextView tvCode;
    TextView tvName;
    TextView tvYear;
    TextView tvSem;
    TextView tvCredit;
    TextView tvVenue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvCode = findViewById(R.id.textViewCode);
        tvName = findViewById(R.id.textViewName);
        tvYear = findViewById(R.id.textViewYear);
        tvSem = findViewById(R.id.textViewSem);
        tvCredit = findViewById(R.id.textViewCredit);
        tvVenue = findViewById(R.id.textViewVenue);

        Intent intentCode = getIntent();
        String code = intentCode.getStringExtra("ModCode");

        if (code.equals("C346")) {
            tvCode.setText("Module Code: C346");
            tvName.setText("Module Name: Android Programming");
            tvYear.setText("Academic Year: 2020");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W66M");
        } else if (code.equals("C203")) {
            tvCode.setText("Module Code: C203");
            tvName.setText("Module Name: Web App ln Development in php");
            tvYear.setText("Academic Year: 2020");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W65H");
        } else if (code.equals("C235")) {
            tvCode.setText("Module Code: C235");
            tvName.setText("Module Name: IT Security and Management");
            tvYear.setText("Academic Year: 2020");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: W65G");
        } else if (code.equals("C218")) {
            tvCode.setText("Module Code: C218");
            tvName.setText("Module Name: UI/UX Design for Apps");
            tvYear.setText("Academic Year: 2020");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E66B");
        } else if (code.equals("C206")) {
            tvCode.setText("Module Code: C206");
            tvName.setText("Module Name: Software Development Process");
            tvYear.setText("Academic Year: 2020");
            tvSem.setText("Semester: 1");
            tvCredit.setText("Module Credit: 4");
            tvVenue.setText("Venue: E66K");
        }
    }
}