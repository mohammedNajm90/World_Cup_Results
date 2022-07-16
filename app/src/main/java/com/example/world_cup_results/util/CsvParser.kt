package com.example.world_cup_results.util

import com.example.world_cup_results.data.domain.Match

class CsvParser {
    fun parse(line:String):Match{
        val tokens = line.split(",")
        return Match(
            year = tokens[Constants.colNumber.YEAR].toInt(),
            staduim = tokens[Constants.colNumber.STADUIM],
            city = tokens[Constants.colNumber.CITY],
            homeTeamName = tokens[Constants.colNumber.HOME_TEAM_NAME],
            awayTeamName = tokens[Constants.colNumber.AWAY_TEAM_NAME],
            homeTeamGoals = tokens[Constants.colNumber.HOME_TEAM_GOALS].toInt(),
            awayTeamGoals = tokens[Constants.colNumber.AWAY_TEAM_GOALS].toInt()
        )
    }
}