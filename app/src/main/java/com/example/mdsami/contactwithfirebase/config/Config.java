package com.example.mdsami.contactwithfirebase.config;


import android.support.multidex.MultiDexApplication;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
/**
 * Created by mdsami on 4/2/18.
 */
public class Config extends MultiDexApplication{
     private static Config mInstance;


    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this ;

        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
        DatabaseReference scoresRef = FirebaseDatabase.getInstance().getReference("users");
        scoresRef.keepSynced(true);
    }
}
