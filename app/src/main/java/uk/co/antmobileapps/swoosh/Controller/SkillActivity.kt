package uk.co.antmobileapps.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*
import uk.co.antmobileapps.swoosh.EXTRA_LEAGUE
import uk.co.antmobileapps.swoosh.EXTRA_SKILL
import uk.co.antmobileapps.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""
    var  skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()

        // Toast.makeText(this, league, Toast.LENGTH_SHORT).show()
    }
    fun onBallerClick (view: View) {
        btnBeginnerSkill.isChecked = false
        skill = "baller"

    }

    fun onBeginnerClick (view: View) {
        btnBallerSkill.isChecked = false
        skill = "beginner"

    }

    fun onSkillFinishedClicked(view: View) {
        if (skill!= "") {
            val finishActivity = Intent(this, FinishActivity::class.java)
            finishActivity.putExtra(EXTRA_LEAGUE, league)
            finishActivity.putExtra(EXTRA_SKILL, skill)
            startActivity(finishActivity)

        }else {
            Toast.makeText(this, "Please select a skill level", Toast.LENGTH_SHORT).show()

        }


    }
}