package com.example.a30dayapp

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = AimTrainingAdapter(createAimTrainingList())
    }

    private fun createAimTrainingList(): List<AimTrainingItem> {
        return listOf(
            AimTrainingItem(1, "Flick Shots Practice", "Quick flick accuracy", "Practice flicking to head level with a fast mouse movement. Focus on precision.", R.drawable.flick_shot),
            AimTrainingItem(2, "Headshot Training", "Target headshots", "Spend 15 minutes focusing on hitting headshots in the practice range.", R.drawable.headshot_training),
            AimTrainingItem(3, "Tracking Training", "Follow the target", "Work on tracking moving targets in the shooting range to improve your aim consistency.", R.drawable.tracking_training),
            AimTrainingItem(4, "Spray Control", "Master recoil control", "Pick a weapon (e.g., Vandal or Phantom) and practice spraying on a wall while controlling recoil.", R.drawable.spray_control),
            AimTrainingItem(5, "Pre-aim Practice", "Predict enemy position", "Practice pre-aiming common angles and holding crosshair at head level.", R.drawable.preaim_training),
            AimTrainingItem(6, "Aiming at Distance", "Improve long-range accuracy", "Spend time in the range hitting targets at long distances. Focus on accuracy.", R.drawable.long_range_training),
            AimTrainingItem(7, "Quick Scope Practice", "Aim with precision", "Practice quick scoping with the operator. Try to land headshots while reacting fast.", R.drawable.quick_scope),
            AimTrainingItem(8, "Flick and Hold", "Combine flicking and holding angles", "Flick to target and hold the angle for 3 seconds. Focus on muscle memory.", R.drawable.flick_hold),
            AimTrainingItem(9, "Reaction Time", "Improve response speed", "Set up a custom match to react quickly to enemy movements or shots.", R.drawable.reaction_time),
            AimTrainingItem(10, "Crosshair Placement", "Aim at the right height", "Work on always placing your crosshair at head height when moving around the map.", R.drawable.crosshair_placement),
            AimTrainingItem(11, "Burst Firing", "Control burst shots", "Practice burst firing with automatic rifles to improve accuracy over distance.", R.drawable.spray_control),
            AimTrainingItem(12, "Strafing and Aiming", "Improve movement while aiming", "Work on strafing left and right while maintaining aim accuracy in the shooting range.", R.drawable.strafing),
            AimTrainingItem(13, "Recoil Reset", "Understand recoil patterns", "Focus on resetting the recoil between shots to ensure more accurate shooting.", R.drawable.recoil_control),
            AimTrainingItem(14, "Target Tracking", "Smooth tracking", "Use tracking targets to practice maintaining smooth aim movement as you follow them.", R.drawable.tracking_training),
            AimTrainingItem(15, "Crosshair Adjustments", "Fine-tune your crosshair", "Adjust your crosshair size and color to ensure better visibility and comfort during matches.", R.drawable.crosshair_placement),
            AimTrainingItem(16, "Sensitivity Tuning", "Find your optimal sensitivity", "Spend time adjusting your mouse sensitivity settings until you find what works best for your aim.", R.drawable.sens),
            AimTrainingItem(17, "One-Tap Training", "Aim for one-tap headshots", "Practice one-tapping in the range with rifles to increase your headshot accuracy.", R.drawable.one_taps),
            AimTrainingItem(18, "Close Combat Aiming", "Sharpen close range aim", "Work on your reaction speed and accuracy in close combat scenarios, especially when encountering enemies at short range.", R.drawable.close_combat),
            AimTrainingItem(19, "Aiming Under Pressure", "Control aim during panic", "Practice aiming accurately when under pressure by setting fast-moving targets in the range.", R.drawable.calm_aim),
            AimTrainingItem(20, "Switching Weapons Quickly", "Switch and aim", "Practice switching weapons rapidly and maintaining accuracy after switching.", R.drawable.switch_weapons),
            AimTrainingItem(21, "Pre-Firing Angles", "Pre-fire common spots", "Practice pre-firing at common enemy angles to reduce reaction time during engagements.", R.drawable.pre_aim_angles),
            AimTrainingItem(22, "Aim with Low Sensitivity", "Focus on slow, controlled aiming", "Lower your sensitivity and practice controlled aim, aiming slowly but steadily towards targets.", R.drawable.low_sens),
            AimTrainingItem(23, "Tracking with Pistols", "Practice with pistols", "Use pistols to practice tracking and headshots, focusing on precision.", R.drawable.pistol_aim),
            AimTrainingItem(24, "Shooting Through Smokes", "Hit targets through smokes", "Practice shooting through smokes, learning to control your shots even with poor vision.", R.drawable.tracking_smoke),
            AimTrainingItem(25, "Low HP Situations", "Aim with low health", "Try aiming and taking shots accurately when you have low health to simulate high-pressure situations.", R.drawable.low_hp),
            AimTrainingItem(26, "Flashed Aim", "React after a flash", "Work on quickly recovering your aim after being flashed and adjusting to the target.", R.drawable.flashed_),
            AimTrainingItem(27, "Full Round Aim Focus", "Maintain aim throughout rounds", "Focus on keeping a steady aim throughout an entire round by practicing aim consistency.", R.drawable.fullaim_round),
            AimTrainingItem(28, "Crouch Aiming", "Use crouch for more accuracy", "Practice crouching while shooting to see how it affects accuracy and movement.", R.drawable.crouch),
            AimTrainingItem(29, "Time Your Aim", "Perfect your reaction timing", "Practice aiming at targets with timed intervals to help improve reaction times.", R.drawable.aim_timing),
            AimTrainingItem(30, "Aim with Full Focus", "Conclude with a full session", "Complete an hour-long aim training session with all previous techniques combined to check your improvement.", R.drawable.focus_aim)
        )
    }
}



data class AimTrainingItem(
    val day: Int,
    val title: String,
    val summary: String,
    val description: String,
    val imageResId: Int
)

class AimTrainingAdapter(private val items: List<AimTrainingItem>) :
    RecyclerView.Adapter<AimTrainingAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val dayText: TextView = view.findViewById(R.id.dayText)
        val titleText: TextView = view.findViewById(R.id.titleText)
        val summaryText: TextView = view.findViewById(R.id.summaryText)
        val descriptionText: TextView = view.findViewById(R.id.descriptionText)
        val image: ImageView = view.findViewById(R.id.image)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_aimtrainingitem, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = items[position]
        holder.dayText.text = "Day ${item.day}"
        holder.titleText.text = item.title
        holder.summaryText.text = item.summary
        holder.descriptionText.text = item.description
        Glide.with(holder.itemView.context).load(item.imageResId).into(holder.image)
    }

    override fun getItemCount() = items.size
}