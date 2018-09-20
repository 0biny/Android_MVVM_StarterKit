package com.onssoft.baseapp.utils;

import android.databinding.Observable;
import android.databinding.ObservableField;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.text.Editable;
import android.text.TextWatcher;

import java.util.Objects;

/**
 * @author ReStartAllKill
 * @created on 2018-09-20
 * @modified by
 * @updated on
 */
public class TextWatcherAdapter  implements TextWatcher {

    public final ObservableField<String> value = new ObservableField<>();
    private final ObservableField<String> field;

    private boolean isInEditMode = false;

    public TextWatcherAdapter(ObservableField<String> f) {
        this.field = f;

        field.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback(){
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                if (isInEditMode){
                    return;
                }
                value.set(field.get());
            }
        });
    }

    @Override
    public void onTextChanged(CharSequence s, int start, int before, int count) {
        //
    }

    @Override
    public void beforeTextChanged(CharSequence s, int start, int count, int after) {
        //
    }

    @RequiresApi(api = Build.VERSION_CODES.KITKAT)
    @Override public void afterTextChanged(Editable s) {
        if (!Objects.equals(field.get(), s.toString())) {
            isInEditMode = true;
            field.set(s.toString());
            isInEditMode = false;
        }
    }
}