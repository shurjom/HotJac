package edu.calvin.sm47.hotjac;


import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class BatteryFragment extends Fragment {
    private TextView batteryTxt;
    int health = 0;

    public BatteryFragment() {
        // Required empty public constructor
    }



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_battery, container, false);

        return rootView;
    }

    @Override
    public void onResume() {
        super.onResume();

        batteryTxt=(TextView)getActivity().findViewById(R.id.batteryTxt);
        setare();

    }

    public void setare(){

        batteryTxt.setText("Health: " + health + "%");



    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getActivity().registerReceiver(this.batteryInfoReceiver, new IntentFilter(Intent.ACTION_BATTERY_CHANGED));
    }

    private BroadcastReceiver batteryInfoReceiver = new BroadcastReceiver() {
        @Override
        public void onReceive(Context context, Intent intent) {

            health= intent.getIntExtra(BatteryManager.EXTRA_HEALTH,0);


        }
    };

}