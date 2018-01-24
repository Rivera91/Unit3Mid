package nyc.c4q.unit3mid;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private static final String SHARED_PREF_KEY = "address_shared_preference";
    private EditText email;
    private Button save;
    private Button button2;
    private SharedPreferences info;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final EditText email = (EditText) findViewById(R.id.email);
        Button save = (Button) findViewById(R.id.save);
        Button button2 = (Button) findViewById(R.id.button2);

        info = getApplicationContext().getSharedPreferences(SHARED_PREF_KEY, MODE_PRIVATE);

        email.setText(info.getString("amyrivera91@yahoo.com", "amyrivera91@yahoo.com"));
        email.setText(" ");

        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                SharedPreferences.Editor editor = info.edit();

                editor.putString("email", email.getText().toString());
                editor.commit();

            }
        });

      button2.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {

              Intent intent = new Intent(MainActivity.this, RecyclerActivity.class);
              intent.putExtra("sharedpref", "amyrivera91@yahoo.com");
              startActivity(intent);
          }
      });

    }
}
