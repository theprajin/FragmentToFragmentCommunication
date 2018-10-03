package com.infotechnocation.fragmenttofragmentcommunicationdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayDataFragment extends Fragment {
    TextView displayTextView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_display_data, container, false);

        displayTextView = (TextView)view.findViewById(R.id.displayTextView);

        return view;

    }

    public void setData (String data){
        displayTextView.setText(data);
    }
}
