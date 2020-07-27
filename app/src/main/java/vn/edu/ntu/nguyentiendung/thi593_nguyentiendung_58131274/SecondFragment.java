package vn.edu.ntu.nguyentiendung.thi593_nguyentiendung_58131274;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;

public class SecondFragment extends Fragment {

    NavController navController;
    EditText edtName, edtNgayBd, edtNgayKT, edtDiaDiem;
    Button bntThem, bntXem;
    ImageView imgNgayBD, imgNgayKT;
    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        setHasOptionsMenu(true);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        view.findViewById(R.id.button_second).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(SecondFragment.this)
//                        .navigate(R.id.action_SecondFragment_to_FirstFragment);
//            }
//        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        navController = NavHostFragment.findNavController(this);
        ((MainActivity)getActivity()).navController = navController;
    }

    private void AddView() {
        edtName = getView().findViewById(R.id.edtName);
        edtNgayBd = getView().findViewById(R.id.edtNgayBD);
        edtNgayKT = getView().findViewById(R.id.edtNgayKT);
        edtDiaDiem = getView().findViewById(R.id.edtDiaDiem);
        bntThem = getView().findViewById(R.id.bntThem);
        bntXem = getView().findViewById(R.id.bntXem);
        imgNgayBD = getView().findViewById(R.id.imgNgayBD);
        imgNgayKT = getView().findViewById(R.id.imgNgayKT);
        imgNgayBD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChonngayBD();
            }
        });
        imgNgayKT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ChonNgayKT();
            }
        });
    }

    private void ChonngayBD()
    {

    }

    private void ChonNgayKT()
    {

    }
}