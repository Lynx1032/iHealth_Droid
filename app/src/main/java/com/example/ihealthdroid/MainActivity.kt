package com.example.ihealthdroid

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import android.widget.Button
import com.example.ihealthdroid.ui.theme.IHealthDroidTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IHealthDroidTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    setContentView(R.layout.main_menu_layout)

                    val medicalProfileBtn = findViewById<Button>(R.id.medical_profile_btn)
                    medicalProfileBtn.setOnClickListener {
                        val intent = Intent(this@MainActivity, MedicalProfileActivity::class.java)
                        startActivity(intent)
                    }

                    val pickAppointmentBtn = findViewById<Button>(R.id.pick_appointment_btn)
                    pickAppointmentBtn.setOnClickListener {
                        val intent = Intent(this@MainActivity, PickAppointmentActivity::class.java)
                        startActivity(intent)
                    }

                    val emergencyBtn = findViewById<Button>(R.id.emergency_btn)
                    emergencyBtn.setOnClickListener {
                        val intent = Intent(this@MainActivity, EmergencyActivity::class.java)
                        startActivity(intent)
                    }

                    val healthWikiBtn = findViewById<Button>(R.id.wiki_btn)
                    healthWikiBtn.setOnClickListener {
                        val intent = Intent(this@MainActivity, HealthWikiActivity::class.java)
                        startActivity(intent)
                    }
                }
            }
        }
    }
}