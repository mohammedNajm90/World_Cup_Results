package com.example.world_cup_results.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import com.example.world_cup_results.R
import com.example.world_cup_results.data.DataManger
import com.example.world_cup_results.data.domain.Match
import com.example.world_cup_results.databinding.ActivityMainBinding
import com.example.world_cup_results.util.CsvParser
import java.io.BufferedInputStream
import java.io.BufferedReader
import java.io.InputStreamReader

class MainActivity : BaseActivity<ActivityMainBinding>() {

    override val LOG_TAG: String="MAIN_ACTIVITY"
    override val bindingInflater: (LayoutInflater) -> ActivityMainBinding= ActivityMainBinding::inflate

    override fun setup() {
        parseFile()
    }

    override fun addCallBacks() {
        binding?.apply {
            next.setOnClickListener{
                bindMatch(DataManger.getNextMatch())
            }
            pervious.setOnClickListener{
                bindMatch(DataManger.getPreviousMatch())
            }
        }
    }
    private fun bindMatch(match: Match){
        binding?.apply {
            year.text = match.year.toString()
            homeTeamName.text  = match.homeTeamName
            homeTeamGoals.text = match.homeTeamGoals.toString()
            awayTeamName.text  = match.awayTeamName
            awayTeamGoals.text = match.awayTeamGoals.toString()
            staduim1.text = match.staduim.toString()

        }

    }
    private fun parseFile() {
        val inputStream = assets.open("worldcup.csv")
        var parser = CsvParser()
        var buffer = BufferedReader(InputStreamReader(inputStream))
        buffer.forEachLine {
            val currentMatch = parser.parse(it)
            log(currentMatch)
            DataManger.addMatch(currentMatch)

        }
        bindMatch(DataManger.getCurrentMatch())
    }


}