package com.cname.nada;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.cname.nada.functions.UserID;

public class Frag3 extends Fragment{
    private View view;
    private TextView tempoTextView;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        view = inflater.inflate(R.layout.frag3,container,false);
        tempoTextView = (TextView) view.findViewById(R.id.tempoTextView);

        tempoTextView.setText(UserID.getUserId());


        return view;
    }
}
