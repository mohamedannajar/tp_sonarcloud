package com.simplecity.amp_library.playback

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.media.AudioManager

class HeadsetManager(
    private val playbackManager: PlaybackManager,
    private val playbackSettingsManager: PlaybackSettingsManager
) {

    private var headsetReceiver: BroadcastReceiver? = null

    companion object {
        private const val EXTRA_STATE = "state"
        private const val STATE_DISCONNECTED = 0
        private const val STATE_CONNECTED = 1
    }

    fun registerHeadsetPlugReceiver(context: Context) {

        val filter = IntentFilter()
        filter.addAction(AudioManager.ACTION_HEADSET_PLUG)

        headsetReceiver = object : BroadcastReceiver() {

            override fun onReceive(context: Context, intent: Intent) {

                if (isInitialStickyBroadcast) {
                    return
                }

                if (intent.hasExtra(EXTRA_STATE)) {
                    when (intent.getIntExtra(EXTRA_STATE, STATE_DISCONNECTED)) {
                        STATE_DISCONNECTED -> if (playbackSettingsManager.pauseOnHeadsetDisconnect) {
                            playbackManager.pause(false)
                        }
                        STATE_CONNECTED -> if (playbackSettingsManager.playOnHeadsetConnect) {
                            playbackManager.play()
                        }
                    }
                }
            }
        }

        context.registerReceiver(headsetReceiver, filter)
    }

    fun unregisterHeadsetPlugReceiver(context: Context) {
        context.unregisterReceiver(headsetReceiver)
    }
}
