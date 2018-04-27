package com.example.acecommon;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;

/**
 * Created by Administrator on 2018/3/11.
 */

public class ToastUtils {

    public void showLog(Context context,String msg,String type){
        if(TextUtils.equals("a",type)){
            Log.i("aaa",msg);
        }else{
            Log.i("bbb",msg);
        }
    }
}
