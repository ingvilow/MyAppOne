package com.example.myappone.presenter;
import android.util.Log;

import com.example.myappone.models.HomeStore;
import com.example.myappone.models.Products;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;


// request to http GET
public interface IApi {
    @GET("https://run.mocky.io/v3/654bd15e-b121-49ba-a588-960956b15175")
    Call<List<Products>> getListProductsR();
}
