package com.example.world_cup_results.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.example.world_cup_results.R
import com.example.world_cup_results.databinding.ActivitySearchBinding

class SearchActivity : BaseActivity<ActivitySearchBinding>() {
    override val LOG_TAG: String = "SEARCH_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivitySearchBinding= ActivitySearchBinding::inflate

    override fun setup() {

    }

    override fun addCallBacks() {

    }


}