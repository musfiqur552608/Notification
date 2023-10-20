package org.freedu.notification

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.freedu.notification.databinding.ActivityMainBinding
import org.freedu.notification.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivitySecondBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.textView.setText(intent.getStringExtra("DATA_REC"))
    }
}