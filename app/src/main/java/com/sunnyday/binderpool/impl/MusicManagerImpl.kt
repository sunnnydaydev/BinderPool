package com.sunnyday.binderpool.impl

import android.util.Log
import com.sunnyday.binderpool.IMusicManager

/**
 * Create by SunnyDay on 09:44 2021/08/07
 */
class MusicManagerImpl:IMusicManager.Stub() {
    companion object{
        const val TAG = "MusicManagerImpl"
    }
    override fun playMusic() {
       Log.i(TAG,"playMusic")
    }

}