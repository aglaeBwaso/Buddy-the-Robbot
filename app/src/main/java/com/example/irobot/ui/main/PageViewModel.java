package com.example.irobot.ui.main;

import androidx.arch.core.util.Function;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Transformations;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.*;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.irobot.R;

public class PageViewModel extends ViewModel {



    private MutableLiveData<Integer> mIndex = new MutableLiveData<>();
    private LiveData<String> mText = Transformations.map(mIndex, new Function<Integer, String>() {
//        @Override
////        public Button appl(Integer input){
////
////        }



        @Override
        public String apply(Integer input) {


            if(input == 1){


                return "Here you can find your daily notifications.                                     Do you want to play music or do you prefere cooking some cookies?";
                //setContentView(R.layout.Notif);

            }

            else if (input == 2){
                return"Here is your daily planning:";

            }

            else if (input == 3){
                return"Here are your contacts:";

            }

            else {
                return "";

            }

            //return "Hello world from section: " + input;
        }

    });



    public void setIndex(int index) {
        mIndex.setValue(index);
    }

    public LiveData<String> getText() {
        return mText;
    }
}