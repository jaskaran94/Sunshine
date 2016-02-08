package com.example.android.sunshine.app.sync;

/**
 * Created by pc on 2/8/2016.
 */

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.annotation.Nullable;

public class SunshineAuthenticatorService extends Service {
    //Instance field that stores the authenticator object.
    private SunshineAuthenticator mAuthenticator;

    @Override
    public void onCreate() {
        //Create a new authenticator object.
        mAuthenticator = new SunshineAuthenticator(this);
    }

    /* when the system binds to this Service to make the RPC call
     *return the authenticator's IBinder.
    */

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mAuthenticator.getIBinder();
    }
}
