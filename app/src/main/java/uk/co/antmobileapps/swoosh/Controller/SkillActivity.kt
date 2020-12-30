package uk.co.antmobileapps.swoosh.Controller

import android.os.Bundle
import uk.co.antmobileapps.swoosh.EXTRA_LEAGUE
import uk.co.antmobileapps.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()

        // Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }
}