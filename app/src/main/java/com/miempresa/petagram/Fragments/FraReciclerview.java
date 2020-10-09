package com.miempresa.petagram.Fragments;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

import com.miempresa.petagram.Pojo.MascotaModelo;
import com.miempresa.petagram.R;
import com.miempresa.petagram.adapters.ReciclerViewAdaptador;

public class FraReciclerview extends Fragment {

    public FraReciclerview(){

    }

    private RecyclerView recyclerViewMascota;
    private ReciclerViewAdaptador adaptadorMascota;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.activity_fra_reciclerview, container, false);

        recyclerViewMascota = v.findViewById(R.id.reciclerMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(getActivity()));

        adaptadorMascota = new ReciclerViewAdaptador(obtenerMascotas());
        recyclerViewMascota.setAdapter(adaptadorMascota);

        return v;
    }

    public List<MascotaModelo> obtenerMascotas(){
        List<MascotaModelo> mascota = new ArrayList<>();
        mascota.add(new MascotaModelo("Fiera", 0, R.drawable.ct1));
        mascota.add(new MascotaModelo("Sultán", 1, R.drawable.ct2));
        mascota.add(new MascotaModelo("Fido", 2, R.drawable.ct3));
        mascota.add(new MascotaModelo("Tarzán", 3, R.drawable.ct4));
        mascota.add(new MascotaModelo("Beethoven", 4, R.drawable.ct5));
        mascota.add(new MascotaModelo("Spike", 5, R.drawable.ct6));

        return mascota;
    }

}