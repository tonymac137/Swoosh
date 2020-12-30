package uk.co.antmobileapps.swoosh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()

        // Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }
}