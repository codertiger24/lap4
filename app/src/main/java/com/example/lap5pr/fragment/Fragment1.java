package com.example.lap5pr.fragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.example.lap5pr.R;


public class Fragment1 extends Fragment {
    EditText edContent;
    Button btnSend;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_1, container, false);
        edContent = view.findViewById(R.id.edtContent);
        btnSend = view.findViewById(R.id.btn_send);
        btnSend.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String content = edContent.getText().toString().trim();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
                Fragment2 fragment2 = (Fragment2) fragmentManager.findFragmentById(R.id.fr2);
                fragment2.tv2.setText(content);

            }
        });
        return view;
    }
}