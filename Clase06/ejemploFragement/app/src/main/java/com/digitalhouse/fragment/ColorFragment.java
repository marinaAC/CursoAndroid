package com.digitalhouse.fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class ColorFragment extends Fragment {

    private static final String KEY_COLOR = "color";
    private static final String KEY_TEXTO = "texto";


    public ColorFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        Bundle bundle = getArguments();
        Integer color =bundle.getInt(KEY_COLOR);
        String text = bundle.getString(KEY_TEXTO);

        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_color, container, false);
        TextView txtView =view.findViewById(R.id.txtViewColor);
        final FrameLayout frameLayout = view.findViewById(R.id.frmColor);
        txtView.setText(text);
        frameLayout.setBackgroundColor(color);
        txtView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Integer yellow = ContextCompat.getColor(getContext(),R.color.yellow);
                ((NotificadorActivity)getContext()).cambiarBackground(yellow);
            }
        });


        return view;
    }

    public static ColorFragment factoryColorFragment(Integer color, String texto){
        ColorFragment clFragment = new ColorFragment();
        Bundle bundle = new Bundle();
        bundle.putInt(KEY_COLOR,color);
        bundle.putString(KEY_TEXTO,texto);

        clFragment.setArguments(bundle);


        return clFragment;
    }

    public interface NotificadorActivity{
        void cambiarBackground(Integer color);
    }

}
