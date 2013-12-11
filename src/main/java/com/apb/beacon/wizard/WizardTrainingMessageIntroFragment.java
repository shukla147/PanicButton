package com.apb.beacon.wizard;

import android.graphics.Paint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.apb.beacon.R;

/**
 * Created by aoe on 12/12/13.
 */
public class WizardTrainingMessageIntroFragment extends WizardFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.wizard_training_message_intro, container, false);


        Button bIUnderstand = (Button) view.findViewById(R.id.i_understand);
        bIUnderstand.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((WizardActivity)getActivity()).performAction(null);
            }
        });
        return view;
    }
}
