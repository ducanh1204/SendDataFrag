package vm.poly.edu.senddatafrag;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements Fragment1.ISendDataListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();

        fragmentTransaction.add(R.id.content_frame1,new Fragment1());
        fragmentTransaction.add(R.id.content_frame2,new Fragment2());
        fragmentTransaction.commit();


    }

    @Override
    public void sendData(String data) {
        Fragment2 fragment2 = (Fragment2) getSupportFragmentManager().findFragmentById(R.id.content_frame2);
        fragment2.receiveDataFromFragment1(data);
    }
}