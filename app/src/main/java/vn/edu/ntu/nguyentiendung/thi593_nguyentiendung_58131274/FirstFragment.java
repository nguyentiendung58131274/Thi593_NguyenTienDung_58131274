package vn.edu.ntu.nguyentiendung.thi593_nguyentiendung_58131274;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.fragment.NavHostFragment;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import vn.edu.ntu.model.CongViec;
import vn.edu.ntu.model.IDSCongViec;

public class FirstFragment extends Fragment {

    ArrayList<CongViec> listCV;
    CVAdapter Adapter;
    RecyclerView rvlistCV;
    IDSCongViec idsCongViec;
    NavController navController;

    @Override
    public View onCreateView(
            LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_first, container, false);
        rvlistCV = view.findViewById(R.id.rvDSCV);
        setHasOptionsMenu(true);
        return view;
    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

//        view.findViewById(R.id.button_first).setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                NavHostFragment.findNavController(FirstFragment.this)
//                        .navigate(R.id.action_FirstFragment_to_SecondFragment);
//            }
//        });
        AddView();
    }

    private void AddView() {
        rvlistCV = getView().findViewById(R.id.rvDSCV);
        idsCongViec = (IDSCongViec) getActivity().getApplication();

    }

    @Override
    public void onCreateOptionsMenu(@NonNull Menu menu, @NonNull MenuInflater inflater) {

        super.onCreateOptionsMenu(menu, inflater);
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        navController = NavHostFragment.findNavController(this);
        ((MainActivity)getActivity()).navController = navController;
    }

    private class CVViewHolder extends RecyclerView.ViewHolder {

        TextView txtName, txtNgayBD, txtNgayKT, txtDiaDiem, txtTinhTrang;
        CongViec cv;

        public CVViewHolder(@NonNull View itemView) {
            super(itemView);
            txtName = itemView.findViewById(R.id.txtName);
            txtNgayBD = itemView.findViewById(R.id.txtNgayBD);
            txtNgayKT = itemView.findViewById(R.id.txtNgayKT);
            txtDiaDiem = itemView.findViewById(R.id.txtDiaDiem);
            txtTinhTrang = itemView.findViewById(R.id.txtDiaDiem);
        }

        public void bind(final CongViec cv) {
            this.cv = cv;
            txtName.setText(cv.getName());
            txtNgayBD.setText(cv.getNgayBD());
            txtNgayKT.setText(cv.getNgayKT());
            txtDiaDiem.setText(cv.getDiaDiem());
            txtTinhTrang.setText(cv.getTinhTrang());
        }
    }

    private class CVAdapter extends RecyclerView.Adapter<CVViewHolder> {
        ArrayList<CongViec> listCV;

        public CVAdapter(ArrayList<CongViec> listCV) {
            this.listCV = listCV;
        }

        @NonNull
        @Override
        public CVViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
            LayoutInflater inflater = getLayoutInflater();
            View view = inflater.inflate(R.layout.item_cv, parent, false);
            return new CVViewHolder(view);
        }

        @Override
        public void onBindViewHolder(@NonNull CVViewHolder holder, int position) {
            holder.bind(listCV.get(position));
        }

        @Override
        public int getItemCount() {
            return listCV.size();
        }
    }
}