package wildcodeschool.quetesimpleui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    EditText editText2;
    EditText editText3;
    CheckBox checkBox;
    Button button2;
    TextView textView2;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText2 = (EditText) findViewById(R.id.editText2);
        editText3 = (EditText) findViewById(R.id.editText3);
        checkBox = (CheckBox) findViewById(R.id.checkBox);
        button2 = (Button) findViewById(R.id.button2);
        textView2 = (TextView) findViewById(R.id.textView2);



        checkBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {

                editText2.setEnabled(checkBox.isChecked());
                editText3.setEnabled(checkBox.isChecked());
                button2.setEnabled(checkBox.isChecked());
                if (!isChecked) {
                    editText2.setText(null);
                    editText3.setText(null);
                    textView2.setVisibility(View.INVISIBLE);

                }
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                if (editText2.length() != 0 && editText3.length() !=0) {
                    textView2.setText("you are a Wizard now: " +editText2.getText()+ " "+editText3.getText());
                    textView2.setVisibility(View.VISIBLE);
                }

                    else
                {

                    Context context = getApplicationContext();
                CharSequence text = "toast";
                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(context, text, duration);
                toast.show();

            }
        };

    });
};}

