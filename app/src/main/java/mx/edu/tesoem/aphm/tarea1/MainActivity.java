package mx.edu.tesoem.aphm.tarea1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText num1, num2, num3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        num1 = (EditText) findViewById(R.id.E1);
        num2 = (EditText) findViewById(R.id.E2);
        num3 = (EditText) findViewById(R.id.E3);

        RadioButton btsum = (RadioButton) findViewById(R.id.radioButton);
        final TextView resultado = (TextView) findViewById(R.id.E3);



        btsum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.valueOf(num1.getText().toString());
                int a2 = Integer.valueOf(num2.getText().toString());
                int result = a1 + a2;
                resultado.setText(""+result);
            }
        });

        RadioButton btres = (RadioButton) findViewById(R.id.radioButton2);
        final TextView res = (TextView) findViewById(R.id.E3);

        btres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.valueOf(num1.getText().toString());
                int a2 = Integer.valueOf(num2.getText().toString());
                int resul = a1 - a2;
                res.setText(""+resul);
            }
        });

        RadioButton btmul = (RadioButton) findViewById(R.id.radioButton3);
        final TextView mult = (TextView) findViewById(R.id.E3);

        btmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.valueOf(num1.getText().toString());
                int a2 = Integer.valueOf(num2.getText().toString());
                int resul = a1 * a2;
                mult.setText(""+resul);
            }
        });

        RadioButton btdiv = (RadioButton) findViewById(R.id.radioButton4);
        final TextView divi = (TextView) findViewById(R.id.E3);

        btdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int a1 = Integer.valueOf(num1.getText().toString());
                int a2 = Integer.valueOf(num2.getText().toString());
                int resul = a1 / a2;
                divi.setText(""+resul);
            }
        });

    }
}
