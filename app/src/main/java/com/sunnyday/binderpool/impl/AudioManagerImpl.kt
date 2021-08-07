package com.sunnyday.binderpool.impl

import android.util.Log
import com.sunnyday.binderpool.IAudioManager

/**
 * Create by SunnyDay on 09:47 2021/08/07
 */
class AudioManagerImpl:IAudioManager.Stub() {
    companion object{
        const val TAG = "AudioManagerImpl"
    }
    override fun playAudio() {
        Log.i(TAG,"playAudio")
    }
}