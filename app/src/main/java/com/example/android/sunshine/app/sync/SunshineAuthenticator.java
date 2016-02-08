package com.example.android.sunshine.app.sync;

import android.accounts.AbstractAccountAuthenticator;
import android.accounts.Account;
import android.accounts.AccountAuthenticatorResponse;
import android.accounts.NetworkErrorException;
import android.content.Context;
import android.os.Bundle;

/**
 * Created by pc on 2/8/2016.
 */
public class SunshineAuthenticator extends AbstractAccountAuthenticator{
    public SunshineAuthenticator(Context context){
        super(context);
    }
    //No properties to edit

    @Override
    public Bundle editProperties(AccountAuthenticatorResponse r, String s) {
        throw new UnsupportedOperationException();
    }

    //We are not adding an account to the device so return null

    @Override
    public Bundle addAccount(AccountAuthenticatorResponse r, String s, String s1, String[] strings, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    //Ignore attempts to confirm details

    @Override
    public Bundle confirmCredentials(AccountAuthenticatorResponse r, Account account, Bundle bundle) throws NetworkErrorException {
        return null;
    }

    @Override
    public Bundle getAuthToken(AccountAuthenticatorResponse r, Account account, String s, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public String getAuthTokenLabel(String s) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Bundle updateCredentials(AccountAuthenticatorResponse r, Account account, String s, Bundle bundle) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }

    @Override
    public Bundle hasFeatures(AccountAuthenticatorResponse r, Account account, String[] strings) throws NetworkErrorException {
        throw new UnsupportedOperationException();
    }
}
