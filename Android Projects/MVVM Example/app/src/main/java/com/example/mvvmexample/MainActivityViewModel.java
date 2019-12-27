package com.example.mvvmexample;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * @author Jaypatelbond created on 27-12-2019.
 *
 * @implNote  There are two methods to update the value of a MutableLiveData instance.
 * setValue() and the postValue().
 * This setvalue() method must be called from the main thread.
 * If you need to set a value form a background thread you should use the postValue() method.
 *
 */

public class MainActivityViewModel extends ViewModel {
    private int clickCount = 0;
    private MutableLiveData<Integer> countLiveData=new MutableLiveData<>();

    public MutableLiveData<Integer> getInitialCount() {

        countLiveData.setValue(clickCount);
        return countLiveData;
    }

    public void getCurrentCount() {

        clickCount += 1;
        countLiveData.setValue(clickCount);

    }
}
