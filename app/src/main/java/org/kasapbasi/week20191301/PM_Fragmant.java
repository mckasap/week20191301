package org.kasapbasi.week20191301;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class PM_Fragmant extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

    // View v =super.onCreateView(inflater, container, savedInstanceState);



        return inflater.inflate(R.layout.pm_layout,container,false);


    }
}
