package com.example.fregments

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.fregments.databinding.ActivityMainBinding
import com.example.fregments.ui.theme.FregmentsTheme
/*view binding added*/

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val firstFragment = FirstFragment()
        val secondFragment = SecondFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, firstFragment) /* inital fragment into flFragment container */
            commit()
        }
        var btn1 = findViewById<Button>(R.id.btnFrag1)
        btn1.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, firstFragment) /* inital fragment into flFragment container */
                addToBackStack(null) /* backspace dile ager frag a back korbe */
                commit()
            }
        }
        var btn2 = findViewById<Button>(R.id.btnFrag2)
        btn2.setOnClickListener {
            supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, secondFragment) /* inital fragment into flFragment container */
                addToBackStack(null)
                commit()
            }
        }


    }
}
