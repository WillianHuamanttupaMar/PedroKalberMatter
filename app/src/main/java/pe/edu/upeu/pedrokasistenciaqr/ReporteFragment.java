package pe.edu.upeu.pedrokasistenciaqr;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;
import dao.PersonaDAO;
import modelo.PersonaTO;
import util.PersonaAdapter;



public class ReporteFragment extends Fragment {
    PersonaDAO dao;
    private RecyclerView recyclerView;
    private RecyclerView.Adapter<PersonaAdapter.PersonaViewHolder> adapter;
    private RecyclerView.LayoutManager layoutManager;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_reporte2, container, false);
        View myFragmenView=inflater.inflate(R.layout.fragment_reporte2, container, false);
        dao=new PersonaDAO(this.getContext());
        List<PersonaTO> persona=dao.listarPersona();

        this.recyclerView=(RecyclerView)myFragmenView.findViewById(R.id.recyclerView);


        this.layoutManager=new LinearLayoutManager(this.getContext());

        this.adapter=new PersonaAdapter(persona);
        this.recyclerView.setLayoutManager(layoutManager);

        this.recyclerView.setAdapter(adapter);
        return myFragmenView;


    }
}

