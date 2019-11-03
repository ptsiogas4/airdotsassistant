package gr.ptsiogas.airdotsassistant

import android.os.Bundle

/*Fill free to implement any features*/
class MainActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        onBackPressed()
    }
}
