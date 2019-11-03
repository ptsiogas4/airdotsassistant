package gr.ptsiogas.airdotsassistant

import android.content.Context
import android.media.AudioManager
import android.os.Bundle
import android.os.SystemClock
import android.view.KeyEvent

class SkipTrackActivity : BaseActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        skipTrack(this.applicationContext)
        closeApp()
    }

    private fun skipTrack(appContext: Context) {
        val mAudioManager = appContext.getSystemService(Context.AUDIO_SERVICE) as AudioManager
        val eventTime = SystemClock.uptimeMillis()

        val downEvent = KeyEvent(eventTime, eventTime, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_MEDIA_NEXT, 0)
        mAudioManager.dispatchMediaKeyEvent(downEvent)

        val upEvent = KeyEvent(eventTime, eventTime, KeyEvent.ACTION_UP, KeyEvent.KEYCODE_MEDIA_NEXT, 0)
        mAudioManager.dispatchMediaKeyEvent(upEvent)
    }
}