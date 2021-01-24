package uk.co.antmobileapps.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import uk.co.antmobileapps.swoosh.EXTRA_PLAYER
import uk.co.antmobileapps.swoosh.Model.Player
import uk.co.antmobileapps.swoosh.R

class SkillActivity : BaseActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)!!

        // Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }
    fun onBallerClick (view: View) {
        btnBeginnerSkill.isChecked = false
        player.skill = "baller"

    }

    fun onBeginnerClick (view: View) {
        btnBallerSkill.isChecked = false
        player.skill = "beginner"

    }

    fun onSkillFinishedClicked(view: View) {
        if (player.skill!= "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(finishActivity)

        }else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()

        }


    }
}