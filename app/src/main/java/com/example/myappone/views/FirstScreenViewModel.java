package com.example.myappone.views;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.ViewModel;

import com.example.myappone.models.HomeStore;
import com.example.myappone.models.Products;
import com.example.myappone.presenter.ApiService;
import com.example.myappone.presenter.IApi;

import java.io.IOException;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;


public class FirstScreenViewModel extends ViewModel {

    private IApi api;

   public void getHomeSellers(){
       List<Products>[] products;
       if (api != null){
           api = ApiService.getApiclient();
           api.getListProductsR().enqueue(new Callback<List<Products>>(){
               @Override
               public void onResponse(@NonNull Call<List<Products>> call, @NonNull Response<List<Products>> response) {
                   Log.d("LOG_TAG", String.valueOf(response.body()));
                   System.out.println(String.valueOf(response.body()));
                   if (!response.isSuccessful()){
                       Log.d("LOG_TAG", "No Success");
                   }
                   if (response.isSuccessful()){
                       List<Products> changesList = response.body();
                       if (changesList != null) {
                           for (int i = 0; i < changesList.size(); i++) {
                               System.out.println(changesList.get(i).getBestSeller());
                           }
                       }
                   }
               }

               @Override
               public void onFailure(Call<List<Products>> call, Throwable t) {
                   Log.d("LOG_TAG", t.toString());
               }
           });
       }


    }

}
