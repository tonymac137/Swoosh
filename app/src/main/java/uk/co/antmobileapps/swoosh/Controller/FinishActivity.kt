package uk.co.antmobileapps.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*
import uk.co.antmobileapps.swoosh.EXTRA_PLAYER
import uk.co.antmobileapps.swoosh.Model.Player
import uk.co.antmobileapps.swoosh.R

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)

        if (player != null) {
            tvSearchViews.text ="Looking for ${player.league} ${player.skill} league near you..."
        }


    }
}