package uk.co.antmobileapps.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import uk.co.antmobileapps.swoosh.EXTRA_LEAGUE
import uk.co.antmobileapps.swoosh.EXTRA_SKILL
import uk.co.antmobileapps.swoosh.R

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val league = intent.getStringExtra(EXTRA_LEAGUE)
        val  skill = intent.getStringExtra(EXTRA_SKILL)

        tvSearchViews.text = "Looking for $league $skill league near you..."
    }
}