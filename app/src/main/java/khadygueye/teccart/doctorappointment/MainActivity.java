package khadygueye.teccart.doctorappointment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lePatient;
    private ArrayList<Patient> myPatientArraylist ;
    private patientAdapter adapter;

     private EditText nom ;
     private EditText prenom ;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

     this.lePatient=(ListView)findViewById(R.id.lePatient) ;
     this.nom=(EditText) findViewById(R.id.txtnom);
        this.prenom=(EditText) findViewById(R.id.txtprenom);
    }

    public void Start(View view) {

      String N= this.nom.getText().toString();
        String P= this.prenom.getText().toString();
    }
}