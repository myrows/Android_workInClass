package com.example.amazonlist;

import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.amazonlist.productoFragment.OnListFragmentInteractionListener;


import java.util.List;

public class MyproductoRecyclerViewAdapter extends RecyclerView.Adapter<MyproductoRecyclerViewAdapter.ViewHolder> {

    private final List<Producto> mValues;
    private final OnListFragmentInteractionListener mListener;
    Context ctx;

    public MyproductoRecyclerViewAdapter(List<Producto> items, OnListFragmentInteractionListener listener) {
        mValues = items;
        mListener = listener;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_producto, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        holder.objectProducto = mValues.get(position);
        holder.nombre.setText(holder.objectProducto.getNombre());
        holder.proveedor.setText(holder.objectProducto.getProveedor());
        holder.recibe.setText(holder.objectProducto.getRecibe());
        holder.envio.setText(holder.objectProducto.getEnvio());
        holder.otros.setText(holder.objectProducto.getResenias());
        holder.resenias.setText(holder.objectProducto.getResenias());
        holder.precio.setText(holder.objectProducto.getPrecio());
        holder.rate.setRating(holder.objectProducto.getRate());
        holder.stock.setText(holder.objectProducto.getStock());
        holder.fechaLLegada.setText(holder.objectProducto.getFechaLLegada());

        Glide.with(ctx).load(holder.objectProducto.getUrlFoto());

        holder.mView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (null != mListener) {
                    // Notify the active callbacks interface (the activity, if the
                    // fragment is attached to one) that an item has been selected.
                    mListener.onListFragmentInteraction(holder.mItem);
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return mValues.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public final View mView;
        public final TextView nombre;
        public final TextView proveedor;
        public final TextView recibe;
        public final TextView envio;
        public final TextView urlFoto;
        public final TextView otros;
        public final TextView resenias;
        public final TextView precio;
        public final RatingBar rate;
        public final ImageView fotoProducto;
        public final TextView stock;
        public final TextView fechaLLegada;
        public Producto objectProducto;

        public ViewHolder(View view) {
            super(view);
            mView = view;
            nombre = view.findViewById(R.id.textViewTitle);
            proveedor = view.findViewById(R.id.textViewProvider);
            recibe = view.findViewById(R.id.textViewDelivery);
            envio = view.findViewById(R.id.te)

        }

        @Override
        public String toString() {
            return super.toString() + " '" + mContentView.getText() + "'";
        }
    }
}
