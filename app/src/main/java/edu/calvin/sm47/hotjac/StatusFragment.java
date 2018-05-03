package edu.calvin.sm47.hotjac;


import android.bluetooth.BluetoothAdapter;
import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import java.io.IOException;
import java.util.UUID;



/**
 * A simple {@link Fragment} subclass.
 */
public class StatusFragment extends Fragment implements View.OnClickListener{

    public StatusFragment() {
        // Required empty public constructor

    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_status, container, false);
    }


    @Override
    public void onClick(View view) {

    }


}
