package com.example.world_cup_results.data.domain

data class Match(
    val year:Int,
    val staduim:String,
    val city:String,
    val homeTeamName:String,
    val awayTeamName:String,
    val homeTeamGoals:Int,
    val awayTeamGoals:Int
) {
}