package com.sunnyday.binderpool

import android.app.Service
import android.content.Intent
import android.os.IBinder
import android.util.Log
import com.sunnyday.binderpool.impl.BinderPoolImpl


class BinderPoolService : Service() {

    companion object{
        const val TAG = "MusicManagerImpl"
    }

    override fun onBind(intent: Intent): IBinder {
        Log.i(TAG,"onBind")
        return BinderPoolImpl()
    }

}
