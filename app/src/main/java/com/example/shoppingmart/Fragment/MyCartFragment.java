package com.example.shoppingmart.Fragment;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.shoppingmart.Adapter.CartAdapter;
import com.example.shoppingmart.AddAddressActivity;
import com.example.shoppingmart.DeliveryActivity;
import com.example.shoppingmart.Model.CartItemModel;
import com.example.shoppingmart.R;

import java.util.ArrayList;
import java.util.List;


public class MyCartFragment extends Fragment {

    public MyCartFragment() {
        // Required empty public constructor
    }

   private RecyclerView cartItemsRecyclerView;
    private Button continueBtn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_my_cart, container, false);

        cartItemsRecyclerView = view.findViewById(R.id.cart_items_recyclerview);
       continueBtn = view.findViewById(R.id.cart_continue_btn);

        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        cartItemsRecyclerView.setLayoutManager(layoutManager);

        List<CartItemModel> cartItemModelList = new ArrayList<>();
         cartItemModelList.add(new CartItemModel(0,R.drawable.mob3,"Pixel 2",2,"Rs.49999/-","Rs.5999/-",1,0,0));
        cartItemModelList.add(new CartItemModel(0,R.drawable.mob3,"Pixel 2",0,"Rs.49999/-","Rs.5999/-",1,1,0));
        cartItemModelList.add(new CartItemModel(0,R.drawable.mob3,"Pixel 2",2,"Rs.49999/-","Rs.5999/-",1,2,0));
        cartItemModelList.add(new CartItemModel(1,"Price (3 items)","Rs.169999/-","Free","Rs.169999/-","Rs.5999/-"));

        CartAdapter cartAdapter = new CartAdapter(cartItemModelList);
        cartItemsRecyclerView.setAdapter(cartAdapter);
        cartAdapter.notifyDataSetChanged();

        continueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent deliveryIntent = new Intent(getContext(), AddAddressActivity.class);
                getContext().startActivity(deliveryIntent);
            }
        });

        return view;
    }






}
