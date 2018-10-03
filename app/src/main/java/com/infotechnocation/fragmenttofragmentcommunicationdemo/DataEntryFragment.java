package com.infotechnocation.fragmenttofragmentcommunicationdemo;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class DataEntryFragment extends Fragment implements View.OnClickListener{
    EditText dataEditText;
    Button submitButton;
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_data_entry, container, false);

        dataEditText = (EditText)view.findViewById(R.id.editText);
        submitButton = (Button)view.findViewById(R.id.btn_submit);

        submitButton.setOnClickListener(this);

        return view;

    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onClick(View view) {
        OnDataEntryListener listener = (OnDataEntryListener)getActivity();
        listener.ondataentered(dataEditText.getText().toString());
    }
}
