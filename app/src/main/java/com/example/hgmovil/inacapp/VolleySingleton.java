package com.example.hgmovil.inacapp;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import android.content.Intent;


public class VolleySingleton
{

    private static VolleySingleton instance = null;
    private RequestQueue mRequestQueue;
    private VolleySingleton()
    {
        mRequestQueue = Volley.newRequestQueue(MainActivity.getAppContext());
    }

    public static VolleySingleton getInstance()
    {
        if (instance ==null)
        {
            instance = new VolleySingleton();
        }
        return instance;
    }


    public RequestQueue getmRequestQueue()
    {
        return mRequestQueue;
    }

}