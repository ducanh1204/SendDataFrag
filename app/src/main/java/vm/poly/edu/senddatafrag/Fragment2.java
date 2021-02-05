package vm.poly.edu.senddatafrag;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class Fragment2 extends Fragment {


    private TextView tvData;
    private View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_2, container, false);
        tvData = view.findViewById(R.id.tv_data);
        return view;
    }
    public void receiveDataFromFragment1(String data){
        tvData.setText(data);
    }
}