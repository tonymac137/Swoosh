package uk.co.antmobileapps.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*
import uk.co.antmobileapps.swoosh.EXTRA_PLAYER
import uk.co.antmobileapps.swoosh.Model.Player
import uk.co.antmobileapps.swoosh.R

class LeagueActivity : BaseActivity() {
    

    var player = Player("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun  onMensClicked(view: View) {
        btnWomensLeague.isChecked = false
        btnCoedClicked.isChecked = false

        player.league = "mens"
    }

    fun  onWomensClicked(view: View) {
        btnMensLeague.isChecked = false
        btnCoedClicked.isChecked = false

        player.league = "womens"

    }

    fun  onCoedClicked(view: View) {
        btnWomensLeague.isChecked = false
        btnMensLeague.isChecked = false

        player.league = "co-ed"

    }


    fun leagueNextClicked(view: View) {
        if (player.league  != "") {
            val skillActivity = Intent(this, SkillActivity::class.java)
            skillActivity.putExtra(EXTRA_PLAYER, player)
            startActivity(skillActivity)
        }else {
            Toast.makeText(this, "Please select a league.", Toast.LENGTH_SHORT).show()
        }

    }



}