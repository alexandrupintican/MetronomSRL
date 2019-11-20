package com.example.metronomsrl.ui.order_parts;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.metronomsrl.R;

public class OrderPartsFragment extends Fragment {

    private OrderPartsViewModel mViewModel;

    public static OrderPartsFragment newInstance() {
        return new OrderPartsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        mViewModel =
                ViewModelProviders.of(this).get(OrderPartsViewModel.class);
        View root = inflater.inflate(R.layout.order_parts_fragment, container, false);
        final TextView textView = root.findViewById(R.id.order_parts_text);
        mViewModel.getText().observe(this, new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(OrderPartsViewModel.class);
        // TODO: Use the ViewModel
    }

}