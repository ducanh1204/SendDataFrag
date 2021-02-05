package vm.poly.edu.senddatafrag;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class Fragment1 extends Fragment {


    private EditText edtData;
    private Button btnSendData;
    private View view;
    private ISendDataListener iSendDataListener;

    public interface ISendDataListener{
        void sendData(String data);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        iSendDataListener = (ISendDataListener) getActivity();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_1, container, false);
        initUI();

        btnSendData.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendDataToFragment2();
            }
        });


        return view;

    }

    private void sendDataToFragment2() {
        String data = edtData.getText().toString().trim();
        if(iSendDataListener !=null){
            iSendDataListener.sendData(data);
        }
    }

    private void initUI() {
        edtData = view.findViewById(R.id.edt_data);
        btnSendData = view.findViewById(R.id.btn_send_data);
    }
}