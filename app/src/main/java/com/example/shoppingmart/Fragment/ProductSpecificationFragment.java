package com.example.shoppingmart.Fragment;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.shoppingmart.Adapter.ProductSpecificationAdapter;
import com.example.shoppingmart.Model.ProductSpecificationnModel;
import com.example.shoppingmart.ProductDetailActivity;
import com.example.shoppingmart.R;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 */
public class ProductSpecificationFragment extends Fragment {


    public ProductSpecificationFragment() {
        // Required empty public constructor
    }

     private RecyclerView productSpecificationRecyclerView;
    public List<ProductSpecificationnModel>productSpecificationnModelList;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_product_specification, container, false);

        productSpecificationRecyclerView = view.findViewById(R.id.product_specification_recyclerview);

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);

        productSpecificationRecyclerView.setLayoutManager(linearLayoutManager);


        //productSpecificationnModelList.add(new ProductSpecificationnModel(0,"General"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));

        //productSpecificationnModelList.add(new ProductSpecificationnModel(0,"Display"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));

       // productSpecificationnModelList.add(new ProductSpecificationnModel(0,"General"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
      //  productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
       // productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
       // productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));

       // productSpecificationnModelList.add(new ProductSpecificationnModel(0,"Display"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
       // productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));
        //productSpecificationnModelList.add(new ProductSpecificationnModel(1,"RAM","4GB"));


        ProductSpecificationAdapter productSpecificationAdapter = new ProductSpecificationAdapter(productSpecificationnModelList);

        productSpecificationRecyclerView.setAdapter(productSpecificationAdapter);
         productSpecificationAdapter.notifyDataSetChanged();

        return view;
    }

}
