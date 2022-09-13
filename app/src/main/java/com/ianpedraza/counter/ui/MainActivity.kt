package com.ianpedraza.counter.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.ianpedraza.counter.databinding.ActivityMainBinding
import com.ianpedraza.counter.utils.viewBinding

class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    private var count: Int = 0

    companion object {
        private const val TAG = "MainActivity"
        private const val KEY_COUNT = "KEY_COUNT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        Log.i(TAG, "onCreate")

        if (savedInstanceState != null) {
            count = savedInstanceState.getInt(KEY_COUNT, 0)
            updateCount()
        }

        binding.fabIncrement.setOnClickListener {
            count++
            updateCount()
        }
    }

    private fun updateCount() {
        binding.tvCount.text = count.toString()
    }

    override fun onSaveInstanceState(outState: Bundle) {
        Log.i(TAG, "onSaveInstanceState")
        outState.putInt(KEY_COUNT, count)
        super.onSaveInstanceState(outState)
    }

    override fun onStart() {
        super.onStart()
        Log.i(TAG, "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i(TAG, "onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.i(TAG, "onRestart")
    }

    override fun onPause() {
        super.onPause()
        Log.i(TAG, "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i(TAG, "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i(TAG, "onDestroy")
    }

}