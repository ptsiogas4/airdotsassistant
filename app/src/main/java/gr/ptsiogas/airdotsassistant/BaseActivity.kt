package gr.ptsiogas.airdotsassistant

import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

open class BaseActivity : AppCompatActivity() {

    protected fun closeApp() {
        finish()
        exitProcess(0)
    }
}
