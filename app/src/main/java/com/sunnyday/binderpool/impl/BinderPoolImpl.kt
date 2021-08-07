package com.sunnyday.binderpool.impl

import android.os.IBinder
import com.sunnyday.binderpool.IBinderPool

/**
 * Create by SunnyDay on 11:53 2021/08/07
 */

class BinderPoolImpl : IBinderPool.Stub() {

    companion object {
        const val TAG = "BinderPoolImpl"
        const val BINDER_NONE = -1
        const val BINDER_MUSIC_MANAGER = 0
        const val BINDER_AUDIO_MANAGER = 1
    }

    override fun getBinderByType(binderType: Int): IBinder? {
        return when (binderType) {
            BINDER_MUSIC_MANAGER -> MusicManagerImpl()
            BINDER_AUDIO_MANAGER -> AudioManagerImpl()
            else -> null
        }
    }
}