package sg.edu.rp.c346.id21018947.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView C346;
    TextView C203;
    TextView C235;
    TextView C218;
    TextView C206;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.textViewMod1);
        C203 = findViewById(R.id.textViewMod2);
        C235 = findViewById(R.id.textViewMod3);
        C218 = findViewById(R.id.textViewMod4);
        C206 = findViewById(R.id.textViewMod5);

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra( "ModCode", "C346" );
                startActivity(intent);
            }
        });

        C203.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra( "ModCode", "C203" );
                startActivity(intent);
            }
        });

        C235.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra( "ModCode", "C235" );
                startActivity(intent);
            }
        });

        C218.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra( "ModCode", "C218" );
                startActivity(intent);
            }
        });

        C206.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra( "ModCode", "C206" );
                startActivity(intent);
            }
        });
    }
}