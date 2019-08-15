package com.xcheko51x.ejemplocarrocompras;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    TextView tvCantProductos;
    Button btnVerCarro;
    RecyclerView rvListaProductos;
    AdaptadorProductos adaptador;

    List<Producto> listaProductos = new ArrayList<>();
    List<Producto> carroCompras = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        tvCantProductos = findViewById(R.id.tvCantProductos);
        btnVerCarro = findViewById(R.id.btnVerCarro);
        rvListaProductos = findViewById(R.id.rvListaProductos);
        rvListaProductos.setLayoutManager(new GridLayoutManager(MainActivity.this, 1));

        listaProductos.add(new Producto("1", "Producto 1", "Descripcion del Producto 1", 50.0));
        listaProductos.add(new Producto("2", "Producto 2", "Descripcion del Producto 2", 80.0));
        listaProductos.add(new Producto("3", "Producto 3", "Descripcion del Producto 3", 40.0));
        listaProductos.add(new Producto("4", "Producto 4", "Descripcion del Producto 4", 20.0));
        listaProductos.add(new Producto("5", "Producto 5", "Descripcion del Producto 5", 56.0));

        adaptador = new AdaptadorProductos(MainActivity.this, tvCantProductos, btnVerCarro, listaProductos, carroCompras);
        rvListaProductos.setAdapter(adaptador);
    }
}
