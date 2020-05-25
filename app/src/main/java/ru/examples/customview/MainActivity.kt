package ru.examples.customview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_main.*
import ru.examples.customview.ui.custom.AvatarImageView

class MainActivity : AppCompatActivity() {

    private val stId = 10

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val view = AvatarImageView(this).apply {
            id = stId
            layoutParams = LinearLayout.LayoutParams(120,120)
            setImageResource(R.drawable.ava_big)
            setInitials("DS")
        }

        container.addView(view)

    }
}
