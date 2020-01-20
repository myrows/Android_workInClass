package com.example.amazonlist;

import android.content.Context;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * A fragment representing a list of Items.
 * <p/>
 * Activities containing this fragment MUST implement the {@link OnListFragmentInteractionListener}
 * interface.
 */
public class productoFragment extends Fragment {

    List<Producto> listaProductos;

    // TODO: Customize parameter argument names
    private static final String ARG_COLUMN_COUNT = "column-count";
    // TODO: Customize parameters
    private int mColumnCount = 1;
    private OnListFragmentInteractionListener mListener;

    /**
     * Mandatory empty constructor for the fragment manager to instantiate the
     * fragment (e.g. upon screen orientation changes).
     */
    public productoFragment() {
    }

    // TODO: Customize parameter initialization
    @SuppressWarnings("unused")
    public static productoFragment newInstance(int columnCount) {
        productoFragment fragment = new productoFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_COLUMN_COUNT, columnCount);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        if (getArguments() != null) {
            mColumnCount = getArguments().getInt(ARG_COLUMN_COUNT);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_producto_list, container, false);

        // Set the adapter
        if (view instanceof RecyclerView) {
            Context context = view.getContext();
            RecyclerView recyclerView = (RecyclerView) view;
            if (mColumnCount <= 1) {
                recyclerView.setLayoutManager(new LinearLayoutManager(context));
            } else {
                recyclerView.setLayoutManager(new GridLayoutManager(context, mColumnCount));
            }

            listaProductos = new ArrayList<>();
            listaProductos.add(new Producto("Alexa Echo","Amazon","Recibelo el","Envío GRATIS","https://images-na.ssl-images-amazon.com/images/I/61yI7vWa83L._SX679_.jpg", "https://caristaapp.files.wordpress.com/2018/06/amazon-choice.png?w=369&h=123", "https://www.scrappingparados.com/wp-content/uploads/2018/11/amazon-prime-suscribete.png","Ver otras variantes","(210)","disponible","miercoles 23 de Junio","EUR 99.99", 4f));
            listaProductos.add(new Producto("Alexa Echo","Amazon","Recibelo el","Envío GRATIS","https://images-na.ssl-images-amazon.com/images/I/61yI7vWa83L._SX679_.jpg", "https://caristaapp.files.wordpress.com/2018/06/amazon-choice.png?w=369&h=123", "https://www.scrappingparados.com/wp-content/uploads/2018/11/amazon-prime-suscribete.png","Ver otras variantes","(210)","disponible","miercoles 23 de Junio","EUR 99.99", 4f));
            listaProductos.add(new Producto("Alexa Echo","Amazon","Recibelo el","Envío GRATIS","https://images-na.ssl-images-amazon.com/images/I/61yI7vWa83L._SX679_.jpg", "https://caristaapp.files.wordpress.com/2018/06/amazon-choice.png?w=369&h=123", "https://www.scrappingparados.com/wp-content/uploads/2018/11/amazon-prime-suscribete.png","Ver otras variantes","(210)","disponible","miercoles 23 de Junio","EUR 99.99", 4f));
            listaProductos.add(new Producto("Alexa Echo","Amazon","Recibelo el","Envío GRATIS","https://images-na.ssl-images-amazon.com/images/I/61yI7vWa83L._SX679_.jpg", "https://caristaapp.files.wordpress.com/2018/06/amazon-choice.png?w=369&h=123", "https://www.scrappingparados.com/wp-content/uploads/2018/11/amazon-prime-suscribete.png","Ver otras variantes","(210)","disponible","miercoles 23 de Junio","EUR 99.99", 4f));

            recyclerView.setAdapter(new MyproductoRecyclerViewAdapter(listaProductos, mListener));
        }
        return view;
    }


    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof OnListFragmentInteractionListener) {
            mListener = (OnListFragmentInteractionListener) context;
        } else {
            throw new RuntimeException(context.toString()
                    + " must implement OnListFragmentInteractionListener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        mListener = null;
    }

    /**
     * This interface must be implemented by activities that contain this
     * fragment to allow an interaction in this fragment to be communicated
     * to the activity and potentially other fragments contained in that
     * activity.
     * <p/>
     * See the Android Training lesson <a href=
     * "http://developer.android.com/training/basics/fragments/communicating.html"
     * >Communicating with Other Fragments</a> for more information.
     */
    public interface OnListFragmentInteractionListener {
        // TODO: Update argument type and name
        void onListFragmentInteraction(Producto item);
    }
}
