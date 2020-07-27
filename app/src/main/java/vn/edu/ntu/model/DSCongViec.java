package vn.edu.ntu.model;

import android.app.Application;

import java.util.ArrayList;

public class DSCongViec extends Application implements IDSCongViec{
    ArrayList<CongViec> listCV = new ArrayList<>();

    public DSCongViec()
    {
        listCV.add(new CongViec("Bai tap lop mon hoc Design","12/7/2020","25/7/2020","Giang duong G6","Chua tien hanh"));
    }

    @Override
    public ArrayList<CongViec> getlistCV() {
        return listCV;
    }
}
