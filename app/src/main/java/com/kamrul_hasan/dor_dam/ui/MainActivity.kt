package com.kamrul_hasan.dor_dam.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.kamrul_hasan.dor_dam.databinding.ActivityMainBinding

private const val TAG = "MainActivity"

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    override fun onBackPressed() {
        Log.d(TAG, "onBackPressed: pressed ")
            val pageCount = supportFragmentManager.backStackEntryCount
            if (pageCount == 0) {
                Log.d(TAG, "onBackPressed: enter ")
                finish()
            }else{
                supportFragmentManager.popBackStack()
            }
    }
}